package chapter7Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateTest {
    @Test
    void canRemoveDuplicate(){
        int[] numbers = {4, 9, 4, 4, 7, 9, 1, 7};
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        int[] uniqueValueArray = removeDuplicate.remove(numbers);
        assertEquals(4,uniqueValueArray[0]);
        assertEquals(9, uniqueValueArray[1]);
        assertEquals(4, uniqueValueArray.length);

    }

}