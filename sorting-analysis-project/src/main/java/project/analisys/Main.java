package project.analisys;

import project.analisys.sortingTypes.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main( String[] args ) {
        int[] sizes = { 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536 };
        String[] sortMethods = { "BubbleSort", "InsertionSort", "SelectionSort", "HeapSort", "ShellSort", "MergeSort", "QuickSort" };

        List<Object[]> valuesWithinInterval = new ArrayList<>();
        List<Object[]> results = new ArrayList<>();

        for ( int size : sizes ) {
            Integer[] crescentArray = ArrayGenerator.generateCrescentArray( size );
            Integer[] decrescentArray = ArrayGenerator.generateDecrescentArray( size );
            Integer[] randomArray = ArrayGenerator.generateRandomArray( size );
            Integer[] randomArrayWithRepeats = ArrayGenerator.generateRandomArrayWithRepeats( size );

            List<Integer[]> arrays = Arrays.asList( crescentArray, decrescentArray, randomArray, randomArrayWithRepeats );

            long[] executionTimes = new long[ 10 ];

            for ( Integer[] arr : arrays ) {
                for ( String sortMethod : sortMethods ) {
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
                        executionTimes[ i ] = endTime - startTime;
                    }

                    // Calculate mean
                    double sum = 0;
                    for ( long time : executionTimes ) {
                        sum += time;
                    }
                    double mean = sum / executionTimes.length;

                    // Calculate variance
                    double variance = 0;
                    for ( long time : executionTimes ) {
                        variance += Math.pow( time - mean, 2 );
                    }
                    variance /= executionTimes.length;

                    // Calculate standard deviation
                    double stdDeviation = Math.sqrt( variance );

                    // Check values within the interval
                    for ( long executionTime : executionTimes ) {
                        if ( executionTime > mean - stdDeviation && executionTime < mean + stdDeviation ) {
                            Object[] values = { size, checkArrayType( arrays.indexOf( arr ) ), sortMethod, ( int ) executionTime };
                            valuesWithinInterval.add( values );
                        }
                    }

                    Object[] values = { size, checkArrayType( arrays.indexOf( arr ) ), sortMethod, mean, variance, stdDeviation };
                    results.add( values );
                }
            }
        }

        System.out.println( "### Sorting Algorithms Analysis ###" );
        System.out.println();
        System.out.println( "### Standard Results ###" );
        System.out.printf( "%-25s %-25s %-25s %-25s %-25s %-25s\n", "Array Size", "Array Type", "Sorting Algorithm", "Mean (ns)", "Variance (ns^2)", "Std Deviation (ns)" );
        printResults( results );
        System.out.println();
        System.out.println( "### Results Within Interval ###" );
        System.out.printf( "%-25s %-25s %-25s %-25s\n", "Array Size", "Array Type", "Sorting Algorithm", "Value Within Range (ns)" );
        printValuesWithinInterval( valuesWithinInterval );
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

    private static void printResults( List<Object[]> results ) {
        for ( Object[] values : results ) {
            System.out.printf( "%-25d %-25s %-25s %-25.2f %-25.2f %-25.2f\n", values );
        }
    }

    private static void printValuesWithinInterval( List<Object[]> valuesWithinInterval ) {
        for ( Object[] values : valuesWithinInterval ) {
            System.out.printf( "%-25d %-25s %-25s %-25d\n", values );
        }
    }
}
