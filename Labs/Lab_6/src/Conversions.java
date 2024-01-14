import java.util.Scanner;

public class Conversions {
	public static double poundsToKilos(double pounds)
	{
		return pounds/2.2;
	}
	public static double kilosToPounds(double pounds)
	{
		return pounds*2.2;
	}
	public static double kmToM(double pounds) {
		return pounds*1000;
	}
	public static  double mToKm(double pounds) {
		return pounds/1000;
	}

	public static double celsiusToFarenheit(double pounds) {
		return (9.0/5) * pounds + 32;
	}

	public static double farenheitToCelsius(double pounds) {
		return (pounds - 32)*5.0/9;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean exit = false;
		double input = 0;
		String key = "";
		
		while (exit == false)
		{
			
			System.out.print("A - convert pounds to kilos \n");
			System.out.print("B - convert kilos to pounds \n");
			System.out.print("C - convert kilometers to miles \n");
			System.out.print("D - convert miles to kilometers \n");
			System.out.print("E - convert Celsius to Fahrenheit \n");
			System.out.print("F - convert Fahrenheit to Celsius \n");
			System.out.print("X - Exit \n");
			Scanner inp = new Scanner(System.in);
			System.out.println("Enter your option: ");
			key = inp.nextLine();
			
			
			if (key.equals("A"))
			{
				System.out.println("Enter a quantity in pounds:");
				input = inp.nextDouble();
				System.out.printf("%.4f %n",poundsToKilos(input));
			}
			if (key.equals("B"))
			{
				System.out.println("Enter a quantity in pounds:");
				input = inp.nextDouble();
				System.out.printf("%.4f %n",kilosToPounds(input));
			}
			if (key.equals("C"))
			{
				System.out.println("Enter a quantity in pounds:");
				input = inp.nextDouble();
				System.out.printf("%.4f %n",kmToM(input));
			}
			if (key.equals("D"))
			{
				System.out.println("Enter a quantity in pounds:");
				input = inp.nextDouble();
				System.out.printf("%.4f %n",mToKm(input));
			}
			if (key.equals("E"))
			{
				System.out.println("Enter a quantity in pounds:");
				input = inp.nextDouble();
				System.out.printf("%.4f %n",celsiusToFarenheit(input));
			}
			if (key.equals("F"))
			{
				System.out.println("Enter a quantity in pounds:");
				input = inp.nextDouble();
				System.out.printf("%.4f %n",farenheitToCelsius(input));
			}
			if (key.equals("X"))
			{
				exit = true;
			}
			
		}
	}	

}
