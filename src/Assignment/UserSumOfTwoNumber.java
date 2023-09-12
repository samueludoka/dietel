package Assignment;

import java.util.Scanner;

public class UserSumOfTwoNumber {
    public static  void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Number1;
        int Number2;
        int sum = 0;
        boolean keepgoing = true;
        do {
            System.out.println("Enter first number");
            int firstNumber = input.nextInt();
            System.out.println("Enter second number");
            int secondNumber = input.nextInt();
            sum = firstNumber + secondNumber;
            System.out.printf("sum is %d", sum);
            String stopper = input.nextLine();
            System.out.println("\nDo u want to perform another operation");
            stopper = input.nextLine();
            if (stopper.equals("no") || stopper.equals("NO") || stopper.equals("No")) {
                keepgoing = false;
            }
        } while (keepgoing);
    }
    }


