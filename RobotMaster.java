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

package oct31;

import java.awt.Point;
import java.util.ArrayList;

// RobotMaster will implement clock interface
public class RobotMaster implements Clock{

    private ArrayList<Robot> robots;
    private boolean lastMissionOrder = false;
    private final int batteryRange = 50;

    //intialize RobotMaster with some starting number of Robots
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
    private boolean robotAvailable(){
        for (Robot r : robots){
            if (r.isIdle()){return true;}
        }
        return false;
    }
    //getFirstAvailableRobot should only be called if robotAvailable returns true
    private Robot getFirstAvailableRobot(){
    	for (Robot r : robots){
    		if (r.isIdle()){return r;}
    	}
    	else{return Null;}
    }
    public void tick(int i){
        if (!robotAvailable()) {return;}
        if (!lastMissionOrder) {
        	
        }
    }
}
//need to call Order.getNextShelf, which will return Point or Null - same for Inventory
//need to call Order.shelfReady()