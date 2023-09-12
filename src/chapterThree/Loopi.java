package chapterThree;

import java.util.Scanner;

public class Loopi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        for (int i = 15; i >= 10 ; i--) {
            System.out.println("Greater");

        }
    }
}
