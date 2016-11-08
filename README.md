# 31October
CS2820 group project

I changed the format of the master in order to make it so the objects can work more independently rather than depending on a specific "event/simulate" structure. 
	1) I've provided a documentation interface plus a clock interface(with a tick method)
	2) the master simulation will create an instance of all of the objects(i.e. new Robot, new Belt...etc)
	3) on each iteration(will be a default 100 iterations to start) the master simulation will invoke the tick method with a reference to each object(which will allow you guys to operate with more of your own methods/respond accordingly instead of me trying to make specific methods for all of your objects)
	4) the documentation interface will provide a method to receive a file name(which should be used to record object specific data) Note: the file name will be pushed to the objects via the master class 
	5) Note: the simulation will include a buffer in each iteration in order to allow time for a visual aspect
	
	** feel free to recommend something different or point out something I've missed. 
	
	