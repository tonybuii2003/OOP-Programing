public class LiquidFood extends Food {
    int viscostity;
    public LiquidFood(int calories, String description, int viscostity) {
        super(calories, description);
        this.viscostity = viscostity;
    }
    public int getViscostity(){
        return viscostity;
    }
    public void setViscostity(int viscostity){
        this.viscostity = viscostity;
    }
    public int totalCaloires(int servings){
        return calories*servings;
    }
}
