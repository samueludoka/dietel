package chapter6Exercises;

public class ListReverser {
    public static int  reverseList(int number) {
        int reverse = 0;
        int value = 0;
        while (number != 0) {
            value = number % 10;
            reverse = reverse * 10 + value;
            number = number / 10;
        }
        return reverse;

    }
}
