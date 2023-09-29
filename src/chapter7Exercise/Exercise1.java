package chapter7Exercise;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] ray = new int[10];
        int sum = ray[0];
        int max = ray[0];
        int min = ray[0];
        int average = ray[0];
        int score = ray[0];

        int count;
        for (count = 0; count < ray.length; count++) {
            System.out.println("enter score: ");
            ray[score] = input.nextInt();
            sum = sum + ray[score];
            if (ray[score] > max) {
                max = ray[score];
            }

            if (ray[score] < min) {
                min = ray[score];


            }
        }
        average = sum / count;
        System.out.printf("sum of ray is %d", sum);
        System.out.printf("\naverage of ray is %d", average);
        System.out.printf("\nminimum of ray is %d", min);
        System.out.printf("\nmaximum of array is %d", max);
    }
}
