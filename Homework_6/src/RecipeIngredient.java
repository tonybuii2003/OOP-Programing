
public class RecipeIngredient extends Ingredient {
	public void setQuantity(float q) {
		this.quantity = q;
	}
	public float getQuantity() {
		return quantity;
	}
	private float quantity;
	public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quantity) {
		super(name, measuringUnit, caloriesPerUnit);
		this.quantity = quantity;
	}
	public boolean equals(Object i) {
		if (i instanceof RecipeIngredient)
			return ((RecipeIngredient)i).getName() == getName() 
			&& ((RecipeIngredient)i).getMeasuringUnit() == getMeasuringUnit()
			&& ((RecipeIngredient)i).getCaloriesPerUnit() == getCaloriesPerUnit()
			&& ((RecipeIngredient)i).getQuantity() == quantity;
		return false;
	}
	public String toString() {
		return super.toString() + "\nQuantity: " + quantity;
	}
}
