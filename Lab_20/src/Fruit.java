public class Fruit extends Food {
    String season;
    public Fruit(int calories, String description, String season) {
        super(calories, description);
        this.season = season;
    }
    public String getSeason(){
        return season;
    }
    public void setSeason(String season){
        this.season = season;
    }
    public int totalCaloires(int servings){
        return calories*servings;
    }
    
}
