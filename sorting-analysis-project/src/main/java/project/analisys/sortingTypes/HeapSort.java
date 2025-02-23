package project.analisys.sortingTypes;

public class HeapSort {
    public static <T extends Comparable<? super T>> void heapSort(T[] a) {
        buildMaxHeap(a);
        for (int i = a.length - 1; i > 0; i--) {
            Exchange.exchange(a, 0, i);
            maxHeapify(a, 0, i);
        }
    }

    private static <T extends Comparable<? super T>> void buildMaxHeap(T[] a) {
        for (int i = a.length / 2 - 1; i >= 0; i--) {
            maxHeapify(a, i, a.length);
        }
    }

    private static <T extends Comparable<? super T>> void maxHeapify(T[] a, int i, int n) {
        int max = 2 * i + 1;
        if (max + 1 < n && a[max].compareTo(a[max + 1]) < 0) max++;
        if (max < n && a[max].compareTo(a[i]) > 0) {
            Exchange.exchange(a, i, max);
            maxHeapify(a, max, n);
        }
    }
}
