package ScoreTask;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int count = 0; count < 10 ; count++) {
            System.out.println("Enter 10 scores: ");
            int score = input.nextInt();
            sum  += score;


        }
        System.out.printf("sum of scores is %d",sum);
    }
}
