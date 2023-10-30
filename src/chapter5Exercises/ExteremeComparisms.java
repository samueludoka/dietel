package chapter5Exercises;

import java.util.Scanner;

public class ExteremeComparisms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 0, min = 0;
        int number = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter 10 numbers ranging from (1-100): ");
            number = input.nextInt();
            if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
        }
        int result = min + max;
        System.out.println("The comparisim of the two extremes is" + result);
    }
}
