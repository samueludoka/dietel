package ScoreTask;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int count = 0; count < 10; count++) {
            System.out.println("Enter ten scores: ");
            int Scores = input.nextInt();
            if (count % 2 == 0) {
                sum = sum + Scores;
            }

        }
        System.out.println(sum);
    }
}
