package chapter7Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Another1Test {
    @Test
    public void testSum() {
        int[] list = {5, 4, 1, 0, 6, 7, 4,};
        int result = 11;
        int output = Another1.oddPosition(list);
        assertEquals(result, output);
//        int[] answer = {16};
//        int[] result = {Another1.oddPosition(list)};
//        assertArrayEquals(answer, result);
    }

    @Test
    public void testSumEvenPosition() {
        int[] list = {5, 4, 1, 0, 6, 7, 4};
        int[] answer = {16};
        int[] result = new int[]{Another1.evenPosition(list)};
        assertArrayEquals(answer, result);

    }

    @Test
    public void testSumOfOddNumbers() {
        int[] list = {5, 4, 1, 0, 6, 7, 4,};
        int result = 13;
        int answer = Another1.sumOfOddNumber(list);
        assertEquals(result, answer);
    }

    @Test
    public void testSumOfEvenNumbers() {
        int[] list = {5, 4, 1, 0, 6, 7, 4, 1, 1, 2, 2};
        int result = 18;
        int answer = Another1.sumOfEvenNumber(list);
        assertEquals(result, answer);
    }
}
