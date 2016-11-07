//master needs:
// 1) simulation(main) 
// 2) tasks
// 3) document 

package oct31;
//import java.util.ArrayList;  


public class Master {
	Boolean isCompleted;
	Boolean isRunning;
	Task current_task;
	// constructor for master simulation
	public Master() {
		this.isCompleted = false;
		this.isRunning = null;
		this.current_task = null;
	}
	// simulation is started
	public void triggered() {
		this.isRunning = true;
	}
	// fire method executes the current task
	public void fire() {
		// move robot/mark task as completed/etc.
	}
	// method for mark completed
	public void markCompleted() {
		this.isCompleted = true;
		this.isRunning = false;
	}
	// method for event status
	public boolean isCompleted() {
		return false;
	}
	// create list of events
	public void generate_tasks() { // param will need to be the list of orders
		// events will need to be based off orders
	}
	// pause sim. in order to add visual
	public void buffer() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// document simulation
	public void doc() {
		while (this.isRunning) {
			System.out.println("In progress");
		}
		System.out.println("Completed");
	}
	// method for setting the current task(assigns current task to sim object)
	public void setTask() {

	}

	// class for Events(contains hashmap of events)
	public class Task {
		public Task() {
			// where to go
			// what to get
			// etc.
			// very dependent on order class
		}
	}

	// interface for tasks(should be implemented by all classes)
	public interface simulate {
		// provides useful methods to work with current task
		void setTask(); // this will get the next task that should be
							// completed
		void fire(); // this will execute the task - ex) event.fire()
		void markCompleted();// marks the current task as finished - ex)
								// event.markCompleted()
		void isCompleted(); // check if the current task is completed. if it
								// is get the next task - ex)
								// event.isCompleted()
		void buffer(); // pause simulation in order to add visual/realism
	}

	// main simulation
	public static void main(String args[]) {
		Master sim = new Master();// create simulation object
		sim.generate_tasks(); // need order params

		while (sim.isCompleted() == false) {
			sim.triggered();
			sim.setTask();
			sim.buffer();
			sim.fire();
			sim.buffer();
			sim.doc();
			sim.buffer();
		}
	}
}
