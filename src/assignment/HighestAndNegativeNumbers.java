package assignment;

import java.util.Scanner;

public class HighestAndNegativeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 0;
        int highestNumber = 0;
        int lowestNumber = number;
        for (int lol = 1; lol <= 2; lol++) {
            System.out.println("Enter a number");
            number = input.nextInt();
            if (number > highestNumber) {
                highestNumber = number;
            }
            if (number < highestNumber) {
                lowestNumber = number;
            }
        }
        System.out.printf("highest number is %d%n", highestNumber);
        System.out.printf("lowest number is %d%n", lowestNumber);

    }
}
