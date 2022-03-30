// COP3330 Group Project
// Team Members: James Gonzalez, Ben 
// Program will function as an inventory manager for a resturant.


import java.util.ArrayList;
import java.util.Scanner;


public class Main_Project {
    public static void main (String[] args){
    	Scanner input = new Scanner(System.in);
    	
    	
    }
}

class Item 
{
	private String name;
	private int count;
	private double unitCost;
	
	Item(String name, int count, double unitCost)
	{
		this.name = name;
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
	Scanner input = new Scanner(System.in);

	private String name;
	private Item[] ingredients;
	private double price;
	
	MenuItem(String name, Item[] ingredients, double price)
	{
		this.name = name;
		this.ingredients = ingredients;
		this.price = price;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void addIngredient()
	{
		System.out.println("Add an ingredient from List");
		for(int i = 0; i < this.; i++)
		{
			System.out.println((i+1)+ ". " + ingredients.);
		}
	}
}