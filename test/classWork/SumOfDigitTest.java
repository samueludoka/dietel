package classWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SumOfDigitTest {
    @Test
    public void testThatNumberCanBeAdded(){
       long result = SumOfDigit.sumDigits(234);
       assertEquals(9,result);
    }
    @Test
    public void testThatFourNumbersCanBeAdded(){
        long result = SumOfDigit.sumDigits(6234);
        assertEquals(15,result);
    }
    @Test
    public void TestThatNegativeNumbersCanBeAdded(){
        long result = SumOfDigit.sumDigits(-324);
        assertEquals(-9,result);
    }
  
}