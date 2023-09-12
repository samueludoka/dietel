package chapterThree;

import java.util.Scanner;

public class Factoring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int factor = 0;

        for (int count = 1; count < num ; count++) {
            if(num % count == 0){
                factor ++;
            }

        }
        System.out.printf("factor is %d",factor);
    if(factor <= 1){
        System.out.print(" and is a prime number");
    }else{
        System.out.print(" and is not a prime number");
    }
    }

}


