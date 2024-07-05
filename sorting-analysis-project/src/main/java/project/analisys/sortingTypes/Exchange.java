package project.analisys.sortingTypes;

public class Exchange {
    static <T> void exchange( T[] a, int i, int j ) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
