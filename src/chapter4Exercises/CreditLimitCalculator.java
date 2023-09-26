package chapter4Exercises;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter account number: ");
        int AC = input.nextInt();
        int newBalance = 0;
        int balance = 0;
        int charged = 0;
        int index = 0;
        int credit = 0;
        for (int count = 1; count != 0; count++) {
            System.out.println("Enter balance at the beginning of month: ");
            balance = input.nextInt();
            System.out.println("Enter total of charged by the customer: ");
            charged = input.nextInt();
            System.out.println("Enter allowed credit limit: ");
            credit = input.nextInt();
            balance += balance;
            charged += charged;
            credit += credit;
            credit += newBalance;
            System.out.println("Enter -1 to stop or value other than -1 to continue: ");
            count = input.nextInt();
            index++;

        }

        newBalance = newBalance + balance + charged - credit;



        if (newBalance <= 0) {
            System.out.println("Credit limit exceeded");
        } else {
            System.out.println("u still got more money to spend");
        }
    }
}
