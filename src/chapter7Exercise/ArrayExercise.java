package chapter7Exercise;

public class ArrayExercise {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];
        int counter = 0;

        for (counter = 0; counter < array.length; counter++) {
            array[counter] = 2 + 2 * counter;
        }
        System.out.printf("%s%8s%n", "index", "value");

        for (counter = 0; counter < array.length; counter++) {
            System.out.printf("%s%8s%n", counter, array[counter]);


        }
    }
}
