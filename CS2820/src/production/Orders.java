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

import java.awt.Point;
import java.util.ArrayList;
import java.util.LinkedList;

public class Orders implements Document {

    private Inventory i;
    private LinkedList<Order> ordersQueue;
    public Boolean shelfReady = false;
    public String nextItem;

    public Orders(Inventory i) {
        
        this.i = i;
        OrderGenerator g = new OrderGenerator();
        for (int j = 0 ; j < 10 ; j++){
            this.ordersQueue.add(g.getOrder());
        }
        
    }
    public Shelf shelfToFetch(){
        
        Order currentOrder = ordersQueue.peekFirst();
        if (currentOrder.orderStackEmpty()) {
            ordersQueue.removeFirst();
            //tell the picker to do something
            return shelfToFetch();
        }
        this.nextItem = currentOrder.getNextItemInOrder();
        Shelf s = i.findShelf(nextItem);
        return s;
    }
    public Order getOrder(){
        return this.ordersQueue.peek();
    }
    public String getItem(){
        return this.nextItem; 
    }
    @Override
    public void doc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

