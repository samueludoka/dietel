package ScoreTask;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int average = 0;
        int count;
        for (count = 0; count < 10; count++) {
            System.out.println("Enter 10 scores: ");
            int score = input.nextInt();
            sum += score;
        }
        average = sum / count;
        System.out.printf("the average of score is %d",average);
        System.out.printf("\nthe sum of score is %d", sum);
    }
}


