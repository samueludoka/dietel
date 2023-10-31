package chapter4Exercises;


import java.util.Arrays;
import java.util.Scanner;

public class MakingADifference1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number from 1 - 9: ");
        int num1 = input.nextInt();

        System.out.println("Enter a number from 1 - 9: ");
        int num2 = input.nextInt();

        System.out.println("Enter a number from 1 - 9: ");
        int num3 = input.nextInt();

        System.out.println("Enter a number from 1 - 9: ");
        int num4 = input.nextInt();

        int numb1 = num1 + 7 % 10;
        int numb2 = num2 + 7 % 10;
        int numb3 = num3 + 7 % 10;
        int numb4 = num4 + 7 % 10;
        System.out.printf("the encrypted code is %d\t%d\t%d\t%d",numb1,numb2,numb3,numb4);

        int number1 = numb1 - 7 % 10;
        int number2 = numb2 - 7 % 10;
        int number3 = numb3 - 7 % 10;
        int number4 = numb4 - 7 % 10;
        System.out.printf("\nthe decrypted code is %d\t%d\t%d\t%d",number1,number2,number3,number4);

    }
}


