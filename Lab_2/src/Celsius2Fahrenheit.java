import java.util.Scanner;

public class Celsius2Fahrenheit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//INPUT
		Scanner key = new Scanner(System.in);
		System.out.println("Your number: ");
		double celsius = key.nextDouble();
		
		// Convert:
		double fahrenheit = (9.0/5) * celsius + 32;
		
		//OUTPUT
		System.out.printf("%.2f",fahrenheit);
	
	}

}
