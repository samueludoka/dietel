package chapter7Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayExercise3Test {
    @Test
    public void testTwoNumbersCanAdd(){
        String[] list = {"A","M","C","W","I","T"};
        String[] list1 = {"A","M","C"};
        String[] list2 = {"W","I","T"};
        String[] answer = {"A","W","M","I","C","T"};
        String[] result = ArrayExercise3.twoLists(list1);
        assertArrayEquals(answer, result);


    }

}