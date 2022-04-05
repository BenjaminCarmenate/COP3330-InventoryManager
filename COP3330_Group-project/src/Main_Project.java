// COP3330 Group Project
// Team Members: James Gonzalez, Ben 
// Program will function as an inventory manager for a resturant.

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Project {
    public static void main (String[] args){
    Scanner input = new Scanner(System.in);

    int p = 0;

    Inventory MainInv = new Inventory();
    ArrayList<MenuItem> MenuItemList = new ArrayList();


        while(true) {
        System.out.println("Hello, what would you like to do today?");
        System.out.println("1. Check Inventory");
        System.out.println("2. Prepare a Dish");
        System.out.println("3. Add Item to Menu");
        System.out.println("4. Remove Item from Menu");
        System.out.println("5. Check Transaction History");
        System.out.print("\nYou Are Selecting Option: ");

        int choice = input.nextInt();

        switch (choice){ 

       case 1: System.out.println("Now Displaying The Current Available Inventory: ");
       System.out.println("Bacon: " + MainInv.getBacon() + "\nBread: " + MainInv.getBread() + "\nCheese: " + MainInv.getCheese() + "\nLettuce: " + MainInv.getLettuce() + "\nTomatoes: " + MainInv.getTomatoes());

       break;


       case 2: 

       System.out.print("Please Select a Dish: ");

       break;
        


       case 3: 

        MenuItem MIL = new MenuItem();
        
        System.out.print("\nPlease enter name of the new item: ");
        input.nextLine();
        MIL.setName(input.nextLine());

        System.out.print("Please enter the price: ");
        MIL.setPrice(input.nextDouble());;

        System.out.print("Please enter the 3 items used in this dish: ");
        input.nextLine();
        MIL.setItems(input.nextLine());

        for ( int i = 0; i < 3; i++){

          MIL.setItems(input.nextLine() + ", " + "\n");

        }

        MenuItemList.add(MIL);

        

       // MenuItem MIL2 = new MenuItem();
       // MIL2 = MenuItemList.get(0);

       //System.out.println(MIL2.getMenuItem() + "");

       break;

       case 4:

       case 5:
    }

        

        }


        


     




    }
}

class Item 
{
	private String name;
	private int count;
	private double unitCost;

	Item(String Name, int count, double unitCost)
	{
		this.name = Name;
		this.count = count;
		this.unitCost = unitCost;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public void setCount(int count)
	{
		this.count = count;
	}
	public void setUnitCost(double unitCost)
	{

		this.unitCost = unitCost;
	}
	public String getName()
	{
		return this.name;
	}
	public int getCount()
	{
		return this.count;
	}
	public double getUnitCost()
	{
		return this.unitCost;
	}
}

class MenuItem
{
	private String name;
	private double price;
    private String item;


    MenuItem()
	{
		this.name = "NA";
		this.price = 0;
		
	}

	//MenuItem(String name, ArrayList ingredients, double price)
	MenuItem(String name, double price, String item)
	{
		this.name = name;
		this.item = item;
		this.price = price;

	}

    public void setName(String x) {
        this.name = x;
    }

    public void setPrice(double x) {
        this.price = x;
    }

    public void setItems(String x) {
        this.item = x;
    }

    public String getMenuItem() {

        String MU = this.name + "" + this.price + "" + this.item;

        return MU;
    }

}

class Inventory {

    private int Cheese;
    private int Lettuce;
    private int Bread;
    private int Tomatoes;
    private int Bacon;

    Inventory () {

    this.Cheese = 100;
    this.Lettuce = 100;
    this.Bread = 200;
    this.Tomatoes = 100;
    this.Bacon = 100;

    }

    public int getCheese() {
        return Cheese;
    }

    public int getLettuce() {
        return Lettuce;
    }

    public int getBread() {
        return Bread;
    }

    public int getTomatoes() {
        return Tomatoes;
    }

    public int getBacon() {
        return Bacon;
    }

    public void setCheese(int x) {
        Cheese -= x;
    }

    public void setLettuce(int x) {
        Lettuce -= x;
    }

    public void setBread(int x) {
        Bread -= x;
    }

    public void setTomatoes(int x) {
        Tomatoes -= x;
    }

    public void setBacon(int x) {
        Bacon -= x;
    }

}

class BLT {

    private int BLTcount = 0;
    Inventory BLTing = new Inventory();


    BLT(int Cheese, int Lettuce, int Bread, int Bacon, int Tomatoes) {            // Makes the BLT and removes ingredients from the inventory

        BLTing.setBacon(1);
        BLTing.setBread(1);
        BLTing.setBread(1);
        BLTing.setLettuce(1);
        BLTing.setTomatoes(1);
        BLTcount++;

    }

    public int GetBLTcount() {
        return BLTcount;
    }





	//public void setName(String name)
	//{
	//	this.name = name;
	//}

	//public String getName()
	//{
	//	return this.name;
	//}

//	public void addIngredient()
//	{
	//	System.out.println("Add an ingredient from List");
	//	for(int i = 0; i < this.; i++)
	//	{
			//System.out.println((i+1)+ ". " + ingredients.);
	//	}
	//}
} 