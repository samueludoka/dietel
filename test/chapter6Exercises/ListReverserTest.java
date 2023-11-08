package chapter6Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListReverserTest {
    @Test
    public void testListReversal(){
        int number = 12345;
        int reverse = 54321;
        int result = ListReverser.reverseList(number);
        assertEquals(reverse, result);
    }

}