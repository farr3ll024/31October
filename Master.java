//master needs:
// 1) simulation(main) 
// 2) tasks
// 3) document 

package oct31;
//import java.util.ArrayList;  


public class Master {
	Boolean isRunning;//aka status
	int interations;// number of iterations("ticks") in this simulation
	int current_iteration;
	// constructor for master simulation
	public Master() {
		this.isRunning = null;
		this.iterations = 100;
		this.current_iteration = 0;
	}
	// simulation is started
	public void startSim() {
		this.isRunning = true;
	}
	// simulation satus
	public Boolean getStatus() {
		if(this.current_iteration==100) {
			this.isRunning = false;
		}
		return this.isRunning;
	}
	//simulation end
	public void endSim() {this.isRunning = false;}
	//get iteration
	public int getIteration() {return this.current_iteration}
	//clock interface
	public interface clock{
		void tick(int iteration);
	}
	//documentation interface
	public interface document{
		String doc(int iteration);// use this if you want the master to record the info to one file
		void doc(String fileName);// this would probably be easier because people could create their own documentation
	}
	// main simulation
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
