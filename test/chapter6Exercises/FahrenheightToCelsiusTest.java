package chapter6Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FahrenheightToCelsiusTest {
    @Test
    public void testCelsius() {
        double num = 120.0;
        double answer = 48.88888888888889;
        double result = FahrenheightToCelsius.celsiusToFahrenheit(num);
        assertEquals(answer, result);
    }
    @Test
    public void testCelsius2(){
        double num = 110.0;
        double answer = 43.333333333333336;
        double result = FahrenheightToCelsius.celsiusToFahrenheit(num);
        assertEquals(answer, result);
    }

    @Test
    public void testCelsius3(){
        double num = 40.0;
        double answer = 4.444444444444445;
        double result = FahrenheightToCelsius.celsiusToFahrenheit(num);
        assertEquals(answer, result);
    }

    @Test
    public void testCelsius4(){
        double num = 30.0;
        double answer = -1.1111111111111112;
        double result = FahrenheightToCelsius.celsiusToFahrenheit(num);
        assertEquals(answer, result);
    }

    @Test
    public void testFahrenheit(){
        double num = 31.0;
        double answer = 87.8;
        double result = FahrenheightToCelsius.fahrenheitToCelsius(num);
        assertEquals(answer, result);
    }

}