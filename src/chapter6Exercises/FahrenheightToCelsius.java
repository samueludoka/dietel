package chapter6Exercises;

public class FahrenheightToCelsius {
    public static double celsiusToFahrenheit(double celsius){

        double fahrenheit = (5.0 / 9) * (celsius - 32);
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {

        double celsius = (9.0 / 5) * (fahrenheit + 32);
        return celsius;
    }
}
