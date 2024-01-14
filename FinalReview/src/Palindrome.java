public class Palindrome {
    public static void main(String[] args) {
        int[] p = { 1, 2, 3, 2, 1 };
        System.out.print(isPalindome(p));
    }

    public static boolean isPalindome(int[] p) {
        return palindome(p, 0, p.length - 1);
    }

    public static boolean palindome(int[] arr, int low, int high) {
        if (high <= low)
            return true;
        if (arr[low] != arr[high]) {
            return false;
        }
        return palindome(arr, low + 1, high - 1);
    }

    // public static palindrome(int[] arr){
    // if (arr.length <= 1)
    // return;

    // }
}
