/**
 * @author Ruben Chavez
 * @author Sam Barth
 *
 * last modified 12/7/2016
 *
 * This will get item and shelf numbers for the items in the list of items from
 * inventory; It will give the Robot a shelf number to bring the
 * picker,fetchItem(); pick and add it to the bin, and tell the Robot that the
 * shelf is ready to be taken away. Tell the belt that the bin is ready.
 *
 */
package production;

import java.util.ArrayList;
import java.util.Stack;

public class Orders implements Clock, Document {

    //String buyerName;
    String shippingAddress;
    //int itemNumber;
    //int priorityValue;
    int shelfNumber;
    public ArrayList<String> orderItems = new ArrayList<String>();
    public ArrayList<Integer> orderNumbers = new ArrayList<Integer>();
    public static ArrayList<String> orderBin = new ArrayList<String>();
    public ArrayList<Integer> shelfNumbers = new ArrayList<Integer>();
    public static Boolean binFilled = false;
    public Boolean shelfReady = false;
	public Boolean shelfPicked = false;

    private Floor f;
    private Inventory i;
    private Stack<Order> ordersStack;
    private Bin currentBin;

    public Orders(Inventory i, Floor f) {

        //this.buyerName = name;
        //this.shippingAddress = address;
        //this.itemNumber = item;
        //this.priorityValue = priority;
        //this.shelfNumber = shelf;
        /*
        //create list of items
        for (String item : items) {
            this.orderItems.add(item);
        }

        //this.orderItems = items;
        int orderLength = items.size();
         */
        this.f = f;
        this.i = i;
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

    public Point shelfToFetch() {
        Order currentOrder = ordersStack.peek();
        if (currentOrder.orderStackEmpty()) {
            ordersStack.pop();
            //tell the picker to do something
            return shelfToFetch();
        }
        Point dummyPoint = new Point(0, 0);
        return dummyPoint;
    }

    //shelfReady = True means the robot has retrieved the shelf and it is ready to be picked
	//shelfReady = False means the robot has yet to retrieve the shelf. 
    public Boolean shelfReady() {
        return shelfReady;
    }
	
	//shelfPicked = True means it has been picked
	public Boolean shelfPicked(){
		return shelfPicked;
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
    public int getShelfNumber() {
        //return itemNumber.shelfNumber;
        return shelfNumber;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    @Override
    public void tick(int iteration) {
		if 
		
		if (binFilled == false){
			for(string item in Order.getItems)
		}
    }

    @Override
    public void doc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
/*private static ArrayList<String> shippingAddressList = new ArrayList<String>();
		string addressNumber = order.mailingAddress;*/
//}*/
