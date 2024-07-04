package project.analisys.sortingTypes;

public class QuickSort {
    public static <T extends Comparable<? super T>> void quickSort(T[] a) {
        sort(a, 0, a.length - 1);
    }

    private static <T extends Comparable<? super T>> void sort(T[] a, int low, int high) {
        if (low >= high) return;
        int p = partition(a, low, high);
        sort(a, low, p - 1);
        sort(a, p + 1, high);
    }

    private static <T extends Comparable<? super T>> int partition(T[] a, int low, int high) {
        T pivot = a[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (a[j].compareTo(pivot) <= 0) {
                Exchange.exchange(a, ++i, j);
            }
        }
        Exchange.exchange(a, i + 1, high);
        return i + 1;
    }
}
