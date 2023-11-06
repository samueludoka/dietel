package chapter6Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PentagonTest {
    @Test
    public void TestPentagon(){
        int number = 100;
        int expected = 20;
        int result = Pentagon.pentagonalNumber(number);
        assertEquals(expected, result);
    }

}