package chapter6Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringBeautitificationTest {

    @Test
    public void addFullStopTo() {
        String result = StringBeautitification.addFullStopTo("girl friend");
        assertEquals("girl friend.",result);
    }
    @Test
    public void addFirstLetterCaps(){
        String result = StringBeautitification.addFirstLetterCaps("girl friend");
        assertEquals("Girl friend",result);
    }
    @Test
    public void addFirstLetterCapsAndFullStop(){
        String result = StringBeautitification.addFirstLetterCapsAndFullStop("girl friend");
        assertEquals("Girl friend.",result);
        }
}