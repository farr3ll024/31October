/*
*
* @author: Sam Barth
*
* date last modified: 11/10/2016
*/

package oct31;

import java.awt.Point;
import java.util.ArrayList;

// RobotMaster will implement clock interface
public class RobotMaster implements clock{

    private ArrayList<Robot> robots;

    //intialize RobotMaster with some starting number of Robots
    RobotMaster(int numRobots){
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
    public void deployIdle(String temp){
        boolean robotAvailable = false;
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
    public void tick(){

    }
}
//need to call Order.getNextShelf, which will return Point or Null - same for Inventory
//need to call Order.shelfReady()