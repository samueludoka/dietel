package chapter7Exercise;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DuplicatedArrayTest {
    @Test
    public void testThatArrayReturnsNonDuplicateNum() {
        int[] score = {2, 2, 1, 3, 3};
        int result = 1;
        int answer = DuplicatedArray.returnNonDuplicateElement(score);
        assertEquals(result, answer);
    }

    @Test
    public void testThatArrayReturnsNonDuplicateNumbers() {
        int[] score = {3, 4, 1, 5, 5, 4, 1};
        int result = 3;
        int answer = DuplicatedArray.returnNonDuplicateElement(score);
        assertEquals(result, answer);
    }

    @Test
    public void testThatArrayReturnsNonDuplicateNumbersLength() {
        int[] score = {1};
        int result = 1;
        int answer = DuplicatedArray.returnNonDuplicateElement(score);
        assertEquals(result, answer);
    }

    @Test
    public void testThatArrayReturnsNonDuplicateNumbersLengthWhenNoUniqueValue() {
        int[] score = {1, 1};
        int result = 0;
        int answer = DuplicatedArray.returnNonDuplicateElement(score);
        assertEquals(result, answer);
    }

    @Test
    public void testThatLastElementCanBeAddedTo1() {
        int[] score = {1, 2, 3};
        int[] result = {1, 2, 4};
        int[] answer = DuplicatedArray.addOneToTheLastIndex(score);
        assertArrayEquals(result, answer);
    }

    @Test
    public void testThatLastElementCanBeAddedTo1Second() {
        int[] score = {4, 3, 2, 1};
        int[] result = {4, 3, 2, 2};
        int[] answer = DuplicatedArray.addOneToTheLastIndex(score);
        assertArrayEquals(result, answer);
    }

    @Test
    public void testThatLastElementCanBeAddedTo1Third() {
        int[] score = {2, 3, 5, 6, 7, 2};
        int[] result = {5, 11, 9};
        int[] answer = DuplicatedArray.inputArr(score);
        assertArrayEquals(result, answer);
    }

    @Test
    public void testThatLastElementCanBeAddedTo1ThirdPlus1() {
        int[] score = {2, 3, 5, 6, 7, 2};
        int[] result = {5, 11, 9};
        int[] answer = DuplicatedArray.inputArr(score);
        assertArrayEquals(result, answer);
    }
    @Test
    public void testThatLastElementCanBeAddAndCatchesExceptions(){
        int[] score = {2, 3, 5, 6, 7, 2, 6};
        int[] result = {5, 11, 9, 6};
        int[] answer = DuplicatedArray.inputArray(score);
        assertArrayEquals(result, answer);
    }
    @Test
    public void testTwoArraysCanReturnLowestElementInTheList(){
        int[] score1 = {2,3,5,6,7,8};
        int[] score2 = {1,3,7,10,11,8};
        int[] ans = {5};
        int[] result = DuplicatedArray.doubleArray(score1,score2);
        assertArrayEquals(ans, result);
    }
}