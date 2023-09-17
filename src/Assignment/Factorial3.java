package Assignment;

import java.util.Scanner;

public class Factorial3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int fact = 1;
        double e = 1.0;
        double sum = 1;

        for (int i = number; i > 0; i--) {
            e = sum +((double) 1/fact (number));

        }

    }

    public static double fact(int number) {
        return number;
    }

}
