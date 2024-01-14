import java.util.Scanner;

public class DistinctNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i<10; i++) {
			System.out.println("Input number " + (i+1) + ":");
			arr[i] = key.nextInt();
		}
		int[] temp = new int[10];
		int count = 0;
		boolean in = false;
		int compareNum = 0;
		for (int i = 0; i<arr.length; i++) {
			for (int j = 0; j<count; j++) {
				if (temp[j] == arr[i]) {
					in = true;
					break;
				}
			}
			if (!in) {
				temp[count++] = arr[i];
				
			}
			in = false;
		}
		for (int i = 0; i< count; i++){
			System.out.print(temp[i] + " ");
		}
	}

}
