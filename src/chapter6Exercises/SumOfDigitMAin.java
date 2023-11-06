package chapter6Exercises;

import java.util.Scanner;

public class SumOfDigitMAin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number that range from 10s of thousand: ");
        int number = input.nextInt();

        System.out.println(SumOfDigit.sumDigit(number));
        System.out.println("number is correct");

    }
}
