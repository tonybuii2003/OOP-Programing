import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//INPUT
		Scanner key = new Scanner(System.in);
		double fixedPrice = 100;
		System.out.println("Fixed price: " + fixedPrice);
		System.out.print("Quality: ");
		int quality = key.nextInt();
		//VAR
		int discount = 0;
		double discountPrice = 0;
		double discountAmount = 0;
		double totalPrice = 0;
		//METHOD
		if (quality >= 10 && quality <= 19)
		{
			discount = 20;
			
		}
		if (quality >= 20 && quality <= 49)
		{
			discount = 30;
		}
		if (quality >= 50 && quality <= 99)
		{
			discount = 40;
		}
		if (quality >= 100)
		{
			discount = 50;
		}
		//Calculation
		discountAmount = fixedPrice*discount/100;
		discountPrice = fixedPrice - discountAmount;
		totalPrice = discountPrice*quality;
		//OUTPUT
		System.out.println("Discount: " + discount + "%");
		System.out.println("Discount price: " + "$" + discountPrice);
		System.out.println("Discount amount per unit: " + "$" + discountAmount);
		System.out.println("Total price: " + "$" + totalPrice);
	}

}
