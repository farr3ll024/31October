
public class Belt {
	static String[] belt;
	static boolean movingBelt = false; /*This will prevent an error where an item is placed on the belt, and is nullified by beltButton()*/
	static boolean fullBelt = false; /*Alerts if belt is full, preventing from items getting lost by the code*/
	static String item;
	static int x = 14; /*Used for moving*/
	static int y = 0; /*used for constructing*/
	
	public static void beltConstructor(){
		belt = new String[14];
		for(y=0;y<14;y++){
			belt[y] = null;
		}
	}
	
	public static void beltButton(){ /*Represents the packer pressing the belt button to move it one unit*/
		movingBelt = true;/*Alerts that the belt is moving*/
		for (x=13; x>=0; x--){
			belt[x] = belt[x-1];
			belt[x-1] = null;
		}
		movingBelt = false;/*Alerts that belt has stopped*/		
	}
	
	public static void addItem(String item){
		if(belt[0] != null){
			System.out.println("The belt is full, wait to place item.");
			fullBelt = true;/*Alerts the picker that the belt is full, preventing item from being placed*/	
		}
		else{
			if(movingBelt = true){
				System.out.println("The belt is moving, wait to place item.");
			}
			else{
				belt[0] = item;
			}
		}
	}
	
	public static void printBelt(){
		for(y=0;y<14;y++){
			System.out.println("At spot" + y + "on the belt is the item" + belt[y]);
		}
	}
	
	public static void main(){
		beltConstructor();
		printBelt();	
	}
	
	public static void test(){
		beltConstructor();
		addItem("Doll");
		addItem("Ball");
		beltButton();
		addItem("Ball");
		beltButton();
		printBelt();	
	}	
}
