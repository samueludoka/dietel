package chapter5Exercises;

import java.util.Scanner;

public class ScalesAsterisks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number within 1 - 30: ");
        int num = input.nextInt();
        int count = 0;
        for (num = 0; num <= 7; num++) {
            System.out.println("Enter any number within 1 - 30: ");
            num = input.nextInt();
        }
        for (int i = 0; i < num; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

        }




    }
}
