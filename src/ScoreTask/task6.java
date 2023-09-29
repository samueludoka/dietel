package ScoreTask;

import java.util.Scanner;

public class task6 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int average = 0;
            int sum = 0;
            int count;
            for (count = 0; count < 10; count++) {
                System.out.println("Enter ten scores: ");
                int Scores = input.nextInt();
                if (count % 2 == 0) {
                    sum = sum + Scores;
                }


            }
            average = sum / count;
            System.out.printf("sum of scores is %d", sum);
            System.out.printf("\nsum of average is %d", average);
        }
}
