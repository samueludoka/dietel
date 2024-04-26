package chapter6Exercises;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayToOddEvenTest {
    @Test
    public void testArrayToOddAndEven(){
        int[] number = {3,4,1,7,9,10};
        int[] answer = {1,0,1,1,1,0};
        int[] reply = ArrayToOddEven.oddEven(number);
        System.out.println(Arrays.toString(reply));
        assertArrayEquals(answer, reply);
    }
    @Test
    public void testArrayToOddAndEvenEven(){
        int[] number = {3,4,1,7,9,10};
        boolean[] answer = {true, false, true, true, true, false};
        boolean[] reply = ArrayToOddEven.oddEvenBoolean(number);
        System.out.println(Arrays.toString(reply));
        assertArrayEquals(answer, reply);
    }
    @Test
    public void testArrayToSum() {
        int[] number = {4, 5, 8};
        int[] answer = {4, 5, 8, 8, 10, 16};
        int[] reply = ArrayToOddEven.inputArray(number);
        assertArrayEquals(answer, reply);
    }
    @Test
    public void testArrayToSum2() {
        int[] number = {4, 5, 8, 7, 2, 9};
        int[] answer = {-1, 0, -1, 0, -1, 0};
        int[] reply = ArrayToOddEven.inputArray2(number);
        assertArrayEquals(answer, reply);
    }
    @Test
    public void testArrayToSum3() {
        int[] number = {1,2,3,4,5,6,7,8};
        int[] answer = {2,4,6,8,1,3,5,7};
        int[] reply = ArrayToOddEven.inputArray3(number);
        assertArrayEquals(answer, reply);
    }

}