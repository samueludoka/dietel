package chapter6Exercises;

import java.util.Scanner;

public class FahrenheightToCelsiusMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of fahrenheit: ");
        double value = input.nextDouble();

        System.out.println("Enter value of celsius: ");
        double value2 = input.nextDouble();

        System.out.println(FahrenheightToCelsius.celsiusToFahrenheit(value));
        System.out.println(FahrenheightToCelsius.fahrenheitToCelsius(value2));
    }
}
