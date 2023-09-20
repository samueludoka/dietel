package chapter4Exercises;

import java.util.Scanner;

public class MorningCoffee2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        long square = 1;

        for (long count = 0; count <= num2; count++) {
            square = square * num1;
        }
        System.out.print(square);

    }

    }


