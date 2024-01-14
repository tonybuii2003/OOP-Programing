
public class Shilfing {
	public static void shiftRight(int[] arr, int[] shiftArr) {

		for (int i = 0; i <= arr.length - 2; i++) {
			shiftArr[i + 1] = arr[i];
		}
		shiftArr[0] = arr[arr.length - 1];
	}

	public static void shiftLeft(int[] arr, int[] shiftArr) {
		for (int i = 1; i <= arr.length - 1; i++) {
			shiftArr[i - 1] = arr[i];
		}
		shiftArr[arr.length - 1] = arr[0];
	}

	public static void shiftRightR(int[] arr, int startingPoint, int[] shiftArr) {
		if (startingPoint >= arr.length - 1) {
			shiftArr[0] = arr[arr.length - 1];
			return;
		} else {
			shiftArr[startingPoint + 1] = arr[startingPoint];
		}
		shiftRightR(arr, startingPoint += 1, shiftArr);
	}

	public static void shiftLeftR(int[] arr, int startingPoint, int[] shiftArr) {

		if (startingPoint > arr.length - 1) {
			shiftArr[arr.length - 1] = arr[0];
			return;
		} else {
			shiftArr[startingPoint - 1] = arr[startingPoint];
		}
		shiftLeftR(arr, startingPoint += 1, shiftArr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int[] shiftArr = new int[arr.length];
		shiftLeftR(arr, 1, shiftArr);
		for (int i : shiftArr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
