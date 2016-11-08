import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class inventoryTest {
	boolean isExist;
	//boolean isInList;
	int amount;
	List<Map<String, Object>> inventory = new ArrayList<Map<String, Object>>();
	
    public inventoryTest(List inventory){
        this.inventory = inventory;
    }
    
    public void data(){
    	
    	BufferedReader br = null;
		try
		{
			br = new BufferedReader(new FileReader("/Users/macbook_user/Desktop/OOP Project/List.txt"));
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
			return;
		}

		String[] columnName =
		{ "Id", "Name", "Amount"}; 
		int i, index;
		String line;
		try
		{
			br.readLine();
			while ((line = br.readLine()) != null)
			{
				index = 0;
				String[] se = line.split(" ");
				Map<String, Object> item = new HashMap<String, Object>();
				for (i = 0; i < se.length; i++)
				{
					if ("".equals(se[i]))
					{
						continue;
					}
					if (index >= columnName.length)
					{
						continue;
					}
					item.put(columnName[index], se[i]);
					index++;
				}
				
				int amount = Integer.parseInt((String) item
							.get(columnName[2]));
				
				if (amount > 0){
					item.put("Existence", "Y");
				}
				else{
					item.put("Existence", "N");
				}

				inventory.add(item);
			}
			br.close();
            
			outPutFile();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
    	
    }
    
    public void removeItem(String itemName){
    	if (checkExist(itemName) == true){
    		int i;
    		//System.out.println(checkExist(itemName));
        	for (i = 0; i < inventory.size(); i++)
    		{
        		Map<String, Object> removedItem = new HashMap<String, Object>();
        		removedItem = inventory.get(i);
        		
    			if (itemName.equals(removedItem.get("Name").toString())){
    				int a = Integer.parseInt((String) removedItem.get("Amount"));
    				removedItem.put("Amount",a-1);
    				
    				if (a-1 < 1){
    					removedItem.put("Existence","N");
    				}
    			}
    		}
    	}
    	
    	else{
    		System.out.println("Item not exist");
    		checkExist(itemName);
    	}
    	
    	outPutFile();
    		
    }
    
    public void addItem(String itemName){
    	boolean InList = false;
    	int i;
    	for (i = 0; i < inventory.size(); i++)
		{
    		Map<String, Object> newItem = new HashMap<String, Object>();
    		newItem = inventory.get(i);
			if (itemName.equals(newItem.get("Name").toString())){
				int a = Integer.parseInt((String) newItem
						.get("Amount"));
				newItem.put("Amount",a+1);
				newItem.put("Existence","Y");
				InList = true;
			}
		}
    	
    	if (InList == false){
    		Map<String, Object> newItem = new HashMap<String, Object>();
    		newItem.put("Id", i+1);
    		newItem.put("Name",itemName);
    		newItem.put("Amount",1);
    		newItem.put("Existence","Y");
    		inventory.add(newItem);
    	}
    	
    	outPutFile();
         
    } 
    
    public void outPutFile(){
    	try
		{
    	   PrintWriter pw = new PrintWriter(new File("/Users/macbook_user/Desktop/OOP Project/List2.txt"));
    	   pw.println("Id\tName\tAmount\tExistence");
    	   String[] columnName = { "Id", "Name", "Amount"}; 
			int cIndex;
			for (int i = 0; i < inventory.size(); i++)
			{
				Map<String, Object> st = inventory.get(i);
				cIndex = 0;
				pw.println(st.get(columnName[cIndex++]) + "\t"
						+ st.get(columnName[cIndex++]) + "\t"
						+ st.get(columnName[cIndex++]) + "\t"+st.get("Existence"))  ;
			}
			pw.flush();
			pw.close();
    	   
		} catch (IOException e)
		{
			e.printStackTrace();
		}
    }
    
    public boolean checkExist(String itemName){
    	
    	for (int i = 0; i < inventory.size(); i++)
		{
    		Map<String, Object> newItem = new HashMap<String, Object>();
    		newItem = inventory.get(i);
			if (itemName.equals( newItem.get("Name").toString())){
				int a = Integer.parseInt((String) newItem.get("Amount"));
				//isInList = true;
				if (a != 0){
					isExist = true;
					break;
				}
				else{
					isExist = false;
				}
			}
			else{
				isExist = false;
			}
			
		}
    	return isExist;
    	
    }
    
    public static void main(String[] args) {
		
		List<Map<String, Object>> listA = new ArrayList<Map<String, Object>>();
		/*add code here to read file and insert the item in to listA*/
	    
		inventoryTest a = new inventoryTest(listA);
		a.data();
		//a.checkExist("K");
		
		
	    a.addItem("Z");
	    a.addItem("H");
	    a.addItem("A");
	    a.addItem("F");
	    a.removeItem("K");
	}
    
}
