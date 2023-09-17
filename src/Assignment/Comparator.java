package Assignment;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int num = 0;
        int lowestNumber = num;
        int highestNumber = 0;

        for (int value = 1; value <= 2; value++) {
            System.out.println("Enter any two numbers: ");
            num = input.nextInt();

            if(num == highestNumber){
                highestNumber = num;
            }

            if (num > highestNumber) {
                highestNumber = num;
            }
            if (num < highestNumber) {
                lowestNumber = num;

            }

        }
        System.out.println("the two numbers are not  equal");
        System.out.printf("highest number is %d%n", highestNumber);
        System.out.printf("lowest number is %d%n", lowestNumber);
    }
}
