package chapter4Exercises;

import java.util.Scanner;

public class LargestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largestNumber = 0;
        for (int contest = 0; contest < 10; contest++) {
            System.out.println("Enter numbers");
            int num = input.nextInt();
            if (num >= largestNumber) {
                largestNumber = num;
            }
        }
        System.out.printf("the largest number is %d", largestNumber);
    }
}
