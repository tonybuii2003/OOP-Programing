/*
 * Name: Phi Long Bui
 * SBU ID: 14555975
 */
import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		double total;
		double priceOfDozenEgg = 3.25;
		double priceOfOneEgg = 0.45;
		Scanner inp = new Scanner(System.in);
		System.out.println("Input amount: ");
		int amount = inp.nextInt();
		System.out.println("Eggs amount: " + amount);
			int amountDozen = amount/12;
			int amountLeft = amount % 12;
			total = amountDozen*priceOfDozenEgg + amountLeft*priceOfOneEgg;
		System.out.println("The total price is: " + total);
		inp.close();
	}

}
