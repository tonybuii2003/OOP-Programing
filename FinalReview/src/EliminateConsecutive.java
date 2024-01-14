// import java.util.ArrayList;

// public class EliminateConsecutive {
// public static void main(String[] args) {
// int[] a = { 1, 1, 2, 2, 2, 2, 3, 4, 4, 4 };
// // ArrayList b = compress(a);

// printArr(b);
// }

// public static void printArr(ArrayList a) {
// for (Object i : a) {
// System.out.print(i + " ");
// }
// }

// public static void printArr(int[] a) {
// for (int i : a) {
// System.out.print(i + " ");
// }
// }

// public static ArrayList compress(int[] a) {
// ArrayList b = new ArrayList();
// compress(a, b, 0);
// return b;
// }

// public static int[] compressInt(int[] a) {
// int[] b = new int[a.length];
// compressInt(a, b, 0, 0);
// return b;
// }

// public static void compress(int[] a, ArrayList b, int pos) {

// if (pos == a.length - 1) {
// b.add(a[a.length - 1]);
// return;
// }
// if (a[pos] != a[pos + 1])
// b.add(a[pos]);
// compress(a, b, pos + 1);
// }

// public static void compressInt(int[] a, int[] b, int i, int j) {
// if (i == a.length - 1) {
// b[j] = a[i];
// return;
// }
// if (a[i] != a[i + 1])
// b[j++] = a[i];
// compressInt(a, b, i + 1, j);
// }
// }
