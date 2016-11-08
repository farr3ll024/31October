/*
*
*/
package RobotPackage;

Class Robot {

  private int x = 0;
  private int y = 0;
  private int distanceTraversed = 0;
  private boolean isIdle = true;

  public Robot(int x, int y){
    this.x = x;
    this.y = y;
  }
  //getters and setters
  public getX(){
    return x;
  }
  public getY(){
    return y;
  }
  public getDistanceTraversed(){
    return distanceTraversed;
  }
  public isIdle(){
    return isIdle;
  }
  // control methods:
  // if idle, Robots will need to request new commands (from ?) (if applicable)
  // at each new tick (from Master?).
  // if not idle, Robots will need to request a path to travel (from Floor?)
}
