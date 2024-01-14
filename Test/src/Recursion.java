import java.util.Scanner;

public class Recursion {
    public static long factorial(int n){ 

        if (n > 0 && n != 0)
        return n*factorial(n-1);
        else
        return 1;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = inp.nextInt();
        System.out.println(factorial(n));
        inp.close();
    }
}
