import java.util.Scanner;

public class MultiplyMatrices {
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		double[][] c = new double[a.length][b[0].length];
		int n = a.length;
		for (int j = 0; j<a.length; j++) {
			for (int i = 0; i<a.length;i++) {
				for (n = 0; n<b.length; n++) {
					c[i][j] += (a[i][n] * b[n][j]);
			}
		}
	}
		return c;
	}
	public static double[][] input() {
		Scanner inp = new Scanner(System.in);
		int rows = 3;
		int columns = 3;
		double[][] array = new double[rows][columns];
		System.out.println("Enter the maxtrix row by row, line by line in 3x3: ");
		for (int i = 0; i < rows; i++) {
			String input = inp.nextLine();
			String[] inputAfterSplit = input.split(" ");
			for (int j = 0; j < columns && j < inputAfterSplit.length; j++) {
				if (!inputAfterSplit[j].equals(""))
					array[i][j] = Double.parseDouble(inputAfterSplit[j]);
			}
		}
		return array;
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Input for array 1: ");
		double[][] arr1 = input();
		System.out.println("Input for array 2: ");
		double[][] arr2 = input();
		
		double [][] result = multiplyMatrix(arr1, arr2);
		for (double[] i : result) {
			for (double j : i) {
				System.out.print(j + " ");
			}
			System.out.println();		
		}
	}
}
