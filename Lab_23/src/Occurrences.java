public class Occurrences {
    public static void main(String[] args) {
        char[] test = { 'a', 'b', 'c', 'd', 'a', 'f' };
        System.out.print(count(test, 'f'));
    }

    public static int count(char[] chars, char ch) {
        return count(chars, ch, 0);
    }

    public static int count(char[] chars, char ch, int high) {
        if (high == chars.length)
            return 0;

        int num = 0;
        if (chars[high] == ch)
            num++;
        return num + count(chars, ch, high + 1);

    }
}
