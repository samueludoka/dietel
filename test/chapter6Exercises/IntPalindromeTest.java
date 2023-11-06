package chapter6Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntPalindromeTest {
    @Test
    public void testNumberIsPalindrome(){
        int number = 12321;
        int result = 12321;
        int answer = IntPalindrome.isIntPalindrome(number);
        assertEquals(result, answer);
    }

}