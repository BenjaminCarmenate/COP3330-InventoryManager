
public class Item {
	private String name;
	private int count;
	private double unitCost;
	

	Item(String name, int count, double unitCost)       // arg constructor to initialize an Item object with the desired values
	{
		this.name = name;
		this.count = count;
		this.unitCost = unitCost;
	}
	
	public void setName(String name)                    // Getter and Setter methods
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
