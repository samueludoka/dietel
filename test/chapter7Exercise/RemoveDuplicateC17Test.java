package chapter7Exercise;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateC17Test {

    @Test
    void findDuplicates() {
        int[] list = {1,2,3,3,2,4,5,6};
        int[] answer = {2,3};
        int[] result = RemoveDuplicateC17.findDuplicates(list);
        assertArrayEquals(answer,result);


    }
    @Test
    public void stringPalindrone(){
        boolean result = RemoveDuplicateC17.palindrome("madam");
        assertTrue(true, String.valueOf(result));
    }
    @Test
    public void testFindDominantElements(){
        int[] input = {9,3,10,7,4};
        int[] result = RemoveDuplicateC17.findDominantElement(input);
        int[] expected = {10, 7, 4};
        assertArrayEquals(expected,result);
    }
    @Test
    public void index(){
        int number = 13579;
        int indices1 = 1;
        int indices2 = 2;
        int target = 4;
        assertTrue(RemoveDuplicateC17.numberInBetweenIndices(number,indices1,indices2,target));
    }
}