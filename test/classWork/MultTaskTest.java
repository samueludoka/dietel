package classWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultTaskTest {
@Test
public void testForPositiveMultiplication(){
    int result = MultTask.multiplication(5,5);
    assertEquals(25,result);
}
@Test
public void testForNegativeAndPositiveMultiplication(){
    int result = MultTask.multiplication(-5,5);
    assertEquals(-25,result);
}
@Test
public void testForPositiveAndNegativeMultiplication(){
    int result = MultTask.multiplication(5,-5);
    assertEquals(-25,result);
}
@Test
public void testForNegativeMultiplication(){
    int result = MultTask.multiplication(-5,-5);
    assertEquals(25,result);
}

}