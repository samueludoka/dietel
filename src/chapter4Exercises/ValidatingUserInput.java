package chapter4Exercises;

import java.util.Scanner;

public class ValidatingUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int scores = 0;
        for (int count = 0; count != -1; count++) {
            System.out.println("Enter scores: ");
            scores = input.nextInt();
            if(scores >= 1 && scores == 2){
                scores = count;
            }

        }
        System.out.println(scores);
    }

}
