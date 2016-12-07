/**
 * @author Ruben Chavez
 * @author Sam Barth
 *
 * last modified 12/6/2016
 *
 * This class represents the information encapsulated in a single order.
 */
package Production;

import java.util.ArrayList;

public class Order {

    String shippingAddress;
    String name;
    ArrayList<String> items;
    /**
     * 
     * @param address String object address of the person who placed the order
     * @param name String object name of the person who placed the order
     * @param items ArrayList<String> of the items in the order
     */
    public Order(String address, String name, ArrayList<String> items) {

        this.name = name;
        this.shippingAddress = address;
        this.items = items;

    }
    /**
     * 
     * @return returns an ArrayList<String> containing the items in the Order.
     */
    public ArrayList<String> getItems(){
        return this.items;
    }
    /**
     * 
     * @return returns an int representing the number of items in the order.
     */
    public int getOrderSize(){
        return this.items.size();
    }
    /**
     * 
     * @return returns the shipping address of the order
     */
    public String getShippingAddress() {
        return this.shippingAddress;
    }
    /**
     * 
     * @return returns the name associated with the order
     */
    public String getName(){
        return this.name;
    }
}