/**
*
* @author: Sam Barth
*
* date last modified: 11/26/2016
* 
* The RobotMaster class acts as the go-between for the Robots and
* the other parts of the warehouse.  After each tick, the RobotMaster
* will check whether there is an available idle Robot, and if so,
* send that Robot on a mission by making calls to either Inventory
* or Orders.
*/

package Production;

import java.awt.Point;
import java.util.ArrayList;

// RobotMaster will implement clock interface
public class RobotMaster implements Clock, Document {

    private ArrayList<Robot> robots;
    private final int batteryRange = 50;
    private final static Point VOIDLOCATION = new Point(-1, -1);
    private final static Robot VOIDROBOT = new Robot(VOIDLOCATION);
    private boolean lastDeployedOrder;

    /**
     * 
     * @param numRobots the number of robots that will be used in the simulation
     * (RobotMaster currently only supports 1 robot)
     */
    public RobotMaster(int numRobots){
        this.robots = new ArrayList<>(numRobots);
        this.lastDeployedOrder = false;
        //the following for loop will individually initialize each robot at a charge location
        int i = 0;
        for (Robot r : this.robots){
            Point start = new Point(0, i);
            r = new Robot(start);
            this.robots.add(r);
            i++;
        }
    }
    /**
     * The precondition for calling this method is that there is some available Robot
     */
    private void deploy(Robot r){
        if (this.lastDeployedOrder){
            r.assignMission("Stock", VOIDLOCATION); //fill in Inventory.getShelfLocation()
        }
        else{
            r.assignMission("Order", VOIDLOCATION); //fill in Inventory.getShelfLocation()
        }
    }
    /**
     * 
     * @param i The cumulative tick number of the simulation
     * 
     */
    @Override
    public void tick(int i){
        /**
         * robots currently on missions should continue those missions, and
         * idle robots should be deployed
        */ 
    	for (Robot r : robots) {
            if (!r.isIdle()){
                r.move();
            }
            else{
                deploy(r);
            }
    	}
    }

    @Override
    public void doc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
//need to call Order.getNextShelf, which will return Point or Null - same for Inventory
//need to call Order.shelfReady()