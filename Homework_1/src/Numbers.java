/*
 * Name: Phi Long Bui
 * SBU ID: 14555975
 */
import java.util.Scanner;
public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = inp.nextInt();
		System.out.println("Is " + num + " divisible by 5 and 6? " + (num % 5 == 0 && num % 6 == 0));
		System.out.println("Is " + num + " divisible by 5 or 6? " + (num % 5 == 0 || num % 6 == 0));	
		System.out.println("Is " + num + " divisible by 5 or 6, but not both? " +(num % 5 == 0 ^ num % 6 == 0));
		inp.close();
	}

}
