package ScoreTask;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int validscores = 0;
        int scores = 0;
        int count = 0;
        int average = 0;
        for (count = 0; count <= 10 ; count++) {
            System.out.println("Enter 10 valid Score: ");
            scores = input.nextInt();
            if (scores > 0 && scores <= 100) {
                validscores += scores;

            }

        }

        sum = sum + validscores;
        average = sum / count;
        System.out.printf("average of valid score is %d", average);

    }
}



