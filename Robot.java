/**
*
* @author: Sam Barth
*
* date last modified: 11/14/2016
* 
* The Robot class defines the individual robot.  An new instance of Robot
* will have a starting x coordinate "0" and some y coordinate less than
* the number of robots in the warehouse.  Robots will always be in one of two
* states: idle (ready to be assigned a mission) or not idle (currently
* performing a mission)
*/

package oct31;

import java.awt.Point;

public class Robot{

  private final int xCharge = 0;
  private int yCharge = 0;
  private int x = 0;
  private int y = 0;
  private int distanceTraversed = 0;
  private boolean isIdle;
  private boolean shelfCoupled;
  private int coupledShelfID;
  private boolean onOrderMission;
  private boolean onStockMission;

  public Robot(int x, int y){
    this.x = x;
    this.y = y;
    this.isIdle = true;
    this.distanceTraversed = 0;
    this.yCharge = y;
    this.shelfCoupled = false;
    this.onOrderMission = false;
    this.onStockMission = false;
  }
  //I'll certainly end up changing how "direction" is passed to the robot to improve efficiency
  private void move(int x_destination, int y_destination){
      if (this.x != x_destination){	  
    	  if (this.x < x_destination){
    		  this.x += 1;
    	  }
    	  else {this.x -= 1;}
      }
      else {
    	  if (this.y < y_destination){
    		  this.y += 1;
    	  }
    	  else {this.y -= 1;}
      }
      this.distanceTraversed += 1;
  }  
  public void returnToCharger(){
	  this.move(this.xCharge, this.yCharge);
  }
  public void fetchItem(int shelfLocation){
	  /*
	   * if shelfCoupled, this.move(x.picker, y.picker)
	   * else this.move(x.shelfLocaiton, y.shelfLocation)
	   */
  }
  public void stockItem(int shelfLocation){
	  /*
	   * if not shelfCoupled, this.move(x.shelfLocation, y.shelfLocation)
	   * else this.move(x.receivingDock, y.receivingDock)
	   */
  }
  //getters and setters
  public int getX(){
    return x;
  }
  public int getY(){
    return y;
  }
  public int getDistanceTraversed(){
    return distanceTraversed;
  }
  public boolean isIdle(){
    return isIdle;
  }
  public boolean shelfCoupled(){
	  return shelfCoupled;
  }
  public void coupleShelf(){
	  shelfCoupled = true;
	  //coupledShelfID = getShelfNumber();	  
  }
  public boolean onOrderMission() {
	  return onOrderMission;
  }
  public boolean onStockMission() {
	  return onStockMission;
  }
  // control methods:
  // if idle, Robots will need to request new commands (from ?) (if applicable)
  // at each new tick (from Master?).
  // if not idle, Robots will need to request a path to travel (from Floor?)
}
