package Production;

import java.util.ArrayList;

/*public class Order {
	 
	 public static ArrayList<String> OrderItem = new ArrayList();
	 
 
	  
	  String address;
	  OrderItem[] orderitems;
	  boolean isFilled;
	  /**
	   * @author Ted Herman
	   * @param addr is a shipping address for the order
	   * @param items is an array of OrderItem objects
 */
 /*public Order(String addr,OrderItem[] items) {
		address = addr;
		orderitems = items;
		isFilled = false;
	    }
	  }

 */

 /* @author Ruben Chavez
 * 
 * last modified 11-14-16
 * @param String shipping address, ArrayList<String> of items ordered;
 * 
 * This will get item and shelf numbers for the items in the list of items from inventory;
 * It will give the Robot a shelf number to bring the picker,fetchItem();
 * pick and add it to the bin,
 * and tell the Robot that the shelf is ready to be taken away.  
 * Tell the belt that the bin is ready. 
 * 
 *  
 * 
 * 
 * 
 */
public class Orders implements Clock, Document {

    //String buyerName;
    String shippingAddress;
    //int itemNumber;
    //int priorityValue;
    int shelfNumber;
    public ArrayList<String> orderItems = new ArrayList<String>();
    public ArrayList<Integer> orderNumbers = new ArrayList<Integer>();
    public ArrayList<String> orderBin = new ArrayList<String>();
    public ArrayList<Integer> shelfNumbers = new ArrayList<Integer>();
    public Boolean binFilled = false;
    public Boolean shelfReady = false;

    public Orders(String address, ArrayList<String> items) {

        //this.buyerName = name;
        this.shippingAddress = address;
        //this.itemNumber = item;
        //this.priorityValue = priority;
        //this.shelfNumber = shelf;

        //create list of items
        for (String item : items) {
            this.orderItems.add(item);
        }

        //this.orderItems = items;
        int orderLength = items.size();
    }

    public ArrayList<Integer> getItemInfo() {
        for (String item : orderItems) {
            // will get the item numbers for each item
            //orderNumbers.add(Inventory.item.itemNumber);  Need a callable inventory list
            //shelfNumbers.add(Inventory.item.shelfNumber);
        }
        return null;
    }

    //add item to bin and set shelfReady to true so Robot can pick it up
    public void addToBin(String item) {
        if (shelfReady == false) {
            orderBin.add(item);
        }
        shelfReady = true;
    }

    //shelfReady = True means it has been picked
    public Boolean shelfReady() {
        return shelfReady;
    }

    public Boolean binFilled() {
        if (orderBin.size() == orderItems.size()) {
            binFilled = true;
        } else {
            binFilled = false;
        }

        return binFilled;
    }

    /*int getValue(){
		//return InventoryList.shippingValue;
		return priorityValue;
	}*/
 /*int getItemNumber(){
		//return InventoryList.itemNumber;
		return itemNumber;
	
	}*/
    int getShelfNumber() {
        //return itemNumber.shelfNumber;
        return shelfNumber;
    }

    String getShippingAddress() {
        return shippingAddress;
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
/*private static ArrayList<String> shippingAddressList = new ArrayList<String>();
		string addressNumber = order.mailingAddress;*/
//}*/

