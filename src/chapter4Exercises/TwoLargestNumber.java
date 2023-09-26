package chapter4Exercises;

import java.util.Scanner;

public class TwoLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largestNumber = 0;
        int secondLargestNumber = 0;
        for (int count = 0; count < 10; count++) {
            System.out.println("Enter numbers: ");
            int num = input.nextInt();
            if(num >= largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = num;
            }

        }
        System.out.printf("the largest number is %d",largestNumber);
        System.out.printf("\nthe second largest number is %d",secondLargestNumber);
    }
}
