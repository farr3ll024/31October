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
  private final int yCharge = 0;
  private int x = 0;
  private int y = 0;
  private int distanceTraversed = 0;
  private boolean isIdle;

  public Robot(int x, int y){
    this.x = x;
    this.y = y;
    this.isIdle = true;
  }
  //I'll certainly end up changing how "direction" is passed to the robot to improve efficiency
  private void move(String direction){
      if (direction == "North" && this.y != 0){
          this.y += 1;
      }
      else if (direction == "South" && this.y != 15){
          this.y -= 1;
      }
      else if (direction == "East" && this.x != 15){
          this.x += 1;
      }
      else if (direction == "West" && this.x != 0){
          this.x -= 1;
      }
      this.distanceTraversed += 1;
  }  
  public void returnToCharger(){
	  
  }
  public void fetchItem(int shelfLocation){
	  
  }
  public void stockItem(int shelfLocation){
	  
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
  // control methods:
  // if idle, Robots will need to request new commands (from ?) (if applicable)
  // at each new tick (from Master?).
  // if not idle, Robots will need to request a path to travel (from Floor?)
}
