
public class Tri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > n-i-1; j--) {
				System.out.print(" ");
			}

			for (int j = i; j<=n; j++) {
				System.out.print(j + " ");
			}
			for (int j = n-1; j>=i; j--) {
			System.out.print( j + " ");
			}
			System.out.println();
		}

	}

}
