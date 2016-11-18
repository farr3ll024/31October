package Production;

/**
 *
 * @author : Blaise Reints
 * @author : farr3ll024 (aka Blaise)
 *  Last modified: November 17
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
        RobotMaster bot_master = new RobotMaster(1); //initializes a single robot
        //Orders order_master = new Orders();
        //Floor floor_master = new Floor();
        //Belt belt_master = new Belt();
        //Inventory inventory_master = new Inventory();
        //Visualizer visual_master = new Visualizer();


        //Questions/tasks:
        //public Orders(String address, ArrayList<String> items) --> should address and the list name be parameters? or should I just send in an instance of inventory? -- second; you could just git rid of the list parameter and generate that within the class based on inventory
        //public static void setFloor() --> is this the floor constructor? why have a return type/why not just call it Floor()?
        //public static void beltConstructor() --> is the return type necessary since it's a class constructor? couldn't it just be called Belt()
        //inventory - need upload from ming(my bad)
        //visualizer - no constructor yet(I'll start that after I finish master and everyone is happy with that)
        //Will peoples params change?
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
        while (sim.getStatus() == true) {

            System.out.println("git check");
            System.out.println(sim.current_iteration);
            sim.current_iteration += 1;
        }
    }
}
