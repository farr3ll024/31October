package testpackage;

/**
 *
 * @author barts_000
 * date last modified: 11/30/2016
 * 
 * MockOrders is a class available to anyone who needs to use an Order class
 * method stub for testing.
 */


import java.awt.Point;
import production.Shelf;

public class MockOrders {
    
    public MockOrders(){
        
    }
    /**
     * Get the shelf to be brought to the picker
     *  
     * @return returns a Shelf object containing the next item to be added to the
     * order bin
     */
   
    public Shelf shelfToFetch() {
        Point p = new Point(5,5);
        Shelf s = new Shelf(p);
        return s;
    }
    
}
