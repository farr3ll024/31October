package production;

/**
 *
 * @author Ming Cheng
 *
 */
//Need to use the List.txt
import java.awt.Point;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory implements Clock, Document {

    boolean isExist; //variable to check whether item exist or not
    //boolean isInList;
    int amount; // the amount of item
    List<Map<String, Object>> inventory = new ArrayList<>();
    Map<Integer, Integer> shelf = new HashMap<>(); // shelf and its remaining capacity
    Map<String, Integer> ItemShelf;

    int ShelfCapacity = 50;

    // Constructor
    /**
     *
     * @param inventory
     */
    public Inventory(List inventory) {
        this.ItemShelf = new HashMap<>();
        this.inventory = inventory;
    }

    // Read file and add data of the file to ArrayList
    /**
     * @param nothing
     */
    public void data() {

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("/Users/macbook_user/Desktop/OOP Project/List.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        String[] columnName
                = {"Id", "Name", "Amount", "Shelf#", "Position"};
        int i, index;
        String line;
        try {
            br.readLine();
            while ((line = br.readLine()) != null) {
                index = 0;
                String[] se = line.split(" ");
                Map<String, Object> item = new HashMap<>();
                for (i = 0; i < se.length; i++) {
                    if ("".equals(se[i])) {
                        continue;
                    }
                    if (index >= columnName.length) {
                        continue;
                    }
                    item.put(columnName[index], se[i]);
                    index++;
                }

                //get the amount of the item from the list
                int amount = Integer.parseInt((String) item
                        .get(columnName[2]));

                // if amount greater than 0, Existence is Y, else N
                if (amount > 0) {
                    item.put("Existence", "Y");
                } else {
                    item.put("Existence", "N");
                }

                inventory.add(item);// add item to ArrayList
            }
            br.close();

            outPutFile();
        } catch (IOException e) {
        }

    }

    //remove items from list, if item is not on the list yet, print not available
    //If item on the list, but the amount is not enough, print not enough
    /**
     * @param itemName, the name of the item that we want to remove from the
     * list
     * @param Qty, the number of items that we wants to remove
     */
    public void removeItem(String itemName, int Qty) {
        if (checkExist(itemName, Qty) == true) {
            int i;
            //System.out.println(checkExist(itemName));
            for (i = 0; i < inventory.size(); i++) {
                Map<String, Object> removedItem = new HashMap<>();
                removedItem = inventory.get(i);

                if (itemName.equals(removedItem.get("Name").toString())) {
                    int a = Integer.parseInt((String) removedItem.get("Amount"));
                    removedItem.put("Amount", a - Qty);

                    if (a - Qty < 1) {
                        removedItem.put("Existence", "N");
                    }
                }
            }
        } else {
            System.out.println("Item " + itemName + " is not available.");
            for (int i = 0; i < inventory.size(); i++) {
                Map<String, Object> removedItem = new HashMap<>();
                removedItem = inventory.get(i);

                if (itemName.equals(removedItem.get("Name").toString())) {
                    System.out.println("Since item " + itemName + "'s amout is not enough, try less amount.");
                }
            }
        }
        outPutFile();
    }

    //read the remaining capacity of shelves
    public Map<Integer, Integer> readCapacity() {
        int shelfId;
        int i;
        int amount;
        int countshelf = 0;

        for (shelfId = 1; shelfId < inventory.size(); shelfId++) {
            amount = 0;
            for (i = 0; i < inventory.size(); i++) {
                Map<String, Object> Item = new HashMap<>();
                Item = inventory.get(i);
                String x = Item.get("Shelf#").toString();
                int y = Integer.parseInt(x);
                if (shelfId == y) {
                    amount += Integer.parseInt(Item.get("Amount").toString());
                }
            }
            if (amount != 0) {
                countshelf += 1;
                shelf.put(countshelf, ShelfCapacity - amount);
            }
        }

        //System.out.println(shelf);
        return shelf;
    }

    //read the list and get which item is in which shelf, return a HashMap which the key is item name, and the value is shelf#
    public Map<String, Integer> itemShelf() {
        int i;
        for (i = 0; i < inventory.size(); i++) {
            Map<String, Object> Item = new HashMap<>();
            Item = inventory.get(i);
            String itemname = Item.get("Name").toString();
            String x = Item.get("Shelf#").toString();
            int y = Integer.parseInt(x);
            ItemShelf.put(itemname, y);
        }
        //System.out.println(ItemShelf);
        return ItemShelf;
    }

    //add items to the list
    //Variable InList is used to check whether the item is already in list or not
    //if already in list, when we add item, we just need to update the amount of the item
    //if not in list, we need to create a new line in the list
    /**
     * @param itemName, the name of the item that we want to add into the list
     * @param Qty, the number of items that we wants to add
     */
    public void addItem(String itemName, int Qty) {
        boolean InList = false;
        int i;
        int max = 0;

        List<Map<String, Object>> listb = new ArrayList<>();

        Inventory test = new Inventory(listb);
        test.data();

        for (Map.Entry<Integer, Integer> m : test.readCapacity().entrySet()) {
            if (max < m.getValue()) {
                max = m.getValue();
            }
        }
        //System.out.println(max);

        //get the ID of the last shelf
        int lastshelfID = test.readCapacity().entrySet().size();
        //System.out.println(lastshelfID);

        //get the ID of the shelf which has the max remaining capacity
        int keys = 0;
        for (Map.Entry<Integer, Integer> m : test.readCapacity().entrySet()) {
            if (max == m.getValue()) {
                keys = m.getKey();
            }
        }
        //System.out.println(keys);

        for (i = 0; i < inventory.size(); i++) {
            Map<String, Object> newItem = new HashMap<>();
            newItem = inventory.get(i);

            //if item is already in the list
            if (itemName.equals(newItem.get("Name").toString())) {
                int a = Integer.parseInt((String) newItem
                        .get("Amount"));
                newItem.put("Amount", a + Qty);
                newItem.put("Existence", "Y");
                InList = true;
            }
        }

        //if item not in list yet
        if (InList == false) {
            Map<String, Object> newItem = new HashMap<>();
            newItem.put("Id", i + 1);
            newItem.put("Name", itemName);
            newItem.put("Amount", Qty);
            newItem.put("Existence", "Y");
            if (Qty <= max) {
                newItem.put("Shelf#", keys);
            } else {
                newItem.put("Shelf#", lastshelfID + 1);
            }
            inventory.add(newItem);
        }
        outPutFile();

    }

    //output the file
    /**
     * @param nothing
     */
    public void outPutFile() {
        try {
            PrintWriter pw = new PrintWriter(new File("/Users/macbook_user/Desktop/OOP Project/List1.txt"));
            pw.println("Id\tName\tAmount\tShelf#\tPosition\tExistence");
            String[] columnName = {"Id", "Name", "Amount", "Shelf#", "Position", "Existence"};
            int cIndex;
            for (int i = 0; i < inventory.size(); i++) {
                Map<String, Object> st = inventory.get(i);
                cIndex = 0;
                pw.println(st.get(columnName[cIndex + 1]) + "\t"
                        + st.get(columnName[cIndex + 1]) + "\t"
                        + st.get(columnName[cIndex + 1]) + "\t"
                        + st.get(columnName[cIndex + 1]) + "\t"
                        + st.get(columnName[cIndex + 1]) + "\t" + "\t"
                        + st.get(columnName[cIndex + 1]));
            }
            pw.flush();
            pw.close();

        } catch (IOException e) {
        }
    }

    //check whether the number of item exist or not
    //if the amount of item is lease than Qty, then item is not exist
    //if item is not in the list, then item is not exist
    /**
     * @param itemName, the name of the item that we want to check whether exist
     * or not
     * @param Qty, the number of items that we wants to check
     * @return
     */
    public boolean checkExist(String itemName, int Qty) {

        for (int i = 0; i < inventory.size(); i++) {
            Map<String, Object> newItem = new HashMap<>();
            newItem = inventory.get(i);
            if (itemName.equals(newItem.get("Name").toString())) {
                int a = Integer.parseInt((String) newItem.get("Amount"));
                //isInList = true;
                if (a >= Qty) {
                    isExist = true;
                    break;
                } else {
                    isExist = false;
                }
            } else {
                isExist = false;
            }

        }
        return isExist;

    }

    //read the position of item, and output it as a point
    /**
     * @param itemName, the name of the item that we want to know its postion
     * @return
     */
    public Point readPosition(String itemName) {
        int i;
        String pos = "";
        for (i = 0; i < inventory.size(); i++) {
            Map<String, Object> newItem = new HashMap<>();
            newItem = inventory.get(i);
            if (itemName.equals(newItem.get("Name").toString())) {
                pos = newItem.get("Position").toString();
            }
        }

        String sx = (pos.split(","))[0];
        String sy = (pos.split(","))[1];

        sx = sx.substring(1, sx.length());
        sy = sy.substring(0, sy.length() - 1);

        //transfer string to int
        int row = Integer.parseInt(sx);
        int col = Integer.parseInt(sy);

        //System.out.println(x);
        //System.out.println(y);
        Point a = new Point();
        a.x = row;
        a.y = col;
        //System.out.println(a);
        return a;

    }

    public static void main(String[] args) {

        List<Map<String, Object>> listA = new ArrayList<>();
        /*add code here to read file and insert the item in to listA*/

        Inventory a = new Inventory(listA);
        a.data();
        //a.checkExist("K");
        a.addItem("L", 41);
        /*
	    a.itemShelf();
	    a.addItem("H",4);
	    a.addItem("A",5);
	    a.addItem("F",10);
	    a.addItem("r",10);
	    a.removeItem("K", 20);
	    a.readPosition("J");
	    a.removeItem("V", 3);*/

        //a.readShelf();
    }

    @Override
    public void tick(int iteration) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
