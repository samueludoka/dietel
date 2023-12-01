package chapter8Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetFunctionTest {
@Test
    public void testThatListCanSwipe(){
    int[] number = {43, 18, 41, 22, 15, 12};
    int[] result = {18, 43, 22, 41, 12, 15};
    int[] answer = SetFunction.sets(number);
    assertArrayEquals(result, answer);
}
    @Test
    public void testThatListCanSwipe2(){
        int[] number = {42, 15, 18, 12, 13, 3};
        int[] result = {42, 15, 12, 18, 13, 3};
        int[] answer = SetFunction.sets2(number);
        assertArrayEquals(result, answer);
    }
    @Test
    public void testThatListCanSwipe3(){
        int[] number = {42, 15, 18, 12, 13, 3, 7};
        int[] result = {42, 15, 18, 12, 3, 13, 7};
        int[] answer = SetFunction.sets3(number);
        assertArrayEquals(result, answer);
    }


}