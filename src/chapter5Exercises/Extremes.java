package chapter5Exercises;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0,min = 0,total = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter values from 1 to 100: ");
            int values = input.nextInt();
            if (values >= max) {
                max = values;
            }
            if (values <= min) {
                min = values;

            }
            total = max + min;

        }
        System.out.println("the maximum value is " + max);
        System.out.println("the minimum value is " + min);
        System.out.println("sum of minimum and maximum value is" + total);

    }
}
