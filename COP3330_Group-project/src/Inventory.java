import java.util.HashMap;

public class Inventory {                        // Inventory accounts for the available stock in the system. Items will be removed from the inventory as dishes are prepared.

	HashMap<String, Integer> stock = new HashMap<String, Integer>();
	
	Inventory()                                 // non-arg constructor to initialize the Inventory object
	{
		
	}
	
	void addStock(String name, int count)      // Inserts inputted values into the HashMap
	{
		this.stock.put(name, count);
	}
	
	void printStock()                          // Prints a list of the available inventory along with the quantity of each item. 
	{

		int j = 1;
		for(String i : stock.keySet())
		{
			System.out.println(j + ". " + i + ", count: " + stock.get(i));
			j++;
		}
    
	}
}
