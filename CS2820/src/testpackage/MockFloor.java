package testpackage;

/**
 * 
 * @author Sam Barth
 * date last modified: 11/30/2016
 * 
 * MockFloor is a test class available to anyone who needs to use a Floor method
 * stub
 */


import java.awt.Point;
import java.util.ArrayList;
import production.Shelf;

/**
 *
 * @author barts_000
 */
public class MockFloor {
    
    public MockFloor(){
        
    }
    /**
     * getPicker stub that instantiates a Point object and returns it
     * 
     * @return returns a Point object simulating the location of the the picker
     * on the Floor
     */
    public Point getPicker(){
        Point picker = new Point(14, 0);
        return picker;
    }
    /**
     * getReceiving stub that instantiates a Point object and returns it
     * 
     * @return returns a Point object simulating the location of the the receiving
     * dock on the Floor
     */
    public Point getReceiving(){
        Point receiving = new Point(0,15);
        return receiving;
    }
    public ArrayList<Shelf> getShelf(){
        ArrayList<Shelf> a = new ArrayList<>();
        for (int i = 1 ; i < 11 ; i++ ){
            Point p = new Point(i, i);
            Shelf s = new Shelf(p);
            a.add(s);
        }
        return a;
    }
    
}
