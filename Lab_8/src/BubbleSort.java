import java.util.Scanner;

public class BubbleSort {
public static double[] bubbleSort(double[] list) {
	boolean changed = true;
	double temp;
	do {
	   changed = false;
	   for (int j = 0; j < list.length - 1; j++)

	      if (list[j] > list[j + 1]) {
	    	  temp = list[j];
	    	  list[j] = list[j+1];
	    	  list[j+1]=temp;

	         changed = true;
	      }
	   
	} while (changed);
	return list;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the array's size: ");
		int size = inp.nextInt();
		inp.nextLine();
		double[] array = new double[size];
		System.out.println("Enter the array (separate by a space): ");
		String input = inp.nextLine();
		String[] temp = input.split(" ");
		for (int i = 0; i<size;i++) {
		array[i] = Double.parseDouble(temp[i]);
		}
		array = bubbleSort(array);
		for (double i:array){
			System.out.print(i + " ");
		}
	}

}
