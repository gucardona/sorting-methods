package project.analisys.sortingTypes;

public class MergeSort {
    public static <T extends Comparable<? super T>> void mergeSort(T[] a) {
        T[] aux = (T[]) new Comparable[a.length];
        divide(a, aux, 0, a.length - 1);
    }

    private static <T extends Comparable<? super T>> void divide(T[] a, T[] aux, int low, int high) {
        if (low >= high) return;
        int middle = (low + high) / 2;
        divide(a, aux, low, middle);
        divide(a, aux, middle + 1, high);
        conquer(a, aux, low, middle, high);
    }

    private static <T extends Comparable<? super T>> void conquer(T[] a, T[] aux, int
            low, int middle, int high) {
        for (int k = low; k <= high; k++) {
            aux[k] = a[k];
        }
        int i = low, j = middle + 1;
        for (int k = low; k <= high; k++) {
            if (i > middle) a[k] = aux[j++];
            else if (j > high) a[k] = aux[i++];
            else if (aux[j].compareTo(aux[i]) < 0) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }
}
