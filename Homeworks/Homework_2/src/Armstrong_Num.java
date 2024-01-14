import java.util.ArrayList;
import java.util.Scanner;

public class Armstrong_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner (System.in);
		System.out.println("Enter the lower limit: ");
		int a = inp.nextInt();
		System.out.println("Enter the upper limit: ");
		int b = inp.nextInt();
		int sum = 0;
		int digits = 0;
		ArrayList<Integer> result = new ArrayList<Integer>();
		String str = "";
		
		for (int i = a; i <= b; i++) { // read all elements in [a,b]
			str = "" + i; //convert into string
			for (int j = 1; j<= str.length(); j++) {
				digits = ((i % (int)Math.pow(10, j) - (i%(int)Math.pow(10,j-1)))/(int)Math.pow(10, j-1)); // take each digits
				sum += (int)Math.pow(digits, str.length()); // add the digit ^ str.length (the number of digits)
			}
			if(sum == i) {
				result.add(i);
			}
			sum = 0;
		}
		System.out.print("The Armstrong numbers between "+a+" and "+b+" are:");
		for (int i:result) {
			System.out.print(" ");
			System.out.print(i);
		}
		inp.close();
	}

}
