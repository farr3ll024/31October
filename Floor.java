import java.awt.Point;

public class Floor
{
    Point charger = new Point(0,0);
    Point rdock = new Point(0,15);
    Point[] shelf;
    
    //for loop that constructs shelves and their respective coordinates
    
    public Point[] constructShelf()
    {
    	for(int s=1, x=3; x<=13; x++)
    	{
        //catches highway gaps
        if(x ==5 || x== 8 || x== 11)
            continue;

        	for(int y=2; y<=12; y++)
        	{
        		//catches highway gaps
        		if(y == 7)
        			continue;
                
        		else
        		{
        			shelf[s] = new Point(x,y);
        			s++;
                
        		}
        }
        
    	}
    	
    	return shelf;
    }
    public int getShelfLimit()
    {
        return shelf.length;
    }
//    public Point getShelf(int n)
//    {
//        if (n > shelf.length || n<1)
//        {
//            System.out.println("ERROR: must specify a valid shelf number between 1 and " + shelflimit);
//            System.out.println("Please change the code to match.");
//            return Point();
//        }
//        
//        return shelf[n];
//    }

//     public static void constructMap()
//     {
//         
//     }

    public static void Main (String[] args)
    {
        
    }
}