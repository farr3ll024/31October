package production;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: Michael Gibler
 *
 * Date last modified: 12/6/2016
 *
 * The belt class creates a hashmap of variable size, which is the java
 * representation of a conveyor belt. The size is given to the belt class
 * through the master class. Item's can then be placed on the belt through the
 * addItem method. The belt moves one space every tick, represented in the code
 * by assigned each hashmap value to the next key (i.e the value at key = 0 is
 * reassigned with key = 1. This is done from the end of the belt to the front
 * in order to prevent overwriting anything. Once the reassignment reaches the
 * first spot in the hashmap, the program checks the Order class to see if a new
 * bin is ready to be added to the belt.
 */
public class Belt implements Clock, Document {

    /*Initializing the HashMap belt*/
    static Map<Integer, ArrayList> belt = new HashMap<Integer, ArrayList>();
    /*Counter variables for constructing and moving respectively*/
    static int i, j;
    /*This is the x variable given by the masterclass decremented by two since there are two open*/
 /*floor squares in the belt's row*/
    static int beltLength;


    /*used for constructing*/
    public static void beltConstructor(int x) {
        beltLength = x - 2;
        /*This will build the belt with a Hashmap. Each key corresponds*/
 /*to a position on the belt, with an arraylist value representing the bin in that location*/
        for (i = 0; i < beltLength; i++) {
            belt.put(i, null);
        }
    }

    /* Ticker method that moves the bins on the belt along each tick, and then checks for new bins*/
    @Override
    public void tick(int iteration) {
        /* This variable j is decreasing from the last belt Key to 1 in order to move the ArrayLists by one*/
        j = beltLength - 1;
        /* Loop to move each ArrayList, starting at the end of the belt*/
        for (j = beltLength - 1; j > 0; j--) {
            belt.put(j, belt.get(j - 1));
        }
        /*Checks the Order Class to see if a bin is ready to be loaded onto belt position 0*/
        if (Orders.binFilled == true) {
            belt.put(0, Orders.orderBin);
            Orders.binFilled = false;
        }
    }

    /* Method to document what the belt is doing and to make sure it is working correctly*/
    @Override
    public void doc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
