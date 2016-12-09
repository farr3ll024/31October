/**
 *
 * @author: Sam Barth
 *
 * date last modified: 11/30/2016
 *
 * The Robot class defines the individual robot.  An new instance of Robot
 * will have a starting x coordinate "0" and some y coordinate less than
 * the number of robots in the warehouse. The location of Robots on the floor
 * will utilize Java's Point object.  Robots will always be in one of two
 * states: idle (ready to be assigned a mission) or not idle (currently
 * performing a mission)
 */
package production;

import testpackage.testpackage.MockOrders;
import testpackage.testpackage.MockFloor;
import testpackage.testpackage.MockInventory;
import java.awt.Point;
import static java.lang.System.out;

public class Robot {

    private final Point chargeLocation;
    private Point location;
    private Point currentDestination;
    private int distanceTraversed = 0;
    private boolean isIdle;
    private boolean shelfCoupled;
    //private Point coupledShelfLocation;
    private boolean onOrderMission;
    private boolean onStockMission;
    private String currentState;
    private MockFloor f;
    private Shelf coupledShelf;
    private Picker picker;
    private MockOrders orders;
    private String specialAction;

    /**
     * Create an instance of Robot
     *
     * @param initial location of the starting position of the Robot. It will be
     * a Point with an X component "0" and a nonzero Y component.
     * @param f instance of the floor used by Master
     *
     */
    public Robot(Point initial, MockFloor f, MockInventory i , MockOrders o, Picker p) {
        double x = initial.getX();
        double y = initial.getY();
        int X = (int) x;
        int Y = (int) y;
        this.location = new Point(X, Y);
        this.isIdle = true;
        this.distanceTraversed = 0;
        this.chargeLocation = new Point(0, Y);
        this.shelfCoupled = false;
        this.f = f;
        this.picker = p;
        this.orders = o;
        this.specialAction = "Robot initialized.";
    }

    /**
     * The robot should move on every tick, unless it arrived at its destination
     * during the last tick.
     */
    public void move(boolean printTestLines) {
        this.specialAction = "Robot in transit";
        if (this.location.equals(this.currentDestination)) {
            this.setNextState();
        } else {
            if (this.getX() != currentDestination.getX()) {
                if (this.getX() < currentDestination.getX()) {
                    this.location.move(this.getX() + 1, this.getY());
                } else {
                    this.location.move(this.getX() - 1, this.getY());
                }
            } else if (this.getY() < currentDestination.getY()) {
                this.location.move(this.getX(), this.getY() + 1);
            } else {
                this.location.move(this.getX(), this.getY() - 1);
            }
            this.distanceTraversed += 1;
            if (printTestLines) {
                out.println("Robot moved to " + this.getLocation().toString());
            }
        }
    }

    public void returnToCharger() {
        this.currentDestination = this.chargeLocation;
    }

    /**
     * @param mission is a String of one of two possible missions on which a
     * Robot may be sent -- "Order"(bring a shelf to the picker location) or
     * "Stock" (bring a shelf to the receiving dock)
     * @param shelfLocation is the Point location of the shelf on which the
     * inventory is stored or will be stored
     */
    public void assignMission(String mission, Shelf s) {
        switch (mission) {
            case "Order":
                this.isIdle = false;
                this.currentState = "F";
                this.onOrderMission = true;
                this.currentDestination = s.getshelfBase();
                break;
            case "Stock":
                this.isIdle = false;
                this.currentState = "F";
                this.onStockMission = true;
                this.currentDestination = s.getshelfBase();
                break;
        }
    }

    /**
     *
     */
    private void setNextState() {
        //the follwoing can be read as "uf the last thing we did was currentState", then the next thing we'll do is:
        switch (this.currentState) {
            case "A": // State "A" is bring a shelf to the picker
                this.specialAction = "Robot arrived at picker. Returning to shelf location";
                picker.deliverShelf(this.coupledShelf);
                this.currentDestination = this.coupledShelf.getshelfBase();
                this.currentState = "D";
                break;
            case "B": // State "B" is bring a shelf to the receiving
                //Inventory.deliverShelf(this.coupledShelf);
                this.currentDestination = this.coupledShelf.getshelfBase();
                this.currentState = "D";
                break;
            case "C": // State "C" is go to charge location
                this.specialAction = "Robot arrived at charge station. Charging...";
                this.currentState = "E";
                break;
            case "D": // State "D" is return shelf
                this.specialAction = "Robot arrived at shelf location. Uncoupling";
                this.uncoupleShelf();
                this.currentState = "C";
                break;
            case "E": // State "E" is charge
                this.isIdle = true;
                this.currentState = "G";
                break;
            case "F": // State "F" is move to shelf
                this.coupleShelf();
                if (this.onOrderMission()) {
                    out.println("New destination: " + f.getPicker().toString());
                    this.currentDestination = new Point(f.getPicker());
                    this.currentState = "A";
                } else {
                    this.currentDestination = new Point(f.getReceiving());
                    this.currentState = "B";
                }
                break;
            case "G": // State "G" is idle
                break;
        }
    }

    /**
     *
     * @return returns a Point object with the same location as the calling
     * robot
     */
    public Point getLocation() {
        return this.location.getLocation();
    }

    /**
     *
     * @return returns current int x coordinate of the robot
     */
    public int getX() {
        double d = this.location.getX();
        int i = (int) d;
        return i;
    }

    /**
     *
     * @return returns current int y coordinate of the robot
     */
    public int getY() {
        double d = this.location.getY();
        int i = (int) d;
        return i;
    }

    /**
     *
     * @return returns int number of tiles moved since last charge
     */
    public int getDistanceTraversed() {
        return distanceTraversed;
    }

    /**
     *
     * @return returns "true" if robot is available for assignment and "false"
     * if the robot is engaged in a mission
     */
    public boolean isIdle() {
        return isIdle;
    }

    /**
     *
     * @return returns "true" if the robot is carrying a shelf, and "false" if
     * the robot is unburdened
     */
    public boolean shelfCoupled() {
        return shelfCoupled;
    }

    /**
     *
     */
    public void coupleShelf() {
        shelfCoupled = true;
        //coupledShelfID = getShelfNumber();
    }

    /**
     *
     */
    public void uncoupleShelf() {
        this.shelfCoupled = false;
    }

    /**
     *
     * @return returns "true" if the robot is currently assigned to an order
     * mission.
     */
    public boolean onOrderMission() {
        return onOrderMission;
    }

    /**
     *
     * @return returns "true" if the robot is currently assigned to a stock
     * mission
     */
    public boolean onStockMission() {
        return onStockMission;
    }
    public String getSpecialActionLog(){
        return this.specialAction;
    }
}
