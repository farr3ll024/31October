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
     * method for starting simulation
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
    //get iteration

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
        //sim objects(initialization)
        //Robot bot = new Robot();
        //etc....

        Master sim = new Master();// create simulation object

        RobotMaster bot = new RobotMaster(1); //test connection to other classes in project
        sim.startSim();// start the simulation
        while (sim.getStatus() == true) {
            //bot.tick(sim.current_iteration);
            //etc...
            //bot.doc(fileName);
            //etc...

            System.out.println(sim.current_iteration);
            sim.current_iteration += 1;
        }
    }
}
