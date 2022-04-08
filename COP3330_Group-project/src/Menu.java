import java.util.HashMap;
import java.util.*;

public class Menu {
	HashMap<String, MenuItem> menu = new HashMap<String, MenuItem>();
	Scanner in = new Scanner(System.in);
	Inventory inventory;
	
	Menu(Inventory inventory)
	{
		this.inventory = inventory;
	}
	
	void addMenuItem()
	{
		System.out.println("Enter menu item name: ");
		String name = in.next();
		System.out.println("Add ingredient names from List followed by spaces (enter 0 to stop)\n");
		inventory.printStock();
		String ingredients[] = new String[100];
		
		String ingredient = "a";
		int i = 0;
		while(Character.isAlphabetic(ingredient.charAt(0)))
		{
			ingredient = in.next();
			ingredients[i++] = ingredient;
		}
		this.menu.put(name, new MenuItem(name, inventory, ingredients));
	}
	
	void makeItem()
	{
		System.out.println("Enter menu item name: ");
		String name = in.next();
		String[] temp = this.menu.get(name).ingredients;
		for(String i: temp)
		{
			if(this.inventory.stock.containsKey(i))
			{
				int count = (this.inventory.stock.get(i));
				this.inventory.stock.put(i, (count-1));
			}
		}
	}
	
	void printMenu()
	{
		int j = 1;
		for(String i : menu.keySet())
		{
			System.out.println(j + ". " + i +"\n " + menu.get(i).ingredients[0]);
			j++;
		}
	}
}
