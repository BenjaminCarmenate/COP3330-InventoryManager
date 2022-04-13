// COP3330 Group Project
// Team Members: James Gonzalez, Benjamin Carmenate
// Program will function as an inventory manager for a resturant.

import java.lang.*;
import java.util.*;
import java.util.Scanner;


public class Main_Project {
    public static void main (String[] args){
    	Scanner in = new Scanner(System.in);                                // Variable Initialization
    	Inventory ingredients = new Inventory();
		Transcation List = new Transcation();
    	Menu menu = new Menu(ingredients, List);
    	int choice;
    	int flag = 1;
    	
    	while(flag == 1)                                                    // While statement allows the menu to remain active until flag is changed.
    	{
            System.out.println("");
    		System.out.println("What would you like to do\n"
    						 + "1. Add Stock\n"
    						 + "2. Add Menu Item\n"
    						 + "3. Make Menu Item\n"
    						 + "4. Check Inventory\n"
    						 + "5. Show Menu\n"
							 + "6. Show Past Orders\n"
    						 + "7. Exit\n");
            
            System.out.print("Current Selection: ");
                             
                             
    		choice = in.nextInt();
    		switch(choice)                                                   // Allows for the user to input any of the wanted commands.
    		{
    			case 1:                                                      // Inputed item is inserted into the Ingredients HashMap along with its quantity
    				System.out.print("Enter stock item name and count: ");
    				String name = in.next();
    				int count = in.nextInt();
    				ingredients.addStock(name, count);
    				break;
    			case 2:
    				menu.addMenuItem();                                      // Allows the user to add an item into the menu.
    				break;
    			case 3:
    				menu.makeItem();                                         // Allows the user to make an item that was inputted into the system while also subtracting the ingredients from the inventory.
    				break;
    			case 4:
    				ingredients.printStock();                                // Displays the available stock.
    				break;
    			case 5:
    				menu.printMenu();                                        // Prints the current menu along with the ingredients that will be deducted.
    				break;
				case 6:
				    List.PrintTrans();
					break;
				case 7:                                                      // Exits the switch statement and ends the program.
    				flag = 0;
    				break;
				default: System.out.println("\nPlease Input Valid Option");				
    		}
    	}
    	
    }
}