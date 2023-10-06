package chapter4Exercises;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base = 0;
        System.out.println("enter triangle base from 1 to 10:");
        base = input.nextInt();
        for (int i = 0; i < base + 1; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }

        }
    }
}
