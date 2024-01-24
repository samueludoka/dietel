package chapter4Exercises;

import java.util.Scanner;

public class Scanners {
    public static String input(String word){
        Scanner input = new Scanner(System.in);
        System.out.println(word);
        return input.nextLine();
    }

    public static void main(String[] args) {
       String name = input("Enter your name ");
        System.out.println(name);
    }
}
