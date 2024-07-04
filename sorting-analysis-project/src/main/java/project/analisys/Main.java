package project.analisys;

import project.analisys.sortingTypes.*;

import java.util.*;
import java.util.function.Consumer;

public class Main {


    public static void main( String[] args ) {
        int[] sizes = { 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536 };
        String[] sortMethods = { "BubbleSort", "InsertionSort", "SelectionSort", "HeapSort", "ShellSort", "MergeSort", "QuickSort" };

        System.out.println("### Sorting Algorithms Analisys ###");
        System.out.println("Array generation types: 1-Crescent, 2-Decrescent, 3-Random, 4-Random with Repeats");

        for (int size : sizes) {
            System.out.println("Array size: " + size);

            for (String sortMethod : sortMethods) {
                long totalTime = 0;

                Integer[] crescentArray = ArrayGenerator.generateCrescentArray(size);
                Integer[] decrescentArray = ArrayGenerator.generateDecrescentArray(size);
                Integer[] randomArray = ArrayGenerator.generateRandomArray(size);
                Integer[] randomArrayWithRepeats = ArrayGenerator.generateRandomArrayWithRepeats(size);
                List<Integer[]> arrays = Arrays.asList(crescentArray, decrescentArray, randomArray, randomArrayWithRepeats);

                for (Integer[] arr : arrays) {
                    for (int i = 0; i < 10; i++) {
                        long startTime = System.currentTimeMillis();
                        switch (sortMethod) {
                            case "BubbleSort":
                                BubbleSort.bubbleSort( arr );
                                break;
                            case "InsertionSort":
                                InsertionSort.insertionSort( arr );
                                break;
                            case "SelectionSort":
                                SelectionSort.selectionSort( arr );
                                break;
                            case "HeapSort":
                                HeapSort.heapSort( arr );
                                break;
                            case "ShellSort":
                                ShellSort.shellSort( arr );
                                break;
                            case "MergeSort":
                                MergeSort.mergeSort( arr );
                                break;
                            case "QuickSort":
                                QuickSort.quickSort( arr );
                                break;
                        }
                        long endTime = System.currentTimeMillis();
                        totalTime += (endTime - startTime);
                    }
                    System.out.println("### " + sortMethod + " total time for 10 executions: " + totalTime + " ms for array generation type: " + arrays.indexOf(arr) + " ###");
                }
                System.out.println();
            }
        }
    }
}