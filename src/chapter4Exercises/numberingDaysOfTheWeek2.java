package chapter4Exercises;
import java.util.Scanner;

public class numberingDaysOfTheWeek2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = input.nextInt();

        while (userInput > 6) {


            System.out.println("Enter a number: ");
            userInput = input.nextInt();

        }


        switch (userInput) {
            case 0:
                System.out.println("sunday");
                break;
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            default:
                System.out.println("invalid input");

        }

    }
}
