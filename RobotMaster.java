// RobotMaster will implement Timer interface
package RobotPackage;
import java.util.ArrayList

Class RobotMaster implements MockTimer{

    ArrayList<Robot> robots;

    //intialize RobotMaster with some starting number of Robots
    RobotMaster(int numRobots){
        this.robots = new ArrayList<Robot>(int);
        //the following for loop will individually initialize each robot at a charge location
        for (Robot r : this.robots){
            r= new Robot;
            this.robots.add(r);
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


}
