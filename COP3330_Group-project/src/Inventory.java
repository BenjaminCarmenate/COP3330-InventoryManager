import java.util.HashMap;

public class Inventory {
	HashMap<String, Integer> stock = new HashMap<String, Integer>();
	
	Inventory()
	{
		
	}
	
	void addStock(String name, int count)
	{
		this.stock.put(name, count);
	}
	
	void printStock()
	{
		int j = 1;
		for(String i : stock.keySet())
		{
			System.out.println(j + ". " + i + ", count: " + stock.get(i));
			j++;
		}
	}
}
