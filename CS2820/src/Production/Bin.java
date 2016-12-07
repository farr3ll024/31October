/**
 *
 * @author Sam Barth
 * date last modified: 12/6/2016
 */

package Production;

import java.util.ArrayList;
import testpackage.MockFloor;

public class Bin {
    
    private static final int BINCAPACITY = 100;
    private ArrayList<String> items;
    private Point binLocation;
    
    public Bin(){
    }
    /**
     * 
     * @param s The string representation of the item to be added to the bin
     * @return returns true when item was successfully added, and false if the bin
     * is full and the item was not added.
     */
    public boolean addItem(String s){
        if (!this.binFull()){
            this.items.add(s);
            return true;
        }
        return false;
    }
    /**
     * 
     * @return returns true when the number of items in the bin is strictly less
     * than the capacity of the bin and true when the number of items in the bin
     * is equal to the bin capacity.
     */
    public boolean binFull(){
        if(items.size() == BINCAPACITY){return true;}
        else{return false;}
    }
    
}
