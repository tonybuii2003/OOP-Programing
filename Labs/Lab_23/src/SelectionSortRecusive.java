public class SelectionSortRecusive {
    public static void sort(int[] list) {
        sort(list, 0, list.length - 1);
    }

    public static void sort(int[] list, int low, int high) {
        if (low < high) {
            int indexOfMin = low;
            int min = list[low];
            for (int i = low + 1; i <= high; i++) {
                if (list[i] < min) {
                    min = list[i];
                    indexOfMin = i;
                }
            }
            list[indexOfMin] = list[low];
            list[low] = min;
            sort(list, low + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] list = { 4, 5, 3, 7, 6, 1, 2, 0 };
        sort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
