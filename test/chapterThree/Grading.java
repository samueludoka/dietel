package chapterThree;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = scanner.nextInt();

             if (userInput >= 90) System.out.println("A");
        else if (userInput >= 80) System.out.println("B");
        else if (userInput >= 70) System.out.println("C");
        else if (userInput >= 60) System.out.println("D");
        else if (userInput < 60) System.out.println("F");


    }

}
