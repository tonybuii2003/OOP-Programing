import java.util.Arrays;

public class ArrayUtils {
	public static int[] randomArray(int size, int upperLimit) {
		int[] result = new int[size];
		for (int i = 0; i<size; i++) {
			result[i] += (int)(Math.random() * upperLimit);
		}
		return result;
	}
	public static void print(int[] arr) {
		for (int i:arr) {
			System.out.print(i + " ");
		}
		System.out.print( "\n");
	}
	public static int arraySum(int[]arr) {
		int sum = 0;
		for (int i:arr) {
			sum+=i;
		}
		return sum;
	}
	public static int contains(int[] arr, int element) {
		int result = 0;
		for (int i = 0; i<arr.length;i++) {
			if (element == arr[i]) {
				result = i;
				break;
			}
			else
				result = -1;
		}
		return result;
	}
	public static int countMultiplesOf(int[] arr, int element) {
		int count = 0;
		if (element != 0) {
		for (int i = 0; i<arr.length;i++) {
			if (arr[i] % element == 0) {
				count ++;
			}
		}
	}
		else {
			return arr.length;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testArr1 = randomArray(100,21); // generate an array of random number from 5 to 101 and print it
		print(testArr1);
		System.out.println("The average of the array is: "+(double)arraySum(testArr1)/testArr1.length); // returns The sum of the array is: 21 
		int[] testArr2 = {1,2,1,3,7};
		System.out.println(contains(testArr2, 2)); // returns 1
		int[] mul = {8,7,7,16};
		System.out.println(countMultiplesOf(mul, 2)); // returns 2 because 8 and 16 are multiples of 2
	}

}
