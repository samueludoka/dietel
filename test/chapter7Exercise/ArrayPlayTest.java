package chapter7Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayPlayTest {
    @Test
    public  void testRemoveDuplicate(){
        int[] numbers = {4, 5, 6, 3, 6, 2, 2, 4, 7, 4};
        int[] numbersWithoutDuplicate = {4, 5, 6, 3, 2, 7};
        int[] result = ArrayPlay.removeDuplicateFrom(numbers);
        assertArrayEquals(numbersWithoutDuplicate, result);
    }
    @Test
    public  void testRemoveDuplicate2(){
        int[] numbers = {4, 5, 6, 3, 6, 2, 2, 4, 7, 4};
        int[] numbersWithoutDuplicate = {4, 5, 6, 3, 2, 7};
        int[] result = ArrayPlay.numbersWithDuplicate(numbers);
        assertArrayEquals(numbersWithoutDuplicate, result);
    }

}