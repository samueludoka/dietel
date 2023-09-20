package assignment;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int num1;
        int num2;
        do{
        System.out.println("Enter first number: ");
        num1 = input.nextInt();
        System.out.println("Enter second number: ");
        num2 = input.nextInt();
        sum = num1 + num2;
            System.out.println(sum);
        }
        while (num1 != 0 && num2 != 0);
    }
}
