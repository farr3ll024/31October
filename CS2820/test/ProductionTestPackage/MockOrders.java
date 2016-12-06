/**
 *
 * @author barts_000
 * date last modified: 11/30/2016
 * 
 * MockOrders is a class available to anyone who needs to use an Order class
 * method stub for testing.
 */
package ProductionTestPackage;

import java.awt.Point;

public class MockOrders {
    
    public MockOrders(){
        
    }
    /**
     * Get the location of the shelf containing the next item in the order to
     * place on the belt.
     *  
     * @return returns a Point object corresponding to a simulated shelf location
     * somewhere on the Floor.
     */
    public Point getShelfLocation(){
        Point p = new Point(5,5);
        return p;
    }
    
}
