/**
 *
 * @author Sam Barth
 * date last modified: 12/6/2016
 * 
 * The shelf class will aggregate up to some maximum capacity of items (represented
 * as String objects). 
 */

package Production;

import java.awt.Point;
import java.util.HashMap;

public class Shelf {
    
    private final Point base;
    private HashMap<String,Integer> items;
    private static final int SHELFCAPACITY = 10;
    /**
     * @param p Point object that will be the home-base of the initialized shelf
     */
    public Shelf(Point p){
        this.base = p;
    }
    /**
     * 
     * @return returns a new Point object with the same x- and y- locations
     * as the calling shelf's base.
     */
    public Point getshelfBase(){
        return base.getLocation();
    }
    /**
     * 
     * @return returns the maximum capacity of a shelf object.
     */
    public static int getCapacity(){
        return SHELFCAPACITY;
    }
    /**
     * 
     * @param s the String representing the item to place on the shelf
     * @param quantity the number of items "s" to be placed on the shelf
     * @return returns true if the quantity of item "s" has been added to the
     * shelf and false if adding the quantity of items "s" would cause the shelf
     * to exceed the maximum shelf capacity (note that in this case, the items
     * are NOT added)
     */
    public boolean addItem(String s, int quantity){
        if (quantity + items.size() <= SHELFCAPACITY){
            if (items.containsKey(s)){
                int oldQuantity = items.get(s);
                items.replace(s, oldQuantity + quantity);
                return true;
            }
            else{items.put(s, quantity);
            return true;
            }
        }
        else{return false;}
    }
    /**
     * 
     * @param s is the String representation of the item to be removed
     * @return returns true if the item is successfully removed, and false if 
     * there are no items of the requested type to remove
     */
    public boolean removeItem(String s){
        if (items.containsKey(s)) {return false;}
        else{
            int oldQuantity = items.get(s);
            items.replace(s, oldQuantity - 1);
            if (items.get(s) == 0){
                items.remove(s);
            }
            return true;
        }
    }
    /**
     * 
     * @param s the String representing the item searched for
     * @return returns true if the item is found on the shelf, and false otherwise.
     */
    public boolean containsItem(String s){
        if (items.containsKey(s)) {return true;}
        else{return false;}
    }
    
}
