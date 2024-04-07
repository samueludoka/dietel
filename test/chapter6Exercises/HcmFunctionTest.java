package chapter6Exercises;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HcmFunctionTest {
    @Test
    public void testFactorizationOfHcmOfNumbers(){
        int[] numbers = {8, 16, 12};
        boolean answer = true;
        boolean result = HcmFunction.lcmMultiplication(numbers);
        assertEquals(answer,result);
    }

}