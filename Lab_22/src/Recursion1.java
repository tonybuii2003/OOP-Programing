public class Recursion1 {
    public static void main(String[] args) {
        // System.out.println(factorial(5)); // 120
        // System.out.println(factorial(6)); // 720
        // System.out.println(factorial(7)); // 5040

        // for (int i = 1; i <= 10; i++) {
        // System.out.println(sequenceSum(i));
        // }

        // System.out.println(sumDigits(154));
        // System.out.println(sumDigits(5832));
        // System.out.println(sumDigits(3456));

        // reverseDisplay(12345);

        // System.out.println(reverseNumber(12345));
    }

    public static long factorial(int n) {

        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static double sequenceSum(int n) {
        if (n == 1)
            return 1;
        return (1.0 / n) + sequenceSum(n - 1);

    }

    public static int sumDigits(long n) {
        String string = String.valueOf(n);
        if (string.length() < 2)
            return Integer.parseInt(string.substring(0, string.length()));
        else
            return Integer.parseInt(string.substring(0, 1));
    }

    public static void reverseDisplay(int value) {
        String string = String.valueOf(value);
        if (string.length() < 2) {
            System.out.print(string.substring(0));
        } else {
            reverseDisplay(Integer.parseInt(string.substring(1, string.length())));
            System.out.print(string.substring(0, 1));
        }
    }

    public static int reverseNumber(int value) {
        String string = String.valueOf(value);
        if (string.length() < 2) {
            return Integer.parseInt(string.valueOf(string.substring(0, 1)));
        }
        int result = reverseNumber(Integer.parseInt(string.substring(1, string.length())));
        String resultString = String.valueOf(result);
        resultString += string.substring(0, 1);
        return Integer.parseInt(resultString);
    }
}