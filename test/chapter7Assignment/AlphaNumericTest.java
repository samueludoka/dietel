package chapter7Assignment;

import org.junit.jupiter.api.Test;

import static chapter7Assignment.AlphaNumeric.digitsInString;
import static org.junit.jupiter.api.Assertions.*;

class AlphaNumericTest {
    @Test
    public void testIntegers() {
        String[] alphaNumeric = {"ABC21F", "13CPZ", "A1L"};
        int answer = 5;
        int result = AlphaNumeric.digitsInString(alphaNumeric);
        assertEquals(answer, result);

    }
    @Test
    public void testIsStringPalindrome(){
        String letter = "madam";
        boolean result = Boolean.parseBoolean(String.valueOf(AlphaNumeric.isPalindrone(letter)));
        assertTrue(result);
    }

    @Test
    public void testISAnagram(){
        String letter = "1--10-0";
        String letter2 = "--1001--";
        boolean result = AlphaNumeric.isAnagram(letter, letter2);
        assertFalse(result);

    }
}
