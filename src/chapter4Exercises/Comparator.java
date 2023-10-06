package chapter4Exercises;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lowestNumber = 0;
        int highestNumber = 0;
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter any two numbers:");
            int number = input.nextInt();

            if(number == highestNumber){
                highestNumber = number;

            }
            else if(number > highestNumber){
                highestNumber = number;

            }
            else if(number < lowestNumber){
                lowestNumber = number;

            }



        }
        System.out.println("0");
        System.out.println("1");
        System.out.println("-1");
    }
}
