//import java.util.ArrayList;

/* Sample Order:
 * Name:				Ruben Chavez
 * 
 * Mailing Address:		123 Java Street
 * 						Iowa City, Iowa 52240
 * 
 * Item: 				Cell Phone Case
 * 
 * Delivery Method chosen: 	Next Day Air
 * Delivery Method Options: Next Day Air - priority value = 1
 * 							2 Day shipping - priority value = 2
 * 							standard 3-5 day - priority value 3
 * 
 * 
 */



package oct31;
public class Orders {

	
	String buyerName;
	String shippingAddress;
	int itemNumber;
	int priorityValue;
	int shelfNumber;
	
    public Orders(String name, String address, int item, int priority, int shelf) {
		
		this.buyerName = name;
		this.shippingAddress = address;
		this.itemNumber = item;
		this.priorityValue = priority;
		this.shelfNumber = shelf;
	}
	
	int getValue(){
		//return InventoryList.shippingValue;
		return priorityValue;
	}
	
	int getItemNumber(){
		//return InventoryList.itemNumber;
		return itemNumber;
	
	}
	
	int getShelfNumber(){
		//return itemNumber.shelfNumber;
		return shelfNumber;
	}
	
	String getShippingAddress(){
		return shippingAddress;
	}
	
	/*private static ArrayList<String> shippingAddressList = new ArrayList<String>();
		string addressNumber = order.mailingAddress;*/
}
