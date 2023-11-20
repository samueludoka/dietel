package chapter6Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConvertFootToMeterTest {
   @Test
   public void feetToMeter(){
       double foot = 1.0;
       double meters = 0.305;
       double result = ConvertFootToMeter.feetToMeter(foot);
       assertEquals(result, meters);
   }
    @Test
    public void feetToMeter1() {
        double foot = 2.0;
        double meters = 0.610;
        double result = ConvertFootToMeter.feetToMeter(foot);
        assertEquals(result, meters);
    }
    @Test
    public void feetToMeter2() {
        double foot = 9.0;
        double meters = 2.745;
        double result = ConvertFootToMeter.feetToMeter(foot);
        assertEquals(result, meters);
    }
    @Test
    public void feetToMeter4() {
        double foot = 10.0;
        double meter = 3.050;
        double result = ConvertFootToMeter.feetToMeter(foot);
        assertEquals(result, meter);
    }
    @Test
    public void meterToFeet(){
       double meter = 20.0;
       double feet = 65.58;
       double result = ConvertFootToMeter.meterToFeet(meter);
       assertEquals(result, feet);
    }
    @Test
    public void meterToFeet1(){
        double meter = 25.0;
        double feet = 81.975;
        double result = ConvertFootToMeter.meterToFeet(meter);
        assertEquals(result, feet);
    }
    @Test
    public void meterToFeet2(){
        double meter = 60.0;
        double feet = 196.74;
        double result = ConvertFootToMeter.meterToFeet(meter);
        assertEquals(result, feet);
    }
    @Test
    public void meterToFeet3(){
        double meter = 65.0;
        double feet = 213.135;
        double result = ConvertFootToMeter.meterToFeet(meter);
        assertEquals(result, feet);
    }



}