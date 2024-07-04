package project.analisys;

import project.analisys.sortingTypes.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class Main {


    public static void main( String[] args ) {
        int[] sizes = { 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536 };
        String[] sortMethods = { "BubbleSort", "InsertionSort", "SelectionSort", "HeapSort", "ShellSort", "MergeSort", "QuickSort" };

        for (int size : sizes) {
            System.out.println("Array size: " + size);

            for (String sortMethod : sortMethods) {
                long totalTime = 0;

                for (int i = 0; i < 10; i++) {
                    Integer[] array = ArrayGenerator.generateRandomArray(size);

                    long startTime = System.currentTimeMillis();
                    switch (sortMethod) {
                        case "BubbleSort":
                            BubbleSort.bubbleSort(array);
                            break;
                        case "InsertionSort":
                            InsertionSort.insertionSort(array);
                            break;
                        case "SelectionSort":
                            SelectionSort.selectionSort(array);
                            break;
                        case "HeapSort":
                            HeapSort.heapSort(array);
                            break;
                        case "ShellSort":
                            ShellSort.shellSort(array);
                            break;
                        case "MergeSort":
                            MergeSort.mergeSort(array);
                            break;
                        case "QuickSort":
                            QuickSort.quickSort(array);
                            break;
                    }
                    long endTime = System.currentTimeMillis();
                    totalTime += (endTime - startTime);
                }

                System.out.println(sortMethod + " total time for 10 executions: " + totalTime + " ms");
            }
        }
    }
}