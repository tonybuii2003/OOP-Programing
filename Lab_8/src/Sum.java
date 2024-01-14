import java.util.Scanner;

public class Sum {
	public static double[] sumColumn(double [][] m) {
		double total;
		double[] totalArr = new double[m[0].length];
		for (int i = 0; i<m.length;i++) {
			total = 0;
			for (int j = 0; j<m[i].length; j++) {
				total += m[i][j];
			}
			totalArr[i] = total;
		}
		return totalArr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = inp.nextInt();
		System.out.println("Enter the number of columns: ");
		int columns = inp.nextInt();
		double[][] array = new double[rows][columns];
		inp.nextLine();
		System.out.println("Enter the maxtri row by row, line by line");
		for (int i = 0; i < rows; i++) {
			
			String input = inp.nextLine();
			String[] inputAfterSplit = input.split(" ");
			for (int j = 0; j < columns && j < inputAfterSplit.length; j++) {
				if (!inputAfterSplit[j].equals(""))
					array[i][j] = Double.parseDouble(inputAfterSplit[j]);
			}
		}
		double[] result = sumColumn(array);
		System.out.print("The sum of each column: ");
		for (int i = 0; i<array.length; i++) {
				System.out.print(result[i] + " ");
		}
		inp.close();
	}

}
