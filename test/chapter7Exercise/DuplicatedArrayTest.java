package chapter7Exercise;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DuplicatedArrayTest {
    @Test
    public void testThatArrayReturnsNonDuplicateNum(){
        int[] score = {2, 2, 1, 3, 3};
        int result = 1;
        int answer = DuplicatedArray.returnNonDuplicateElement(score);
        assertEquals(result, answer);
    }
    @Test
    public void testThatArrayReturnsNonDuplicateNumbers(){
        int[] score = {3, 4, 1, 5, 5, 4, 1};
        int result = 3;
        int answer = DuplicatedArray.returnNonDuplicateElement(score);
        assertEquals(result, answer);
    } @Test
    public void testThatArrayReturnsNonDuplicateNumbersLength(){
        int[] score = {1};
        int result = 1;
        int answer = DuplicatedArray.returnNonDuplicateElement(score);
        assertEquals(result, answer);
    }
    @Test
    public void testThatArrayReturnsNonDuplicateNumbersLengthWhenNoUniqueValue(){
        int[] score = {1, 1};
        int result = 0;
        int answer = DuplicatedArray.returnNonDuplicateElement(score);
        assertEquals(result, answer);
    }



}