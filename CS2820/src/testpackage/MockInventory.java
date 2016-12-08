package testpackage;

/**
 *
 * @author barts_000
 * date last modified: 11/30/2016
 * 
 * MockInventory is a class available to anyone who needs method stubs from the
 * Inventory class for the purpose of testing.
 */



import java.awt.Point;
import production.Shelf;


public class MockInventory {
    
    public MockInventory(){
        
    }
    /**
     * Get the shelf to be brought to the receiving dock
     *  
     * @return returns a Shelf object that has room for an inventory item to be
     * stocked
     */
   
    public Shelf shelfToFetch() {
        Point p = new Point(5,5);
        Shelf s = new Shelf(p);
        return s;
    }
    
}
