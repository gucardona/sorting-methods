package project.analisys.sortingTypes;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayGenerator {
    public static Integer[] generateCrescentArray( int size ) {
        Integer[] array = new Integer[ size ];
        for ( int i = 0; i < size; i++ ) {
            array[ i ] = i;
        }
        return array;
    }

    public static Integer[] generateDecrescentArray( int size ) {
        Integer[] array = new Integer[ size ];
        for ( int i = 0; i < size; i++ ) {
            array[ i ] = size - i - 1;
        }
        return array;
    }

    public static Integer[] generateRandomArray( int size ) {
        Random random = new Random();
        Set<Integer> uniqueNumbers = new HashSet<>();
        while ( uniqueNumbers.size() < size ) {
            uniqueNumbers.add( random.nextInt( size * 10 ) ); // Adjust the range as needed
        }
        List<Integer> list = uniqueNumbers.stream().collect( Collectors.toList() );
        Collections.shuffle( list );
        return list.toArray( new Integer[ 0 ] );
    }

    public static Integer[] generateRandomArrayWithRepeats( int size ) {
        Random random = new Random();
        Integer[] array = new Integer[ size ];
        for ( int i = 0; i < size; i++ ) {
            array[ i ] = random.nextInt( size * 10 ); // Adjust the range as needed
        }
        return array;
    }
}
