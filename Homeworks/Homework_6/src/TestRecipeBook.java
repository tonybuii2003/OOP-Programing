
public class TestRecipeBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------- CookingRecipe.java -------");
		RecipeBook r1 = new RecipeBook("Tony");
		CookingRecipe  c1 = new CookingRecipe("Apple Pie");
		Ingredient re1 = new Ingredient("Sugar", "spoons", 10);
		c1.addOrUpdateRecipeIngredient(new Ingredient("Apple", "slices", 100), 0);
		c1.addOrUpdateRecipeIngredient(new Ingredient("Apple", "slices", 100), 10);
		c1.addOrUpdateRecipeIngredient(re1,3);
		System.out.println(c1);
		
		System.out.println("Get Recipe Ingredient:\n"+c1.getRecipeIngredient("Apple"));
		System.out.println("Total Calories:\n" + c1.calculateCalories());
		System.out.println("Number of Ingredients:\n"+c1.getNumberOfIngredients());
		System.out.println("------- RecipeBook.java -------");
		RecipeIngredient[] res1 = {new RecipeIngredient("Sugar", "spoons", 10, 10), new RecipeIngredient("Apple", "slices", 100, 3)};
		RecipeIngredient[] res2 = {new RecipeIngredient("Bread", "slices", 10, 10), new RecipeIngredient("Peanut Butter", "spoons", 100, 2), new RecipeIngredient("Jam", "spoons", 100, 2)};
		r1.addRecipe("Apple Pie", res1);
		r1.addRecipe("B&J Sandwich", res2);
		System.out.print(r1);
		r1.removeRecipe("Apple Pie");
		
		System.out.println(r1.findRecipes(res2)[0]);
		System.out.println(r1.findRecipesWithFewIngredients(10)[0]);
	}

}
