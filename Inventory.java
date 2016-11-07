import java.util.ArrayList;

public class Inventory {
	boolean isExist;
	ArrayList<String> itemList = new ArrayList<String>();
	
    public Inventory(ArrayList itemList){
        this.itemList = itemList;
    }
    
    public void removeItem(String itemNum){
    	if (isExist){
    		/*remove item from itemList*/
    	}
    	else{
    		
    	}
    		
    }
    
    public void addItem(String itemNum){
    	itemList.add(itemNum);
    }
    
    public boolean checkExist(String itemNum){
    	/* add code here to check existence, 
    	 * if exist isExist is true
    	 * else false*/
    	return isExist;
    }
    
}


class Test {
	public static void main(String[] args) {
		
		ArrayList<String> listA = new ArrayList<String>();
		/*add code here to read file and insert the item in to listA*/
	    
		Inventory a = new Inventory(listA);
	    a.addItem("1111");
	    a.removeItem("1111");
	}

}




