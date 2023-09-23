package chapter4Exercises;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name of Citizen: ");
        String name = input.nextLine();
        double tax = 0;
        double sum = 0;
        for (int count = 1; count <= 12; count++) {
            System.out.println("Enter tax for the given month: ");
            tax = input.nextDouble();


        }
        tax = tax - 0.15 * tax;
        System.out.printf("the citizen total tax for the given year is %f:", tax);

    }

}
