package chapter7Exercise;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int sum = 0;
        int max = 0;
        int min = 0;
        int average = 0;


        int count;
        for (count = 0; count < 10; count++) {
            System.out.println("enter score: ");
            int score = input.nextInt();
            sum = sum + score;
            if (score > max) {
                max = score;
            }
            if (min < max) {
                min = score;
            }
        }
        average = sum / count;
        System.out.printf("sum of ray is %d", sum);
        System.out.printf("\naverage of ray is %d", average);
        System.out.printf("\nminimum of ray is %d", min);
        System.out.printf("\nmaximum of array is %d", max);
    }
}


