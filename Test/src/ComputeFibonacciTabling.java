import java.util.Scanner; // Dynamic programming

public class ComputeFibonacciTabling { // NO REPEATED COMPUTATION
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index for the Fibonacci number: ");
        int index = input.nextInt();
        f = new int[index + 1];
        System.out.println("Fibonacci(" + index + ") is " + fib(index));
    }

    public static int[] f;

    public static int fib(int index) {
        if (index == 0)
            return 0;
        if (index == 1) {
            f[1] = 1;
            return 1;
        }
        if (f[index] != 0)
            return f[index];
        else // Reduction and recursive calls
            f[index] = fib(index - 1) + f[index - 2];
        return f[index];
    }
}
