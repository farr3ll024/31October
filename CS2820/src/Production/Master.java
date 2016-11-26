package Production;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author : Blaise Reints
 * @author : farr3ll024 (aka Blaise)
 * @version Last modified: November 20
 *
 * purpose - initialize and facilitate simulation (main)
 */
public class Master {

    Boolean isRunning;//aka status
    int iterations;// number of iterations("ticks") in this simulation
    int current_iteration;

    /**
     * constructor for master class
     */
    public Master() {
        this.isRunning = null;
        this.iterations = 100;
        this.current_iteration = 0;
    }

    /**
     * method for starting simulation - this should also create an instance of
     * all other classes
     */
    public void startSim() {
        this.isRunning = true;
    }

    /**
     * method for returning the status of the simulation(running/not running)
     *
     * @return Boolean
     */
    public Boolean getStatus() {
        if (this.current_iteration == 100) {
            this.isRunning = false;
        }
        return this.isRunning;
    }

    /**
     * method ends the simulation
     */
    public void endSim() {
        this.isRunning = false;
    }

    /**
     * method returns the current iteration number
     *
     * @return int
     */
    public int getIteration() {
        return this.current_iteration;
    }

    /**
     * main method
     *
     * @param args
     */
    public static void main(String args[]) {

        Master sim = new Master();// create simulation object
        sim.startSim();// start the simulation - this will initialize all classes

        //create instance of each class
        Floor floor_master = new Floor(160, 200);
        RobotMaster bot_master = new RobotMaster(1);
        //orders instance --> Note: I only create one instance of each class, should address and item be parameters?
        List<Map<String, Object>> listA = new ArrayList<>();
        Inventory inventory_master = new Inventory(listA);
        Belt belt_master = new Belt();

        while (sim.getStatus() == true) {
            inventory_master.tick(sim.current_iteration);
            //orders
            bot_master.tick(sim.current_iteration);
            belt_master.tick(sim.current_iteration);

            sim.current_iteration += 1;
        }
    }
}
