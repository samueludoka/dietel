package chapterThree;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int counter = 0;
        System.out.println("Enter the first grade and enter -1 to stop iteration: ");
        int grade = input.nextInt();
        int average = 0;
        while (grade != -1) {
            System.out.println("Enter the first grade and enter -1 to stop iteration: ");
          //  grade = input.nextInt();
            total = total + grade;
            counter++;
            average = total / counter;
        }
        System.out.println(average);


    }
}
