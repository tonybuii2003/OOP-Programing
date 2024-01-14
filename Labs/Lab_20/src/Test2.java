import java.util.function.ToDoubleBiFunction;

public class Test2 {
    public static void main(String[] args) {
        Fruit lemon = new Fruit(100, "Lemon", "Spring");
        LiquidFood honey = new LiquidFood(200, "Honey", 2000);
        System.out.print("Print Lemon: "+ lemon + "\nCalories to serve 2: " + lemon.totalCaloires(2) + "\nSeason: " + lemon.getSeason());
        System.out.print("\nPrint honey: " + honey + "\nCalories to serve 3: " + honey.totalCaloires(3) + "\nViscostity: " + honey.getViscostity());

    }
}
