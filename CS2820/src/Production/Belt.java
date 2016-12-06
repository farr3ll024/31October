package Production;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: Michael Gibler
 *
 * Date last modified: 11/14/2016
 *
 * The belt class creates an array of size 14, which is the java representation
 * of a conveyor belt. Item's can then be placed on the belt through the addItem
 * method. The belt is then moved by the beltButton method. Each time the
 * "button" is pressed, all items are moved right by one space, i.e. one spot
 * further in the array. There are a couple boolean variables to tell methods
 * when the belt is moving vs when it isn't. This helps to prevent items from
 * being lost or deleted during the running of the code.
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
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
