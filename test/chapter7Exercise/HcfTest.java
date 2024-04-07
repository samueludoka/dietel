package chapter7Exercise;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.testng.internal.Utils.arrayToString;

class HcfTest {
    @Test
    public void testFactorsInAnArray(){
        int[] score = {8,4,12};
        int[] answer = {2,2};
        Integer[] result = Hcf.hcf(score);
        System.out.println(Arrays.toString(result));
        assertEquals(answer,result);
    }

}