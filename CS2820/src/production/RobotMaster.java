/**
 *
 * @author: Sam Barth
 *
 * date last modified: 11/30/2016
 *
 * The RobotMaster class acts as the go-between for the Robots and
 * the other parts of the warehouse.  After each tick, the RobotMaster
 * will check whether there is an available idle Robot, and if so,
 * send that Robot on a mission by making calls to either Inventory
 * or Orders.
 */
package production;

import java.awt.Point;
import java.util.ArrayList;

import testpackage.*;

// RobotMaster will implement clock interface
public class RobotMaster implements Clock, Document {

    private ArrayList<Robot> robots;
    private final int batteryRange = 50;
    private final static Point VOIDLOCATION = new Point(-1, -1);
    private boolean lastDeployedOrder;
    private MockFloor f;

    /**
     *
     * @param numRobots the number of robots that will be used in the simulation
     * (RobotMaster currently only supports 1 robot)
     * @param f is the instance of the Floor that Master will use in conjunction
     * with this instance of RobotMaster
     * @param o is the instance of the Orders that Master will use in
     * conjunction with this instance of RobotMaster
     * @param i is the instance of the Inventory that Master will use in
     * conjunction with this instance of RobotMaster
     */
    public RobotMaster(int numRobots, MockFloor f, MockInventory i) {
        this.robots = new ArrayList<>(numRobots);
        this.lastDeployedOrder = false;
        //the following for loop will individually initialize each robot at a charge location
        int j = 0;
        for (Robot r : this.robots) {
            Point start = new Point(0, j);
            r = new Robot(start, f);
            this.robots.add(r);
            j++;
        }
    }

    /**
     * The precondition for calling this method is that Robot r is idle
     *
     * @param r Robot r is an idle Robot in the simulation
     */
    private void deploy(Robot r) {
        if (this.lastDeployedOrder) {
            this.lastDeployedOrder = false;
            r.assignMission("Stock", VOIDLOCATION); //fill in Inventory.getShelfLocation()
        } else {
            r.assignMission("Order", VOIDLOCATION); //fill in Inventory.getShelfLocation()
        }
    }

    public ArrayList getRobotLocations() {
        ArrayList<Point> robotLocations = new ArrayList<>();
        for (Robot r : robots) {
            Point location = new Point(r.getLocation());
            robotLocations.add(location);
        }
        return robotLocations;
    }

    /**
     * Increment time by one position. Robots deployed on missions may move a
     * maximum of one unit per tick.
     *
     * @param i The cumulative tick number of the simulation
     *
     */
    @Override
    public void tick(int i) {
        /**
         * robots currently on missions should continue those missions, and idle
         * robots should be deployed
         */
        for (Robot r : robots) {
            if (!r.isIdle()) {
                r.move(false);
            } else {
                deploy(r);
            }
        }
    }

    /**
     * Document movement of Robots on the Floor
     */
    @Override
    public void doc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
//need to call Order.getNextShelf, which will return Point or Null - same for Inventory
//need to call Order.shelfReady()
