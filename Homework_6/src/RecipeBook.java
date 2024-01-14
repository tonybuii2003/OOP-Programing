
import java.util.ArrayList;
import java.util.Arrays;

public class RecipeBook {
	private String bookName;
	private ArrayList<CookingRecipe> cookingRecipe;
	public RecipeBook(String bookName) {
		this.bookName = bookName;
		this.cookingRecipe = new ArrayList<CookingRecipe>();
	}
	public String getName() {
		return bookName;
	}
	public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients) {
	//adds to the book and returns a new cooking recipe with the given parameters. If recipe book already contains a recipe with the same name, do not create a new one and return null.
		if (!cookingRecipe.contains(ingredients)) {
			CookingRecipe temp = new CookingRecipe(name);
			ArrayList<RecipeIngredient> recipe = new ArrayList<> (Arrays.asList(ingredients));
			temp.setRecipeIngredient(recipe);
			cookingRecipe.add(temp);
			return temp;
		}
		return null;
	}
	public CookingRecipe removeRecipe(String name) {
	//removes the cooking recipe from the coocking book and returns it. If recipe book does not contain a recipe with the specified name, then return null.
			for (CookingRecipe i: cookingRecipe) {
				if (i.getName().equals(name)) {
					cookingRecipe.remove(i);
					return i;
				}
			}
		
		return null;
	}


	public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients) {
	//returns all cooking recipes from the cooking book that contain all the ingredients passed as parameters. If recipe book does not contain any recipe with the specified ingredients, then return null.
		int count = 0;
		CookingRecipe[] recipes = new CookingRecipe[cookingRecipe.size()];
		ArrayList<RecipeIngredient> recipe = new ArrayList<> (Arrays.asList(ingredients));
		for (CookingRecipe i: cookingRecipe) {
			if (i.getRecipeIngredient().equals(recipe)) {
				recipes[count++] = i;
			}
		}
		if (count!=0) {
			return recipes;
		}
			return null;
	}
//
	public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients) {
		//returns all cooking recipes from the cooking book that contain less than or equal the number of ingredients passed as parameter. If recipe book does not contain any recipe with the specified number of ingredients, then return null.
		CookingRecipe[] recipes = new CookingRecipe[cookingRecipe.size()];
		int count=0;
		for (CookingRecipe i: cookingRecipe) {
			if (i.getRecipeIngredient().size() <= numberOfIngredients) {
				recipes[count++] = i;
			}
		}
		if (count != 0) {
			CookingRecipe[] result = new CookingRecipe[count];
			for (int i = 0; i<count; i++) 
				result[i]=recipes[i];
			return result;
			} 
			return null;
	}
	public String toString() {
		String str = "\nRecipe: \n";
		for (CookingRecipe i: cookingRecipe) {
			str+= i + " ";
		}
		return "Book name: " + bookName + str;
	}


}
