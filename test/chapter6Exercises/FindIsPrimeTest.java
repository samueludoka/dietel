package chapter6Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindIsPrimeTest {
    @Test
    public void testPrimeNumberFrom1To100000(){;
        int number = 11;
        int result = FindIsPrime.isPrime(number);
        assertEquals(number, result);
    }

}