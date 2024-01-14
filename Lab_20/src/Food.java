public abstract class Food {
    int calories;
    String description;
    public Food(int calories, String description){
        this.calories = calories;
        this.description = description;
    }
    public int getCalories(){
        return  calories;
    }
    public String getDescription(){
        return description;
    }
    public void setCalories(int calories){
        this.calories = calories;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String toString(){
        return "Name: " + description + "\nCalories: " + calories;
    }
    public abstract int totalCaloires(int serving);
}
