package chibuzosAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionsWeekendSnacksTest {
@Test
public void testThatNumberIsEven(){
    boolean value = FunctionsWeekendSnacks.isEven(79);
    assertTrue(true);
    }
@Test
public void testThatNumberIsPrimeNumber(){
    boolean number = FunctionsWeekendSnacks.isPrime(19);
    assertTrue(true);
    }
@Test
public void testThatTwoNumbersCanSubtractEachOther(){
    int number = FunctionsWeekendSnacks.subtract(8,6);
    assertEquals(2,number);

    }
@Test
public void testThatTwoNumbersCanDivideEachOther(){
    double result = FunctionsWeekendSnacks.divide(19,8);
    assertEquals(2.0,result);
}
@Test
public void testThatNumberCanReturnFactor(){
    int value = FunctionsWeekendSnacks.factor(10);
    assertEquals(4,value);

}
@Test
public void testThatNumberCanReturnSquareRoot(){
    int value = FunctionsWeekendSnacks.isSquare(5);
    assertEquals(25,value);
}
@Test
public void testThatNumberCanReturnPalindrome(){
    boolean result = FunctionsWeekendSnacks.isPalindrome(45145);
    assertEquals(true, result);
}
@Test
public void testThatNumberCanReturnFactorial(){
    int result = FunctionsWeekendSnacks.factorial(5);
    assertEquals(120,result);
}


}