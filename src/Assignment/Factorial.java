package Assignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int multipy = 1;
        int sum = 0;
        for (int count = 1; count < num; count++) {
            multipy =  num + num * count;
            sum = sum + multipy;
        }
        System.out.println(sum);
    }
}
