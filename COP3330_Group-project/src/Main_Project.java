// COP3330 Group Project
// Team Members: James Gonzalez, Ben 
// Program will function as an inventory manager for a resturant.

import java.lang.*;
import java.util.*;
import java.util.Scanner;


public class Main_Project {
    public static void main (String[] args){
    	Scanner in = new Scanner(System.in);
    	Inventory ingredients = new Inventory();
    	Menu menu = new Menu(ingredients);
    	int choice;
    	int flag = 1;
    	
    	while(flag == 1)
    	{
    		System.out.println("What would you like to do\n"
    						 + "1. add stock\n"
    						 + "2. add menu item\n"
    						 + "3. make menu item\n"
    						 + "4. check inventory\n"
    						 + "5. show Menu\n"
    						 + "6. Exit");
    		choice = in.nextInt();
    		switch(choice)
    		{
    			case 1:
    				System.out.print("Enter stock item name and count");
    				String name = in.next();
    				int count = in.nextInt();
    				ingredients.addStock(name, count);
    				break;
    			case 2:
    				menu.addMenuItem();
    				break;
    			case 3:
    				menu.makeItem();
    				break;
    			case 4:
    				ingredients.printStock();
    				break;
    			case 5:
    				menu.printMenu();
    				break;
    			case 6:
    				flag = 0;
    				break;	 				
    		}
    	}
    	
    }
}