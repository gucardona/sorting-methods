package project.analisys.sortingTypes;

import java.util.Stack;

public class QuickSort {
    public static <T extends Comparable<? super T>> void quickSort(T[] a) {
        iterativeSort(a, 0, a.length - 1);
    }

    private static <T extends Comparable<? super T>> void iterativeSort(T[] a, int low, int high) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{low, high});

        while (!stack.isEmpty()) {
            int[] range = stack.pop();
            low = range[0];
            high = range[1];

            if (low >= high) continue;

            int p = partition(a, low, high);
            if (p - 1 > low) stack.push(new int[]{low, p - 1});
            if (p + 1 < high) stack.push(new int[]{p + 1, high});
        }
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