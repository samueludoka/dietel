package tdd;

import chapterThree.Ac;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcTest {
    @Test
    public void testThatAcExist() {
        //i have an Ac
        Ac lgAc = new Ac();
        // assert that Ac exist
        assertNotNull(lgAc);
    }

    @Test
    public void testThatAcCanTurnOn() {
        // i have an Ac
        Ac lgAc = new Ac();
        //when i turn it on
        lgAc.turnOn();
        //assert that it is on
        assertTrue(lgAc.getAcSwitch());
    }

    @Test
    public void testThatAcCanTurnOff() {
        //i have an ac
        Ac lgAc = new Ac();
        //when i turn it on
        lgAc.turnOn();
        //when i turn it off
        lgAc.turnOff();
        //assert that it is off
        assertFalse(lgAc.getAcSwitch());
    }

    @Test
    public void testThatAcCanIncreaseTemperature() {
        //i have an Ac
        Ac lgAc = new Ac();
        //Ac is on
        lgAc.turnOn();
        //when i increase temperature
        lgAc.increaseTemperature();
        //check that the temperature is increased
        assertEquals(17, lgAc.getTemperature());
    }

    @Test
    public void testThatAcCanDecreaseTemperature() {
        //i have an ac
        Ac lgAc = new Ac();
        //its on
        lgAc.turnOn();
        //when i increase temperature
        lgAc.increaseTemperature();
        //when i decrease temperature
        lgAc.decreaseTemperature();
        //check that temperature is decreased
        assertEquals(16, lgAc.getTemperature());
    }

    @Test
    public void testThatAcCantBeIncreasedBeyond30() {
        //i have an ac
        Ac lgAc = new Ac();
        //its on and its at 16
        lgAc.turnOn();
        //when i increase temperature to 30
        lgAc.increaseTemperature();
        lgAc.increaseTemperature();
        lgAc.increaseTemperature();
        lgAc.increaseTemperature();
        lgAc.increaseTemperature();
        lgAc.increaseTemperature();
        lgAc.increaseTemperature();
        lgAc.increaseTemperature();
        lgAc.increaseTemperature();
        lgAc.increaseTemperature();
        lgAc.increaseTemperature();
        lgAc.increaseTemperature();
        lgAc.increaseTemperature();
        lgAc.increaseTemperature();
        //when i increase the temperature beyond 30
        lgAc.increaseTemperature();
        assertEquals(30, lgAc.getTemperature());

    }

    @Test
    public void testThatAcCantBeDecreasedBeyond16() {
        //i have an Ac
        Ac lgAc = new Ac();
        //its on and at 16
        lgAc.turnOn();
        //when i decrease temperature beyond 16
        lgAc.decreaseTemperature();
        assertEquals(16, lgAc.getTemperature());
    }
}



