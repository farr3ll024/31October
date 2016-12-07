package production;

import java.awt.Point;

/**
 *
 * @author TrevorFinley (tfinley521)
 * @version 1.1 - last date modified 12/2/2016
 *
 * Purpose: to construct relative x/y coordinates of type
 * Point for all static locations such as charger, shelves, docks, etc.
 * and give all other parts of the warehouse access to them.
 * 
 * CURRENT floor DIMENSIONS: 160 x 200 
 * NOTES: Floor class now has its own constructor.  To call everything, you'll need to set up
 * a floor variable such as Floor f, then to call simply do f.getShelf(); or whatever.
 * Remember that arrays use values of max-1, so use 0 as the base for x and y extending up to max length - 1.
 * All the constant x/y values have been offset by 1 to fit the array format.
 * If using Point, you must have import java.awt.Point; for an import statement.
 * The points follow paint's inverse coordinate system where (0,0) is the upper left corner, (159, 199) is the bottom right corner.
 * 
 */
public class Floor 
{
	//instance variables
	int floor_Y; 		//y value of overall length of floor
	int floor_X; 		//x value of overall width of floor
	int shelfmax; 		//max shelf value (for dynamic allocating)
	int s; 				//number of shelves
	int shelf_Xstart;  	//current X value starting point of shelf spaces
	int shelf_Xend;  	//current X value ending point
	int shelf_Ystart;  	//current Y value starting point
	int shelf_Yend;  	//current Y value ending point
	Point charger; 		//charging station
	Point recdock; 		//receiving dock
	Point picker; 		//picker station
	Point packer; 		//packer station
	Point shipdock; 	//shipping dock
	Point[] shelf; 		//shelf array of coordinates
	Point[] belt; 		//belt array of coordinates
	
	
	/**
	 * passes the current default floor dimensions for ease of access.
	 * @return Floor default floor
	 */
	public static Floor getFloor()
	{
		Floor DefFloor = new Floor(160, 200);
		return DefFloor;
	}
   
    /**
     * constructs the floor using the given x and y dimensions
     * 
     * @param x the width of the floor
     * @param y the height of the floor
     */
    public Floor(int x, int y)
    {
    	floor_X = x - 1;
    	floor_Y = y - 1;
    	shelfmax = floor_X * floor_Y; 
    	s = 0; 
    	shelf_Xstart = 3; 
    	shelf_Xend = (floor_X-2);  
    	shelf_Ystart = 2; 
    	shelf_Yend = (floor_Y-3); 
    	
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
    
    /**
     * returns the y value length of the floor
     * @return int floor height
     */
    public int getFloorHeight()
    {
    	return this.floor_Y + 1;
    }
    
    /**
     * returns the x value width of the floor
     * @return int floor width
     */
    public int getFloorWidth()
    {
    	return this.floor_X + 1;
    }
    
    /**
     * returns the number of shelves
     * @return int number of shelves
     */
    public int numberOfShelves()
    {
    	return this.s;
    }
    
    /**
     * returns the coordinates of charger in (x, y) format
     * @return Point charger coordinates
     */
    public Point getCharger()
    {
    	return this.charger;
    }
    
    /**
     * returns coordinates of receiving dock
     * @return Point receiving dock coordinates
     */
    public Point getReceiving()
    {
    	return this.recdock;
    }
    
    /**
     * returns coordinates of shipping dock
     * @return Point shipping dock coordinates
     */
    public Point getShipping()
    {
    	return this.shipdock;
    }
    
    /**
     * returns coordinates of picker station
     * @return Point picker station coordinates
     */
    public Point getPicker()
    {
    	return this.picker;
    }
    
    /**
     * returns coordinates of packer station
     * @return Point packer station coordinates
     */
    public Point getPacker()
    {
    	return this.packer;
    }
    
    /**
     * constructs the belt array of points (for Floor constructor's use only)
     * @see Floor.Floor
     */
    
    private void constructBelt() 
    {
        for (int i = 0, b = 1; i < this.belt.length; i++, b++) 
        {
            //sets proper location to each value in belt
            this.belt[i] = new Point(b, this.floor_Y);
            
        }


    }
    
    /**
     * returns belt (array of coordinates)
     * @return Point[] belt array
     */
    public Point[] getBelt()
    {
    	return this.belt;
    }
    
    /**
     * returns specified coordinates from belt array
     * @param beltNum
     * @return Point beltNum coordinates
     */
    public Point getBelt(int beltNum)
    {
    	return this.belt[beltNum];
    }
    
    /**
     * constructs the shelf array of points (for Floor constructor's use only)
     * @see Floor.Floor
     */
    private void constructShelf() 
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
    
    /**
     * returns entire array of shelf coordinates
     * @return Point[] shelf array
     */
    public Point[] getShelf()
    {
    	return this.shelf;
    }
    
    /**
     * returns coordinates for given shelf space
     * @param n
     * @return Point shelfNum coordinates
     */
    public Point getShelf(int shelfNum) 
    {
        if (shelfNum > this.shelf.length || shelfNum < 0) 
        {
            System.out.println("ERROR: must specify a valid shelf number between 0 and " + this.shelf.length);
            System.out.println("Please change the code to match.");
            return null;
        }

        return this.shelf[shelfNum - 1];
    }
    

    /**
     * creates an ASCII mock-up of the floor (for testing purposes, explicitly in small-scale testing)
     */
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
    
    /**
     * prints out general statistics of floor (for testing purposes)
     */
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
        System.out.println("Shelf area: (" + ((int)this.getShelf(1).getX())+", "+((int)this.getShelf(1).getY())+")"+" to "
        +"(" + ((int)this.getShelf(s).getX())+", "+((int)this.getShelf(s).getY())+")");        
    }

    //main method for debugging purposes only
//    public static void main (String[] args)
//    {
//    	Floor test = new Floor(16, 16);
//    	Floor test2 = getDefault();
//    	test.printMap();
//    	test2.printMap();
//    	test.printStats();
//    	test2.printStats();
//    	
//    }
    
}
