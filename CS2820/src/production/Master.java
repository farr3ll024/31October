package production;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import testpackage.*;

/**
 *
 * @author : Blaise Reints
 * @author : farr3ll024 (aka Blaise)
 * @version Last modified: 12/2/2016
 *
 * purpose - initialize and facilitate simulation (main)
 */
public class Master implements Document {

    Boolean isRunning;//aka status
    int iterations;// number of iterations("ticks") in this simulation
    int current_iteration;
    String sim_status;

    /**
     * constructor for master class
     */
    public Master() {
        this.sim_status = "starting simulation";
        this.isRunning = true;
        this.iterations = 15;
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
        if (this.current_iteration == 16) {
            this.isRunning = false;
            this.sim_status = "Simulation successfully completed all iterations";
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

        List<Map<String, Object>> listA = new ArrayList<>();
        Inventory inventory_master = new Inventory(listA);

        Orders orders_master = new Orders(inventory_master);

        Belt belt_master = new Belt(floor_master.floor_X);

        Picker picker_master = new Picker(orders_master, belt_master);

        //Orders orders_master = new Orders(inventory_master, floor_master);
        //Picker picker_master = new Picker(orders_master);
        MockOrders mockOrders_master = new MockOrders();
        MockFloor mockFloor_master = new MockFloor();
        MockInventory mockInventory_master = new MockInventory();

        RobotMaster robotMaster_master = new RobotMaster(1, mockFloor_master, mockInventory_master, mockOrders_master, picker_master);
//        RobotMaster robotMaster_master = new RobotMaster(1, floor_master, inventory_master);

        sim.sim_status = "Instantiation successful: continuing into simulation";
        sim.doc();
        sim.startSim();
        Visualizer visualizer_master = new Visualizer();
        while (sim.getStatus() == true) {
            if (sim.current_iteration == 1) {
                sim.sim_status = "running...";
                sim.doc();
            }
            try {
                belt_master.tick(sim.current_iteration);
                robotMaster_master.tick(sim.current_iteration);
//            robotMaster_master.tick(sim.current_iteration);
                visualizer_master.tick(sim.current_iteration);
                sim.current_iteration += 1;
            } catch (Exception e) {
                System.out.println(sim.current_iteration);
                sim.sim_status = "Error: simulation ended";
                break;
            }
            sim.sim_status = "running...";
        }
        sim.doc();
    }

    @Override
    public void doc() {
        System.out.println(sim_status);
    }

}
