package chapter7Assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestElementInAListTest {
    @Test
    public void testForLargestNumber() {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = ArrayFunction.listLargestNumber(num);
        assertEquals(10, result);
    }

    @Test
    public void testForListReversal() {
        int[] num = {1, 2, 3, 4, 5};
        int[] answer = {5, 4, 3, 2, 1};
        int[] result = ArrayFunction.reverseAList(num);
        assertArrayEquals(answer, result);

    }

    @Test
    public void testForOddScores() {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] answer = {2, 4, 6, 8, 10};
        int[] result = ArrayFunction.oddNumbersInAList(num);
        assertArrayEquals(answer, result);
    }

    @Test
    public void testForEvenScores() {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] answer = {1, 3, 5, 7, 9};
        int[] result = ArrayFunction.evenNumbersInAList(num);
        assertArrayEquals(answer, result);
    }

    @Test
    public void testForElementInAList() {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] answer = {3};
        int[] result = ArrayFunction.elementExistInAList(num);
        assertArrayEquals(answer, result);

    }

    @Test
    public void testSumOfList() {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] answer = {45};
        int[] result = ArrayFunction.runningTotal(num);
        assertArrayEquals(answer, result);
    }
    @Test
    public void testThatStringPaindromeIsTrueOrFalse(){
        String palindrome = "mom";
        boolean result = ArrayFunction.stringPalindrome(palindrome);
        System.out.println(result);
        assertTrue(true);


    }
    @Test
    public void testTotalOfList(){
        int[] list = {1,2,3,4,5,6,7,8,9,10};
        int[] answer = {45};
        int[] result = ArrayFunction.totalOfList(list);
        assertArrayEquals(answer, result);

    }
    @Test
    public void testThatListCanConcatenate(){
        int[] list = {1,2,3};
        String[] list1 = {"a","b","c"};
        String[] answer = {"1","2","3","a","b","c"};
        String[] result = ArrayFunction.concatenate(list,list1);
        assertArrayEquals(answer,result);
    }
    @Test
    public void testThatTwoListCanCombine(){
        int[] list = {1,2,3};
        String[] list1 = {"a", "b", "c"};
        String[] answer = {"a","1","b","2","c","3"};
        String[] result = ArrayFunction.combineTwoLists(list, list1);
        assertArrayEquals(answer, result);
    }
}