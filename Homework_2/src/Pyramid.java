import java.util.Scanner;


public class Pyramid {
	public static void printPyramid(int num) {
		for (int pow = 0; pow < num; pow++) {
			for (int i = num-pow-1; i>=0; i--) {
				System.out.print("  ");
			}
			//Print the left side
			for (int pow2 = 0; pow2 < pow; pow2++) {
				System.out.print((int)Math.pow(2,pow2) + " ");	
			}
			//Print the right side
			for (int pow2 = pow; pow2 >= 0 ; pow2--) {
				System.out.print((int)Math.pow(2,pow2) + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.println("Input: ");
		int numLines = inp.nextInt();
		printPyramid(numLines);
		inp.close();
		}

}
