package Production;

import java.awt.Point;

/**
 *
 * @author TrevorFinley
 * @version 1.0
 *
 * The Floor class is designed to construct relative x/y coordinates of type
 * Point for all static locations such as charger, shelves, docks, etc.
 * and give all other parts of the warehouse access to them.
 * 
 * CURRENT floor DIMENSIONS: 160 x 200 
 * NOTES: Floor class now has its own constructor.  To call everything, you'll need to set up
 * a floor variable such as Floor f, then to call simply do f.getShelf(); or whatever.
 * Remember that arrays use values of max-1, so use 0 as the base for x and y extending up to max length - 1.
 * All the constant x/y values have been offset by 1 to fit the array format.
 * If using Point, you must have import java.awt.Point; for an import statement.
 * The points follow paint's inverse coordinate system where (0,0) is the upper left corner, (15,15) is the bottom right corner.
 * 
 */
public class Floor 
{
	static int debug = 1;
	//instance variables
	int floor_Y; //y value of overall length of floor
	int floor_X; //x value of overall width of floor
	int shelfmax;
	int s;
	int shelf_Xstart;
	int shelf_Xend;
	int shelf_Ystart;
	int shelf_Yend;
	Point charger;
	Point recdock;
	Point picker;
	Point packer;
	Point shipdock;
	Point[] shelf;
	Point[] belt;
   
    //constructs the floor using the given dimensions
    public Floor(int x, int y)
    {
    	floor_X = x - 1;
    	floor_Y = y - 1;
    	shelfmax = floor_X * floor_Y; //set for the maximum possible number of shelves (unrealistic but used for allocating purposes)
    	s = 0; //number of shelves
    	shelf_Xstart = 3; //current X value starting point of shelf spaces
    	shelf_Xend = (floor_X-2);  //current X value ending point
    	shelf_Ystart = 2; //current Y value starting point
    	shelf_Yend = (floor_Y-3); //current Y value ending point
    	
        charger = new Point(0, 0);
        recdock = new Point(floor_X, 0);
        picker = new Point(2, (floor_Y - 1));
        packer = new Point((floor_X - 1), (floor_Y - 1));
        shipdock = new Point(floor_X, floor_Y);
        shelf = new Point[shelfmax];
        belt = new Point[floor_X - 1];
    	constructBelt();
    	constructShelf();
    }
    //returns the y value length of the floor
    public int getFloorHeight()
    {
    	return this.floor_Y + 1;
    }
    //returns the x value width of the floor
    public int getFloorWidth()
    {
    	return this.floor_X + 1;
    }
    //returns the number of shelves
    public int numberOfShelves()
    {
    	return this.s;
    }
    //returns the coordinates of charger in (x, y) format
    public Point getCharger()
    {
    	return this.charger;
    }
    //returns coordinates of receiving dock
    public Point getReceiving()
    {
    	return this.recdock;
    }
    //returns coordinates of shipping dock
    public Point getShipping()
    {
    	return this.shipdock;
    }
    //returns coordinates of picker station
    public Point getPicker()
    {
    	return this.picker;
    }
    //returns coordinates of packer station
    public Point getPacker()
    {
    	return this.packer;
    }
    
    //constructs the belt array of points
    public void constructBelt() 
    {
        for (int i = 0, b = 1; i < this.belt.length; i++, b++) 
        {
            //sets proper location to each value in belt
            this.belt[i] = new Point(b, this.floor_Y);
            
        }


    }
    //returns belt (array of coordinates)
    public Point[] getBelt()
    {
    	return this.belt;
    }
    
    //returns specified coordinates from belt array
    public Point getBelt(int beltNum)
    {
    	return this.belt[beltNum];
    }
    
    //constructs the shelf array of points
    public void constructShelf() 
    {
        //initializes shelf array
        for (int i = 0; i < this.shelfmax; i++) 
        {
            this.shelf[i] = new Point();
        }
        
        //span y coordinate plane
        for(int y = 2, j = 1; y <= (this.floor_Y - 3); y++, j++)
        {
        	//accounts for highway space with regard to y
        	if((j % 6) == 0)
        		continue;
        	//span x coordinate plane
        	for(int x = 3, i = 1; x <= (this.floor_X - 2); x++, i++)
        	{
        		//accounts for highway space with regard to x
        		if((i % 3) == 0)
        			continue;
        		else
        		{
        			this.shelf[s] = new Point(x,y);
        			this.s++;
        		}
        	}
        }
    }
    
    //returns entire array of shelf coordinates
    public Point[] getShelf()
    {
    	return this.shelf;
    }
    //returns coordinates for given shelf space
    public Point getShelf(int n) 
    {
        if (n > this.shelf.length || n < 0) 
        {
            System.out.println("ERROR: must specify a valid shelf number between 0 and " + this.shelf.length);
            System.out.println("Please change the code to match.");
            return null;
        }

        return this.shelf[n];
    }
    

    //creates an ASCII mock-up of the floor (for testing purposes, explicitly in small-scale testing)
    public void printMap() 
    {
        for(int n = 0; n<(this.floor_X * 2);n++)
        {
        	if(n == ((this.floor_X * 2) - (this.floor_X / 4)))
        	{
            	System.out.println("-");
            	break;
        	}
        	System.out.print("---");
        }

        for (int y = 0, q = 0; y <= floor_Y; y++) {
            for (int x = 0; x <= floor_X; x++) {
                //charging station
                if (x == this.charger.getX() && y == this.charger.getY()) {
                    System.out.print("| CH ");
                    continue;
                } //receiving dock
                else if (x == this.recdock.getX() && y == this.recdock.getY()) {
                    System.out.print("| RD ");
                    continue;
                } //picker station
                else if (x == this.picker.getX() && y == this.picker.getY()) {
                    System.out.print("| PI ");
                    continue;
                } //packer station
                else if (x == this.packer.getX() && y == this.packer.getY()) {
                    System.out.print("| PA ");
                    continue;
                } //shipping dock
                else if (x == this.shipdock.getX() && y == this.shipdock.getY()) {
                    System.out.print("| SD ");
                    continue;
                } 
                else if (q < this.shelf.length && x == this.shelf[q].getX() && y == this.shelf[q].getY())
                {
                	System.out.print("| SH ");
                	q++;
                	continue;
                }
                
                
                //belt
                else if (y == this.floor_Y && (x != 0 && x != this.floor_X)) {
                    System.out.print("| BL ");
                    continue;
                }
                //shelf
                //blank cell
                System.out.print("|    ");
            }
            System.out.println("|");
            
            for(int n = 0; n<(this.floor_X * 2);n++)
            {
            	if(n == ((this.floor_X * 2) - (this.floor_X / 4)))
            	{
                	System.out.println("-");
                	break;
            	}
            	System.out.print("---");
            }
        }
    }
    //prints out general statistics of floor (for testing purposes)
    public void printStats()
    {
        System.out.println("Current Floor Dimensions: " + (this.floor_X + 1) + "x" + (this.floor_Y + 1));
        System.out.println("Number of Shelves: " + this.numberOfShelves());
        System.out.println("Charging Station: (" + ((int)this.getCharger().getX()) + ", " + ((int)this.getCharger().getY()) + ")");
        System.out.println("Receiving Dock: (" + ((int)this.getReceiving().getX()) + ", " + ((int)this.getReceiving().getY()) + ")");
        System.out.println("Shipping Dock: (" + ((int)this.getShipping().getX()) + ", " + ((int)this.getShipping().getY()) + ")");
        System.out.println("Picker Station: (" + ((int)this.getPicker().getX()) + ", " + ((int)this.getPicker().getY()) + ")");
        System.out.println("Packer Station: (" + ((int)this.getPacker().getX()) + ", " + ((int)this.getPacker().getY()) + ")");
        System.out.println("Belt: (" + ((int)this.getBelt()[0].getX())+", "+((int)this.getBelt()[0].getY())+")"+" to "
        +"(" + ((int)this.getBelt()[this.belt.length-1].getX())+", "+((int)this.getBelt()[this.belt.length-1].getY())+")");
        System.out.println("Shelf area: (" + ((int)this.getShelf()[0].getX())+", "+((int)this.getShelf()[0].getY())+")"+" to "
        +"(" + ((int)this.getShelf()[s - 1].getX())+", "+((int)this.getShelf()[s - 1].getY())+")");        
       
    }

    //main method for debugging purposes only, must toggle debug to 1 at beginning of code to run
    public static void main (String[] args)
    {
    	if(debug == 1)
    	{
    		Floor test = new Floor(160, 160);
    		test.printMap();
    		test.printStats();
    	}
    }
}
