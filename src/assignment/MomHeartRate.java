package assignment;

import java.util.Scanner;

public class MomHeartRate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstName = input.nextLine();

        System.out.println("Enter Last Name: ");
        String lastName = input.nextLine();

        System.out.println("Enter date of birth");
        int year = input.nextInt();

        int age = 2023 - year;
        int MHR  = 220 - age;

        System.out.printf("your age is %d",age);
        System.out.printf("\nYour Maximum heart rate is %d",MHR);



    }
}
