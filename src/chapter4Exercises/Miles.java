package chapter4Exercises;

import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter miles driven and: ");
        int miles = input.nextInt();

        System.out.println("Enter the gallons used for all trips, and enter -1 to end");
        int gallon = input.nextInt();
        int average = 0;
        int totalMiles = 0;
        int totalDallon = 0;
        System.out.println("Enter -1 to stop or value other than -1 to continue: ");
        int count = input.nextInt();
        int index = 1;
        for (;count != -1;) {
            System.out.println("Enter miles driven: ");
            miles = input.nextInt();
            System.out.println("Enter the gallons used for all trips, and enter -1 to end: ");
            gallon = input.nextInt();
            totalMiles += miles;
            totalDallon += gallon;
            System.out.println("Enter -1 to stop or value other than -1 to continue");
            count = input.nextInt();
            index++;
        }
        average = (totalMiles + totalDallon) / index;


        System.out.printf("the average miles driven till date is %d",average);
    }
}
