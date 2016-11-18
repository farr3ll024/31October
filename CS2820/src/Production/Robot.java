/**
*
* @author: Sam Barth
*
* date last modified: 11/14/2016
* 
* The Robot class defines the individual robot.  An new instance of Robot
* will have a starting x coordinate "0" and some y coordinate less than
* the number of robots in the warehouse. The location of Robots on the floor
* will utilize Java's Point object.  Robots will always be in one of two
* states: idle (ready to be assigned a mission) or not idle (currently
* performing a mission)
*/

package Production;

import java.awt.Point;

public class Robot{

  private Point chargeLocation;
  private Point location;
  private Point currentDestination;
  private int distanceTraversed = 0;
  private boolean isIdle;
  private boolean shelfCoupled;
  private int coupledShelfID;
  private boolean onMission;

  /**
   * 
   * @param initial location of the starting position of the Robot.  It will be
   * a Point with an X component "0" and a nonzero Y component.
   * 
   */
  public Robot(Point initial){
    double x = initial.getX();
    double y = initial.getY();
    int X = (int) x;
    int Y = (int) y;
    this.location = new Point(X,Y);
    this.isIdle = true;
    this.distanceTraversed = 0;
    this.chargeLocation = new Point(0, Y);
    this.shelfCoupled = false;
    this.onMission = false;
  }
  
  private void move(){
      Point destination = currentDestination;
      if (this.location.equals(this.currentDestination)){
          
          return;
      }
      if (this.getX() != destination.getX()){	  
    	  if (this.getX() < destination.getX()){
    		  this.location.move(this.getX() + 1, this.getY());
    	  }
    	  else {this.location.move(this.getX() - 1, this.getY());}
      }
      else {
    	  if (this.getY() < destination.getY()){
    		  this.location.move(this.getX(), this.getY() + 1);
    	  }
    	  else {this.location.move(this.getY() - 1, this.getX());}
      }
      this.distanceTraversed += 1;
  }  
  public void returnToCharger(){
      this.currentDestination = this.chargeLocation;
  }
  /**
   * @param mission is a String of one of a few possible missions on which a Robot
   * may be sent
   */
  public void assignMission(String mission){
      switch(mission){
          case "O":
              //get shelf location
              //get get picker location
              break;
          case "I":
              //get shelf location
              //get receiving dock location
              break;
          case "C":
              //return to charger
              break;
      }
  }
  /**
   * 
   * @param shelfLocation The unique id corresponding to a shelf on the floor
   */
  public void fetchItem(int shelfLocation){
	  /*
	   * if shelfCoupled, this.move(x.picker, y.picker)
	   * else this.move(x.shelfLocaiton, y.shelfLocation)
	   */
  }
  /**
   * 
   * @param shelfLocation The unique id corresponding to the shelf on the floor
   */
  public void stockItem(int shelfLocation){
	  /*
	   * if not shelfCoupled, this.move(x.shelfLocation, y.shelfLocation)
	   * else this.move(x.receivingDock, y.receivingDock)
	   */
  }
  /**
   * 
   * @return returns a Point object with the same location as the calling robot
   */
  public Point getLocation() {
      return this.location.getLocation();
  }
  /**
   * 
   * @return returns current int x coordinate of the robot
   */
  public int getX(){
    double d = this.location.getX();
    int i = (int) d;
    return i;
  }
  /**
   * 
   * @return returns current int y coordinate of the robot
   */
  public int getY(){
    double d = this.location.getY();
    int i = (int) d;
    return i;
  }
  /**
   * 
   * @return returns int number of tiles moved since last charge
   */
  public int getDistanceTraversed(){
    return distanceTraversed;
  }
  /**
   * 
   * @return returns "true" if robot is available for assignment and
   * "false" if the robot is engaged in a mission
   */
  public boolean isIdle(){
    return isIdle;
  }
  /**
   * 
   * @return returns "true" if the robot is carrying a shelf, and "false"
   * if the robot is unburdened
   */
  public boolean shelfCoupled(){
	  return shelfCoupled;
  }
  /**
   * 
   */
  public void coupleShelf(){
	  shelfCoupled = true;
	  //coupledShelfID = getShelfNumber();	  
  }
  /**
   * 
   * @return returns "true" if the robot is currently assigned to a mission.
   */
  public boolean robotEngaged() {
	  return onMission;
  }
  // control methods:
  // if idle, Robots will need to request new commands (from ?) (if applicable)
  // at each new tick (from Master?).
  // if not idle, Robots will need to request a path to travel (from Floor?)
}
