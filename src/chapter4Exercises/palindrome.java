package chapter4Exercises;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int reverse = 0;
        System.out.println("Enter a five digit number: ");
        int number = input.nextInt();
        int reverseDigit = number;
        int count = 0;
        while(number != 0){
            int value = number % 10;
            reverse = reverse * 10 + value;
            number = number / 10;
            if(reverse == reverseDigit){
                System.out.println("Number is a palindrome");
            }else{
            System.out.println("Number is not a palindrome");
        }
        }


    }
}
