import javax.print.event.PrintEvent;

public class Test1 {
    public static void main(String[] args) {
        Bicycle b =  new Bicycle("Tony", 4);
        MotorizedVehicle m = new MotorizedVehicle("JK", 4, 20);
        System.out.print("Print bike: \n" + b);
        System.out.print("\nPrint Motored Vehicle: \n" + m);
        System.out.print("\nHorse Power: " + m.housePower());
    }
}
