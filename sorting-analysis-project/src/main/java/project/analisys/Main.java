package project.analisys;

import project.analisys.sortingTypes.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main( String[] args ) {

        int[] sizes = { 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536 };
        String[] sortMethods = { "BubbleSort", "InsertionSort", "SelectionSort", "HeapSort", "ShellSort", "MergeSort", "QuickSort" };
        System.out.println( "### Sorting Algorithms Analisys ###" );

        for ( int size : sizes ) {
            Integer[] crescentArray = ArrayGenerator.generateCrescentArray( size );
            Integer[] decrescentArray = ArrayGenerator.generateDecrescentArray( size );
            Integer[] randomArray = ArrayGenerator.generateRandomArray( size );
            Integer[] randomArrayWithRepeats = ArrayGenerator.generateRandomArrayWithRepeats( size );

            System.out.println( "Array size: " + size );

            for ( String sortMethod : sortMethods ) {
                long totalTime = 0;

                List<Integer[]> arrays = Arrays.asList( crescentArray, decrescentArray, randomArray, randomArrayWithRepeats );

                for ( Integer[] arr : arrays ) {
                    for ( int i = 0; i < 10; i++ ) {
                        Integer[] arrCopy = Arrays.copyOf( arr, arr.length );

                        long startTime = System.nanoTime();
                        switch ( sortMethod ) {
                            case "BubbleSort":
                                BubbleSort.bubbleSort( arrCopy );
                                break;
                            case "InsertionSort":
                                InsertionSort.insertionSort( arrCopy );
                                break;
                            case "SelectionSort":
                                SelectionSort.selectionSort( arrCopy );
                                break;
                            case "HeapSort":
                                HeapSort.heapSort( arrCopy );
                                break;
                            case "ShellSort":
                                ShellSort.shellSort( arrCopy );
                                break;
                            case "MergeSort":
                                MergeSort.mergeSort( arrCopy );
                                break;
                            case "QuickSort":
                                QuickSort.quickSort( arrCopy );
                                break;
                        }
                        long endTime = System.nanoTime();
                        totalTime += ( endTime - startTime );
                    }
                    System.out.println( "### " + sortMethod + " total time for 10 executions: " + totalTime + " ns for array generation type: " + checkArrayType( arrays.indexOf( arr ) ) + " ###" );
                }
                System.out.println();
            }
        }
    }

    private static String checkArrayType( int index ) {
        return switch ( index ) {
            case 0 -> "Crescent";
            case 1 -> "Decrescent";
            case 2 -> "Random";
            case 3 -> "Random with Repeats";
            default -> "Unknown";
        };
    }
}