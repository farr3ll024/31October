public class Floor 
{
	static String[][] map;
	final  static String charger = "ch";
	final static String rdock = "rd";
	final static String shelf = "sh";
	final static String sdock = "sd";
	final static String hway = "hw";
	final static String belt = "bl";
	final static String picker = "pi";
	final static String packer = "pa";
	
	public static void constructMap()
	{
		map = new String[16][16];
		map[0][0] = charger;
		map[0][15] = rdock;
		map[15][15] = sdock;
		map[13][1] = hway;
		map[14][1] = picker;
		map[14][14] = packer;
		
		//loop for constructing belt
		for(int y = 1; y<15; y++)
			map[15][y] = belt;
		
		//loop for constructing bordering highways
		for(int y = 2; y<15; y++)
		{
			map[1][y] = hway;
			map[13][y] = hway;
		}
		//loop for constructing shelf space
		for(int x = 3; x<13; x++)
		{
			for(int y = 2; y<13; y++)
			{
				//place highway in between shelves
				if(y == 6)
				{
					map[x][y] = hway;
					map[x+1][y] = hway;
					map[x+2][y] = hway;
				}
				//place shelf space
				else
				{
					map[x][y] = shelf;
					map[x+1][y] = shelf;
					map[x+2][y] = hway;
				}
			}
			x+=2;
		}
		//return map;
	}
	
	public static void printFloor()
	{
		for(int x = 0; x < 16; x++)
		{
			for(int y = 0; y < 16; y++)
			{
				if(map[x][y] == null)
				{
					System.out.print("|    |");
					continue;
				}
				System.out.print("| " + map[x][y] + " |");
			}
			System.out.print("\n");
			System.out.println(" ------------------------------------------------------------------------------------------------- ");
		}
	}
	
	public static void main (String[] args)
	{
		constructMap();
		printFloor();
		
	}
}