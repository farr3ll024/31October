// RobotMaster will implement Timer interface
package RobotPackage;
import java.util.ArrayList

Class RobotMaster implements MockTimer{

    arrayList<Robot> robots;

    //intialize RobotMaster with some starting number of Robots
    RobotMaster(int numRobots){
        this.robots = new arrayList<Robot>(int);
        //the following for loop will individually initialize each robot at a charge location
        for (Robot r : this.robots){
            r= new Robot;
        }
    }



}
