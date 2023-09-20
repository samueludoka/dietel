package chapter4Exercises;

import java.util.Scanner;

public class   FutureDates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter today");
        int today = input.nextInt();
        System.out.println("Enter a future day ");
        int future = input.nextInt();
        int week = (today + future )% 7;
        switch (today) {
            case 0:
                System.out.println("today is sunday");
                break;
            case 1:
                System.out.println("today is monday");
                break;
            case 2:
                System.out.println("today is tuesday");
                break;
            case 3:
                System.out.println("today is wednesday");
                break;
            case 4:
                System.out.println("today is thursday");
                break;
            case 5:
                System.out.println("today is friday");
                break;
            case 6:
                System.out.println("today is saturday");
                break;
            default:
                System.out.println("wrong input try entering 0 - 6");
        }
        switch (week) {
            case 0:
                System.out.println("and future day is sunday");

                break;
            case 1:
                System.out.println("and the future day is monday");
                break;
            case 2:
                System.out.println("and future day is tuesday");
                break;
            case 3:
                System.out.println("and future day is wednesday");
                break;
            case 4:
                System.out.println("and future day is thursday");
                break;
            case 5:
                System.out.println("and future day is friday");
                break;
            case 6:
                System.out.println("and future day is saturday");
                break;
            default:
                System.out.println("wrong input try entering 0 - 6");

        }
    }
}

