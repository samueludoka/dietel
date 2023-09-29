package chapter7Assignment;

import java.util.Scanner;

public class ArrayExercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter score size: ");
        int scoreSize = input.nextInt();

        int [] ray = new int [scoreSize];
        int max = ray[0];
        int score = ray[0];

        for (int count = 0; count < scoreSize; count++) {
            System.out.println("enter score: ");
            ray[score] = input.nextInt();
            if(ray[score] > max){
                max = ray[score];
            }

        }
        System.out.printf("the largest number is %d",max);
    }
}
