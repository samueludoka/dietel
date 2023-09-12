package chapterThree;

import java.util.Scanner;

public class MorningCoffee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        long count = 0;
        long square = 1;

        for(count = 0;count <= num2;count++) {
            square = square*num1;
        }
        System.out.println(square);
    }
}
