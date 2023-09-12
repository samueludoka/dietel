package chapterThree;

import java.util.Scanner;

public class Factoring2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int factor = 0;
        for (int count = 1; count < num; count++) {
            if (num % count == 0) {
                factor++;

            }
        }
        System.out.printf("factor is %d", factor);
    if ( factor <= 1){
        System.out.printf(" and is a  prime number");
    }else{
        System.out.printf(" and is not a prime number");
    }
    }


}
