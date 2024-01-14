import java.lang.module.FindException;

public class LargestArray {
    static int Largest = Integer.MIN_VALUE;

    public static void main(String[] args) {
        System.out.print(findLargest(new int[] { 1, 2, 3, 8, 5, 3, 2, 4 }, 0));
    }

    public static int findLargest(int[] list, int currentIndex) {
        if (currentIndex == list.length)
            return Largest;
        if (list[currentIndex] > Largest)
            Largest = list[currentIndex];
        return findLargest(list, currentIndex + 1);
    }

    public static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;

    }
}