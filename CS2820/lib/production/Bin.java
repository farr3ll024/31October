/**
 *
 * @author Sam Barth
 * date last modified: 12/6/2016
 */
package production;

import java.awt.Point;
import java.util.ArrayList;

public class Bin {

    private static final int BINCAPACITY = 100;
    private ArrayList<String> items;
    private Point binLocation;
    private Order binOrder;

    public Bin(Order o) {
        this.binOrder = o;
    }

    /**
     *
     * @param s The string representation of the item to be added to the bin
     * @return returns true when item was successfully added, and false if the
     * bin is full and the item was not added.
     */
    public boolean addItem(String s) {
        if (!this.binFull()) {
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
    public boolean binFull() {
        if (items.size() == BINCAPACITY) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @return returns an ArrayList of the current contents of the Bin
     */
    public ArrayList<String> getContents() {
        ArrayList<String> temp = new ArrayList<>();
        for (String s : this.items) {
            temp.add(s);
        }
        return temp;
    }

    /**
     *
     * @return returns the Order object corresponding to this bin
     */
    public Order getBinOrder() {
        return this.binOrder;
    }

    /**
     *
     * @return returns the position on the floor of the bin in the form of a
     * Point object.
     */
    public Point getBinLocation() {
        Point p = new Point(this.binLocation);
        return p;
    }

    /**
     *
     * @param x the new x location of the bin
     * @param y the new y location of the bin
     */
    public void moveBin(int x, int y) {
        this.binLocation.move(x, y);
    }
}
