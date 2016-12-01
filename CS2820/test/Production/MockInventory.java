/**
 *
 * @author barts_000
 * date last modified: 11/30/2016
 * 
 * MockInventory is a class available to anyone who needs method stubs from the
 * Inventory class for the purpose of testing.
 */

package Production;

import java.awt.Point;


public class MockInventory {
    
    public MockInventory(){
        
    }
    /**
     * Get the Point object location on the Floor of the shelf that will store 
     * the next item received at the receiving dock.
     *  
     * @return returns a Point object simulating the location of a shelf on the
     * Floor
     */
    public Point getShelfLocation(){
        Point p = new Point(5,5);
        return p;
    }
    
}
