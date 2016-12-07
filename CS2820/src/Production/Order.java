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
import java.util.Stack;

public class Order {

    String shippingAddress;
    String name;
    ArrayList<String> items;
    Stack<String> orderStack;
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
        for (String s : this.items){
            this.orderStack.push(s);
        }

    }
    /**
     * 
     * @return if orderStack is not empty, returns String representation of the
     * next item in the order.  If orderStack is empty, returns an empty String.
     */
    public String getNextItemInOrder(){
        if(!orderStack.empty()){return orderStack.pop();}
        else{return "";}
    }
    /**
     * 
     * @return if orderStack is empty, reloadOrderStack will fill the stack with
     * the items in the order and return true.  Otherwise, reloadOrderStack will
     * do nothing to the stack and return false.
     */
    public boolean reloadOrderStack(){
        if(this.orderStack.empty()){
            for (String s : this.items){
                this.orderStack.push(s);
            }
            return true;
        }
        else{return false;}
    }
    /**
     * 
     * @return returns true if the orderStack is empty and false otherwise
     */
    public boolean orderStackEmpty(){
        if(orderStack.empty()){return true;}
        else{return false;}
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