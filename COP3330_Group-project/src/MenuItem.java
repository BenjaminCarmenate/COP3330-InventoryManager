public class MenuItem {

		private String name;
		Inventory inventory;
		String[] ingredients;
		
		MenuItem(String name, Inventory inventory, String[] ingredients)
		{
			this.name = name;
			this.inventory = inventory;
			this.ingredients = ingredients;
		}
		
		public void setName(String name)
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
