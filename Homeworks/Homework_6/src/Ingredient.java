
public class Ingredient {
	public String getName() {
		return name;
	}
	public String getMeasuringUnit() {
		return measuringUnit;
	}
	public int getCaloriesPerUnit() {
		return caloriesPerUnit;
	}
	private String name,measuringUnit;
	private int caloriesPerUnit;
	public Ingredient(String name, String measuringUnit, int caloriesPerUnit) {
		this.name = name;
		this.caloriesPerUnit = caloriesPerUnit;
		this.measuringUnit = measuringUnit;
	}
	public boolean equals(Object i) {
		if (i instanceof Ingredient) {
			return ((Ingredient)i).name == name && ((Ingredient)i).measuringUnit == measuringUnit && ((Ingredient)i).caloriesPerUnit == caloriesPerUnit;
		
		}
		return false;
	}
	public String toString() {
		return "Ingredient:\n"+ "name: " + name + "\n" + "measuringUnit: " + measuringUnit + "\n" + "caloriesPerUnit: " + caloriesPerUnit; 
	}
}
