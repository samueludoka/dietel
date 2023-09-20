package classWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultTaskTest {
@Test
public void testThtTwoNumbersCanMultiply(){
    int result = MultTask.multiplication(-5,-5);
    assertEquals(25,result);
}

}