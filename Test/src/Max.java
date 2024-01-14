import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = inp.nextInt();
		inp.nextLine();
		int[] array = new int[n];
		System.out.println("Nhap day: ");
		String day = inp.nextLine();
		String[] tach = day.split(" ");
		
		int min = Integer.parseInt(tach[0]);
		
		for (int i = 1; i<n; i++) {
			if (min > Integer.parseInt(tach[i])) {
				min = Integer.parseInt(tach[i]);
			}
		}
		System.out.println("So be nhat la: " + min);
	}

}
