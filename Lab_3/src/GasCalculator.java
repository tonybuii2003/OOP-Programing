import java.util.Scanner;

public class GasCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Enter the number of minutes:");
		double min = inp.nextDouble();
		System.out.println("Enter the constant speed of the car (m/h):");
		double speed = inp.nextDouble();
		System.out.println("Enter the fuel efficiency of the car (m/g):");
		double efficiency = inp.nextDouble();
		
		double hours = min/60;
		double result = hours * speed * (1/efficiency);
		System.out.println("Consumed gas for the period (in gallons):" + result);
		inp.close();
	}

}
