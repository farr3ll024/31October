/**
 *
 * @author: Blaise Reints
 * @version: .03 - Last modified: Monday, November 14
 *
 *
*    purpose: Master is meant to initialize and run through the simulaiton.
*    It does so by creating an instance of each class and referencing the tick method.
*    The tick method is derived from the clock interface and is written/implemented within every class
*    to provide an appropriate response to the current iteration. All(or most) of the interfaces will be outside
*    of the master class because it doesn't make sense for them to be inside master when master itself does no
*    documentation or "ticking". Master is essentially just
 * a loop that sends an iteration to all of the class instances
 */
package oct31;

/**
 *
 * @author farr3ll
 */
public class Master {
	Boolean isRunning;//aka status
	int iterations;// number of iterations("ticks") in this simulation
	int current_iteration;
	// constructor for master simulation

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

    /*clock interface
	public interface clock{
		void tick(int iteration);
	}
	//documentation interface
	public interface document{
		String doc(int iteration);// use this if you want the master to record the info to one file
		void doc(String fileName);// this would probably be easier because people could create their own documentation
	}*/
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
		sim.startSim();// start the simulation
		while (sim.getStatus() == true) {
			//bot.tick(sim.current_iteration);
			//etc...
			//bot.doc(fileName);
			//etc...
			System.out.println(sim.current_iteration);
			sim.current_iteration+=1;
		}
	}
}
