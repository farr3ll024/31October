/**
*
* @author: Sam Barth
*
* date last modified: 11/14/2016
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
public class RobotMaster implements Clock{

    private ArrayList<Robot> robots;
    private final int batteryRange = 50;

    /**
     * 
     * @param numRobots the number of robots that will be used in the simulation
     * (RobotMaster currently only supports 1 robot)
     */
    public RobotMaster(int numRobots){
        this.robots = new ArrayList<Robot>(numRobots);
        //the following for loop will individually initialize each robot at a charge location
        int i = 0;
        for (Robot r : this.robots){
            r = new Robot(0, i);
            this.robots.add(r);
            i++;
        }
    }
    //the instuctions for the Robot will be passed to deployIdle
    /*
    private void deployIdle(String temp){
        Robot availableRobot;
        for (Robot r : this.robots){
            if (r.isIdle()){
                robotAvailable = true;
                availableRobot = r;
                break;
            }
        //here we'd like to give Robot "availableRobot" specific instructions
        //about how to complete its mission
        }
    }
    */
    public boolean robotAvailable(){
        for (Robot r : robots){
            if (r.isIdle()){return true;}
        }
        return false;
    }
    //Precondition: robotAvailable() returns "true"
    private Robot getFirstAvailableRobot(){
    	for (Robot r : robots){
    		if (r.isIdle()){return r;}
    	}
    	Robot placeHolder = new Robot(0,0);
    	return placeHolder;
    }
    /**
     * @param i The cumulative tick number of the simulation
     */
    public void tick(int i){
    	//first, we'll need to tell robots currently on missions to continue those missions
    	for (Robot r : robots) {
    		if (!r.isIdle()){
    			//tell robot to continue mission
    		}
    	}
    	//we can end early if there are no available robots
        if (!robotAvailable()) {return;}
        //if there are available robots, we'll need to check for Orders
        //or stock missinos from Inventory
    }
}
//need to call Order.getNextShelf, which will return Point or Null - same for Inventory
//need to call Order.shelfReady()