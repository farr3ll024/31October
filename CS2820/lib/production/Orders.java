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

    public Orders(Inventory i) {
        
        this.i = i;
        
    }
    public Order getNextOrder(){
        return this.ordersQueue.removeFirst();
    }
    public Shelf shelfToFetch(){
        
        Order currentOrder = ordersQueue.peekFirst();
        if (currentOrder.orderStackEmpty()) {
            ordersQueue.removeFirst();
            //tell the picker to do something
            return shelfToFetch();
        }
        Point dummyPoint = new Point(0, 0);
        Shelf dummyShelf = new Shelf(dummyPoint);
        return dummyShelf;
    }
    
    @Override
    public void doc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

