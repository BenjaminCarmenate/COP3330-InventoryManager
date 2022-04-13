import java.util.HashMap;
import java.util.*;

public class Menu  {                                                       // The Menu is the most important class. Its based on 
	HashMap<String, MenuItem> menu = new HashMap<String, MenuItem>();
	Scanner in = new Scanner(System.in);
	Inventory inventory;
	Transcation List;
	
	Menu(Inventory inventory, Transcation List)                                             // arg constructor to initialize an Inventory object with the desired values
	{
		this.inventory = inventory;
		this.List = List;
	}
	
	void addMenuItem()                                                   // Adds a dish into the Menu. Also connects to the ingredients class so that each of the inserted dishes can have multiple ingredients connected to it.
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
	
	void makeItem()                                                       // Menu item is prepared. One count of ingredients is deducted from the total stock based on the ingredients needed for the dish.
	{
		System.out.print("Enter menu item name: ");
		String name = in.next();
		

        if (menu.isEmpty()){                                              // Ensures that only an item inside of the menu can be printed.               

            System.out.println("\nThis Menu Item Does Not Exist");
        }
        else{
		List.AddTrans(name);
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
}
	
	void printMenu()                                                       // Prints out the menu that the user created. The ingredients that are going to be used are also printed out to inform the user of the loss of stock.
	{
		int j = 1;
		System.out.println("Your Current Menu is Listed Below: ");
		for(String i : menu.keySet())                                     // Retrieves each member inside of the HashMap so that the entire list can be printed.
		{
			System.out.print(j + ". " + i +"\n ");

			for(int q = 0; q < menu.get(i).ingredients.length ; q++){

			if (!"0".equals(menu.get(i).ingredients[q])){                 // For simplicity, if the array were to print a zero then the code breaks and only the menu items are printed.
			System.out.println(menu.get(i).ingredients[q]);
			}
			else 
			break;
			
			}
			System.out.println("");
			j++;

		}
	}
}
