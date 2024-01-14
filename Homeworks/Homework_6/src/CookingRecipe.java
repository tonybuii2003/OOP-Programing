import java.util.ArrayList;

public class CookingRecipe {
	private String name;
	private ArrayList<RecipeIngredient> recipeIngredient;
	public CookingRecipe(String name) {
		this.name = name;
		this.recipeIngredient = new ArrayList<RecipeIngredient>();
	}
	public ArrayList<RecipeIngredient> getRecipeIngredient(){
		return recipeIngredient;
	}
	public void setRecipeIngredient(ArrayList<RecipeIngredient> r) {
		this.recipeIngredient = r;
	}
	public boolean equals(Object i) {
		if (i instanceof CookingRecipe) {
			return ((CookingRecipe)i).name == name && ((CookingRecipe)i).recipeIngredient == recipeIngredient;
		}
		return false;
	}
	public String getName() {
		return name;
	}
	public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity) { 
	//if the recipe already includes the ingredient specified by the parameter, then just update the quantity, otherwise add a new recipe ingredient.
		if (recipeIngredient.contains(ingredient)) {
			RecipeIngredient temp = new RecipeIngredient(ingredient.getName(),ingredient.getMeasuringUnit(),ingredient.getCaloriesPerUnit(),0);
			for (RecipeIngredient i: recipeIngredient) {
				if (i.equals(temp))
					i.setQuantity(quantity);
			}
		}
		else
			recipeIngredient.add(new RecipeIngredient(ingredient.getName(),ingredient.getMeasuringUnit(),ingredient.getCaloriesPerUnit(),quantity));
	}
	public RecipeIngredient getRecipeIngredient(Ingredient ingredient) {
		for (RecipeIngredient i: recipeIngredient) {
			if (ingredient.equals(i)) {
				return i;
			}
		}
		return null;
	}

	public RecipeIngredient getRecipeIngredient(String ingredientName) { 
	//returns the RecipeIngredient object corresponding to the ingredient object parameter, or return null if the ingredient is not part of the recipe.
		for (RecipeIngredient i: recipeIngredient) {
			if (i.getName().equals(ingredientName))
				return i;
		}
		return null; 
	}
	public RecipeIngredient removeRecipeIngredient(Ingredient ingredient) {
		if (recipeIngredient.contains(ingredient)) {
			for (RecipeIngredient i: recipeIngredient) {
				if (ingredient.equals(i)) {
					recipeIngredient.remove(i);
					return i;
				}
			}
		}
		return null;
		
	}

	public RecipeIngredient removeRecipeIngredient(String ingredientName) {
	//remove the given ingredient from the recipe. If the ingredient is part of the recipe return it, else return null.
		for (RecipeIngredient i: recipeIngredient) {
			if (i.getName().equals(ingredientName)) {
				recipeIngredient.remove(i);
				return i;
			}	
		}
		return null; 
	}
	public float calculateCalories() {
	//calculates the sum of the calories for all the ingredients in the recipes and their respective quantities.
	float sum = 0;
		for (RecipeIngredient i: recipeIngredient) {
			sum+=i.getCaloriesPerUnit();
		}
		return sum;
	}
	public int getNumberOfIngredients() {
	//returns the number of ingredients in the recipe.
		return recipeIngredient.size();

	}
	public String toString() { 
	//returns the recipe name and ingredients as a String.
		String str = "Ingredient for " + getName() + ": \n";
		for (RecipeIngredient i: recipeIngredient) {
			str += i.getQuantity() + " "+i.getName() + " " + i.getMeasuringUnit() + " Calories: " + i.getCaloriesPerUnit() + "\n"; 
		}
		return str+"\n";
	}
}
