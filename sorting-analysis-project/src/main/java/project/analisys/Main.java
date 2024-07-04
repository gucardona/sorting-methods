package project.analisys;

import project.analisys.sortingTypes.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] sizes = {128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536};
        String[] sortMethods = {"BubbleSort", "InsertionSort", "SelectionSort", "HeapSort", "ShellSort", "MergeSort", "QuickSort"};
        System.out.println("### Sorting Algorithms Analysis ###");

        // Print table header
        System.out.printf("%-15s %-20s %-15s %-15s %-20s %-20s\n", "Array Size", "Array Type", "Sorting Algorithm", "Mean (ns)", "Variance (ns^2)", "Std Deviation (ns)");
        System.out.println("-------------------------------------------------------------------------------");

        for (int size : sizes) {
            Integer[] crescentArray = ArrayGenerator.generateCrescentArray(size);
            Integer[] decrescentArray = ArrayGenerator.generateDecrescentArray(size);
            Integer[] randomArray = ArrayGenerator.generateRandomArray(size);
            Integer[] randomArrayWithRepeats = ArrayGenerator.generateRandomArrayWithRepeats(size);

            List<Integer[]> arrays = Arrays.asList(crescentArray, decrescentArray, randomArray, randomArrayWithRepeats);

            for (Integer[] arr : arrays) {
                for (String sortMethod : sortMethods) {
                    long[] executionTimes = new long[10];

                    for (int i = 0; i < 10; i++) {
                        Integer[] arrCopy = Arrays.copyOf(arr, arr.length);

                        long startTime = System.nanoTime();
                        switch (sortMethod) {
                            case "BubbleSort":
                                BubbleSort.bubbleSort(arrCopy);
                                break;
                            case "InsertionSort":
                                InsertionSort.insertionSort(arrCopy);
                                break;
                            case "SelectionSort":
                                SelectionSort.selectionSort(arrCopy);
                                break;
                            case "HeapSort":
                                HeapSort.heapSort(arrCopy);
                                break;
                            case "ShellSort":
                                ShellSort.shellSort(arrCopy);
                                break;
                            case "MergeSort":
                                MergeSort.mergeSort(arrCopy);
                                break;
                            case "QuickSort":
                                QuickSort.quickSort(arrCopy);
                                break;
                        }
                        long endTime = System.nanoTime();
                        executionTimes[i] = endTime - startTime;
                    }

                    // Calculate mean
                    double sum = 0;
                    for (long time : executionTimes) {
                        sum += time;
                    }
                    double mean = sum / executionTimes.length;

                    // Calculate variance
                    double variance = 0;
                    for (long time : executionTimes) {
                        variance += Math.pow(time - mean, 2);
                    }
                    variance /= executionTimes.length;

                    // Calculate standard deviation
                    double stdDeviation = Math.sqrt(variance);

                    // Print table row
                    System.out.printf("%-15d %-20s %-20s %-15.2f %-15.2f %-20.2f\n", size, checkArrayType(arrays.indexOf(arr)), sortMethod, mean, variance, stdDeviation);
                }
            }
        }
    }

    private static String checkArrayType(int index) {
        return switch (index) {
            case 0 -> "Crescent";
            case 1 -> "Decrescent";
            case 2 -> "Random";
            case 3 -> "Random with Repeats";
            default -> "Unknown";
        };
    }
}
