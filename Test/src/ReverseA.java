public class ReverseA {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        reverse(arr, 0);
        for (int i : arr)
            System.out.print(i + " ");
    }

    public static void reverse(int[] arr, int startingPoint) {
        if (startingPoint >= arr.length - 1 - startingPoint)
            return;
        else {
            int temp = arr[startingPoint];
            arr[startingPoint] = arr[arr.length - 1 - startingPoint];
            arr[arr.length - 1 - startingPoint] = temp;

        }
        reverse(arr, startingPoint += 1);
    }
}
