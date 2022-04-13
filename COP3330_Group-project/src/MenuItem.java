public class MenuItem {                                                          // Items stored inside of the menu. The user can add multiple dishes inside of the menu and then select which dish they would like to prepare.

		private String name; 
		Inventory inventory;
		String[] ingredients;
		
		MenuItem(String name, Inventory inventory, String[] ingredients)         // arg constructor to initialize the MenuItem object with the desired values
		{
			this.name = name;
			this.inventory = inventory;
			this.ingredients = ingredients;
		}
		
		public void setName(String name)                                        // Getter and Setter methods 
		{
			this.name = name;
		}
		
		public String getName()
		{
			return this.name;
		}
		
		public void addIngredient(String name)                          
		{

			this.inventory.stock.get(name);
		}
}
