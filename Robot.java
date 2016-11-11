/*
*
* @author: Sam Barth
*
* date last modified: 11/10/2016
*/

package oct31;

import java.awt.Point;

public class Robot{

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
  public void move(String direction){
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
