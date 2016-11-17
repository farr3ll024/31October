package Production;

import java.awt.Point;

/**
 *
 * @author TrevorFinley
 * @version 0.5
 *
 * The Floor class is designed to construct relative x/y coordinates of type
 * Point for all static locations such as charger, shelves, docks, etc.
 * and give all other parts of the warehouse access to them.
 * 
 * CURRENT FLOOR DIMENSIONS: 16 x 16 
 * NOTES: there is a setFloor() method that must be called to retrieve all data from the floor plan such as belts and shelves. 
 * Remember that arrays use values of max-1, so use 0 as the base for x and y extending up to 15.
 * All the constant x/y values have been offset by 1 to fit the array format.
 * If using Point, you must have import java.awt.Point; for an import statement.
 * The points follow paint's inverse coordinate system where (0,0) is the upper left corner, (15,15) is the bottom right corner.
 * 
 * Things still to do (that I know of): change to fullscale (most of the code has been optimized for simple scale change now), 
 * path calculator?
 */
public class Floor 
{
	static int debug = 0;
	//instance variables
	final static int FLOOR_Y = 15; //y value of overall length of floor
	final static int FLOOR_X = 15; //x value of overall width of floor
	final static int SHELVES = 80; //current number of shelf spaces on floor
	final static int SHELF_XSTART = 3; //current X value starting point of shelf spaces
	final static int SHELF_XEND = 13;  //current X value ending point
	final static int SHELF_YSTART = 2; //current Y value starting point
	final static int SHELF_YEND = 12; //current Y value ending point
	
    final static Point charger = new Point(0, 0);
    final static Point recdock = new Point(15, 0);
    final static Point picker = new Point(2, 14);
    final static Point packer = new Point(14, 14);
    final static Point shipdock = new Point(15, 15);
    public static Point[] shelf = new Point[SHELVES + 1];
    public static Point[] belt = new Point[FLOOR_X - 1];
   
    //returns the y value length of the floor
    public int getFloorHeight()
    {
    	return FLOOR_Y + 1;
    }
    //returns the x value width of the floor
    public int getFloorWidth()
    {
    	return FLOOR_X + 1;
    }
    //returns the number of shelves
    public int numberOfShelves()
    {
    	return SHELVES;
    }
    //returns the coordinates of charger in (x, y) format
    public Point getCharger()
    {
    	return charger;
    }
    //returns coordinates of receiving dock
    public Point getReceiving()
    {
    	return recdock;
    }
    //returns coordinates of shipping dock
    public Point getShipping()
    {
    	return shipdock;
    }
    //returns coordinates of picker station
    public Point getPicker()
    {
    	return picker;
    }
    //returns coordinates of packer station
    public Point getPacker()
    {
    	return packer;
    }
    
    //constructs the belt array of points
    public static void constructBelt() 
    {
        for (int i = 0, b = 1; i < belt.length; i++, b++) 
        {
            //sets proper location to each value in belt
            belt[i] = new Point(b, FLOOR_Y);
            
        }


    }
    //returns belt (array of coordinates)
    public Point[] getBelt()
    {
    	return belt;
    }
    
    //returns specified coordinates from belt array
    public Point getBelt(int beltNum)
    {
    	return belt[beltNum];
    }
    
    //constructs the shelf array of points
    public static void constructShelf() 
    {
        //initializes shelf array
        for (int i = 0; i < shelf.length; i++) 
        {
            shelf[i] = new Point();
        }
        
        //span y coordinate plane
        for(int y = 2, s = 0, j = 1; y <= (FLOOR_Y - 3); y++, j++)
        {
        	//accounts for highway space with regard to y
        	if((j % 6) == 0)
        		continue;
        	//span x coordinate plane
        	for(int x = 3, i = 1; x <= (FLOOR_X - 2); x++, i++)
        	{
        		//accounts for highway space with regard to x
        		if((i % 3) == 0)
        			continue;
        		else
        		{
        			shelf[s] = new Point(x,y);
        			s++;
        		}
        	}
        }
    }
    
    //returns entire array of shelf coordinates
    public Point[] getShelf()
    {
    	return shelf;
    }
    //returns coordinates for given shelf space
    public Point getShelf(int n) 
    {
        if (n > shelf.length || n < 0) 
        {
            System.out.println("ERROR: must specify a valid shelf number between 0 and " + shelf.length);
            System.out.println("Please change the code to match.");
            return null;
        }

        return shelf[n];
    }
    

    //creates an ASCII mock-up of the floor (for testing purposes)
    public static void printMap() 
    {
        for(int n = 0; n<(FLOOR_X * 2);n++)
        {
        	if(n == ((FLOOR_X * 2) - (FLOOR_X / 4)))
        	{
            	System.out.println("-");
            	break;
        	}
        	System.out.print("---");
        }

        for (int y = 0, s = 0; y <= FLOOR_Y; y++) {
            for (int x = 0; x <= FLOOR_X; x++) {
                //charging station
                if (x == charger.getX() && y == charger.getY()) {
                    System.out.print("| CH ");
                    continue;
                } //receiving dock
                else if (x == recdock.getX() && y == recdock.getY()) {
                    System.out.print("| RD ");
                    continue;
                } //picker station
                else if (x == picker.getX() && y == picker.getY()) {
                    System.out.print("| PI ");
                    continue;
                } //packer station
                else if (x == packer.getX() && y == packer.getY()) {
                    System.out.print("| PA ");
                    continue;
                } //shipping dock
                else if (x == shipdock.getX() && y == shipdock.getY()) {
                    System.out.print("| SD ");
                    continue;
                } 
                else if (s < shelf.length && x == shelf[s].getX() && y == shelf[s].getY())
                {
                	System.out.print("| SH ");
                	s++;
                	continue;
                }
                
                
                //belt
                else if (y == FLOOR_Y && (x != 0 && x != FLOOR_X)) {
                    System.out.print("| BL ");
                    continue;
                }
                //shelf
                //blank cell
                System.out.print("|    ");
            }
            System.out.println("|");
            
            for(int n = 0; n<(FLOOR_X * 2);n++)
            {
            	if(n == ((FLOOR_X * 2) - (FLOOR_X / 4)))
            	{
                	System.out.println("-");
                	break;
            	}
            	System.out.print("---");
            }
        }
    }
    //prints out general statistics of floor (for testing purposes)
    public static void printStats()
    {
        System.out.println("Current Floor Dimensions: " + (FLOOR_X + 1) + "x" + (FLOOR_Y + 1));
        System.out.println("Number of Shelves: " + SHELVES);
        System.out.println("Charging Station: (" + ((int)charger.getX()) + ", " + ((int)charger.getY()) + ")");
        System.out.println("Receiving Dock: (" + ((int)recdock.getX()) + ", " + ((int)recdock.getY()) + ")");
        System.out.println("Shipping Dock: (" + ((int)shipdock.getX()) + ", " + ((int)shipdock.getY()) + ")");
        System.out.println("Picker Station: (" + ((int)picker.getX()) + ", " + ((int)picker.getY()) + ")");
        System.out.println("Packer Station: (" + ((int)packer.getX()) + ", " + ((int)packer.getY()) + ")");
        System.out.println("Belt: (" + ((int)belt[0].getX())+", "+((int)belt[0].getY())+")"+" to "
        +"(" + ((int)belt[belt.length-1].getX())+", "+((int)belt[belt.length-1].getY())+")");
        System.out.println("Shelf area: (" + ((int)shelf[0].getX())+", "+((int)shelf[0].getY())+")"+" to "
        +"(" + ((int)shelf[belt.length-1].getX())+", "+((int)shelf[belt.length-1].getY())+")");        
       
    }
    //sets up floor plan
    public static void setFloor()
    {
    	constructBelt();
    	constructShelf();
    }

    //main method for debugging purposes only, must toggle debug to 1 at beginning of code to run
    public static void main (String[] args)
    {
    	if(debug == 1)
    	{
    		setFloor();
    		printMap();
    		printStats();
    	}
    }
}
