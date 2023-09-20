package tdd;

import chibuzosAssignment.TestDriller;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrillerTest {
    @Test
    public void testThatTestDrillerIs1AndNotMoreThan4Copies(){
        int value = TestDriller.Driller(2000,2);
        assertEquals(2000,value);
    }
    @Test
    public void testThatTestDrillerIs5AndNotMoreThan9Copies(){
        int amount = TestDriller.Driller(1800,7);
        assertEquals(1800,amount);
    }
    @Test
    public void testThatTestDrillerIs10AndNotMoreThan29Copies(){
        int amount = TestDriller.Driller(1600,20);
        assertEquals(1600,amount);
    }
    @Test
    public void testThatTestDrillerIs30AndNotMoreThan49Copies(){
        int value = TestDriller.Driller(1500,41);
        assertEquals(1500,value);
    }
    @Test
    public void testThatTestDrillerIs50AndNotMoreThan99Copies() {
        int amount = TestDriller.Driller(1300, 75);
        assertEquals(1300, amount);
    }
    @Test
    public void testThatTestDrillerIs200AndNotMoreThan499Copies() {
        int value = TestDriller.Driller(1100, 320);
        assertEquals(1100, value);
    }
    @Test
    public void testThatTestDrillerIs500AndAbove(){
        int amount = TestDriller.Driller(1000,600);
        assertEquals(1000,amount);
    }

}



