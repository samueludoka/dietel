package chapter6Exercises;

import java.util.Scanner;

public class IntPalindromeMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a list of number: ");
        int number = input.nextInt();

        System.out.println(IntPalindrome.isIntPalindrome(number));
    }
}
