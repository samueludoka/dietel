package chapter7Exercise;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OddIndexArrayTest {
    @Test
    public void testOddPositionInAGivenArray(){
        int[] scores = {1, 2, 3, 4, 5, 6, 7};
        int[] numbers = {2, 4, 6};
        int[] result = OddIndexArray.oddIndexArray(numbers);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(result, scores);

    }
    @Test
    public void testSquareOfArrayElementInAscendingOrder() {
        int[] scores = {1, 2, 3, 4, 5, 6, 7};
        int[] numbers = {1, 4, 9, 16, 25, 36, 49};
        int[] result = OddIndexArray.squareArrayElement(scores);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(result, numbers);
    }
    @Test
    public void testThatElementsOfArrayIsVoidOfVowels() {
        String scores = "vowel";
        String numbers = "vwl";
        String result = OddIndexArray.elementsOfArrayVoidOfVowels(scores);
//        System.out.println(Arrays.toString(scores.toCharArray()));
        assertEquals(numbers,result);
    }
    @Test
    public void testThatStringCanReturnIntArray() {
        String scores = "0 3 5 7 8";
        int[] numbers = {0,8};
        String result = OddIndexArray.elementsOfArrayVoidOfVowels(scores);
        System.out.println(Arrays.toString(scores.toCharArray()));
        assertEquals(numbers,result);
    }

}