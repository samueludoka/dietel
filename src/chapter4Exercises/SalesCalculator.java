package chapter4Exercises;

import java.util.Scanner;

public class SalesCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter item sold for the week and enter -1 to end: ");
        double item = input.nextDouble();
        double sum = 0;
        double percent = 0;
        double amount = 0;
        double count = 1;
        while (item != -1) {
            System.out.println("Enter item sold for the week and enter -1 to end: ");
            item = input.nextDouble();
            sum = sum + item;
            count = count +1;
            percent = percent + sum * 0.09;


        }
        amount = percent + 200;
        System.out.println(amount);
    }
}
