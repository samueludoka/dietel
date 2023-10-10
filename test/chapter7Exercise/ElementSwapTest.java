package chapter7Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElementSwapTest {
    @Test
    public void testSwapNumbers(){
        int[] numbers = {1,2,3,4,5};
        int[] answer = {3,2,1,4,5};
        int[] result = ElementSwap.replace(numbers,0,2);
        assertArrayEquals((result), answer);
    }

}