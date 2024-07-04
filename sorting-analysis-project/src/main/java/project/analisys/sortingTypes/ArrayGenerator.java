package project.analisys.sortingTypes;

import java.util.Random;

public class ArrayGenerator {
    public static Integer[] generateCrescentArray(int size) {
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }

    public static Integer[] generateDecrescentArray(int size) {
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = size - i - 1;
        }
        return array;
    }

    public static Integer[] generateRandomArray(int size) {
        Random random = new Random();
        return random.ints(size, 0, size).boxed().toArray(Integer[]::new);
    }

    public static Integer[] generateRandomArrayWithRepeats(int size) {
        Random random = new Random();
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size / 2);
        }
        return array;
    }
}
