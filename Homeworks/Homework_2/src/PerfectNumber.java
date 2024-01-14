import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.println("Input:");
		int num = inp.nextInt();
		int sum = 0;
		System.out.print("The perfect numbers below " + num +  " are: ");
		for (int i = 1; i<=num; i++) {
			for (int j = i-1; j>0; j--) {
				if (i%j == 0) {
					sum+=j;
				}
			}
			if (sum==i) {
				System.out.print(i + " ");
			}
			sum=0;
		}
		inp.close();
	}

}
