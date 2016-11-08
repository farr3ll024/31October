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
				
				double amount = Double.parseDouble((String) item
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
	
  
    
    public void removeItem(String itemNum){
    	if (isExist){
    		/*remove item from itemList*/
    	}
    	else{
    	    
    	}
    		
    }
    
    public void addItem(String itemNum){
 
    }
    
    public boolean checkExist(String itemNum){
    	/* add code here to check existence, 
    	 * if exist isExist is true
    	 * else false*/
    	return isExist;
    }
    
    public static void main(String[] args) {
		List<Map<String, Object>> listA = new ArrayList<Map<String, Object>>();
		/*add code here to read file and insert the item in to listA*/
	    
		inventoryTest a = new inventoryTest(listA);
		a.data();
	        //a.addItem("A");
	        //a.removeItem("H");
     }
    
}

