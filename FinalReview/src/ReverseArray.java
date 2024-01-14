import java.io.FileNotFoundException;

public class ReverseArray {
    // Example reverse([1,2,3,4,5])? will change the input array into ([5,4,3,2,1])
    public static void main(String[] args) throws FileNotFoundException {
        int[] arr = { 1, 2, 3, 4, 5 };
        reverse(arr);
        printArray(arr);
    }

    public static void reverse(int[] arr, int l, int r) {
        // Use a helper method
        if (l >= r) {
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverse(arr, l + 1, r - 1);
    }

    public static void reverse(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        int[] b = new int[arr.length - 2];
        System.arraycopy(arr, 1, b, 0, b.length);
        reverse(b);
        System.arraycopy(b, 0, arr, 1, b.length);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
