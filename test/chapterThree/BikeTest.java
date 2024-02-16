package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {
    @Test
    public void testThatBikeExist() {
        // i have a bike
        Bike suzuki = new Bike();
        //assert that bike exist
        assertNotNull(suzuki);
    }

    @Test
    public void testThatBikeCanTurnOn() {
        // i have a bike
        chapterThree.Bike suzuki = new chapterThree.Bike();
        //when i turn it on
        suzuki.turnOn();
        assertTrue(suzuki.getTurnOn());
    }

    @Test
    public void testThatBikeCanTurnOff() {
        // i have a bike
        Bike suzuki = new Bike();
        //when i turn it On
        suzuki.turnOff();
        //when i turn it off
        assertTrue(suzuki.getTurnOff());

    }

    @Test
    public void testThatBikeCanAccelerate() {
        //i have a bike
        Bike suzuki = new Bike();
        //when i turn it on
        suzuki.turnOn();
        //when i accelerate
        suzuki.accelerate();
        assertEquals(1, suzuki.getAccelerate());
    }

    @Test
    public void testThatBikeCanAccelerateWithGear1() {
        //i have a bike
        Bike suzuki = new Bike();
        //when i turn it on
        suzuki.turnOn();
        //when i accelerate with gear1
        for (int i = 0; i == 20; i++) {

            assertEquals(20, suzuki.getAccelerate());
            assertEquals(1, suzuki.getGear());

        }
    }

    @Test
    public void testThatBikeCanAccelerateWithGear2() {
        //i have a bike();
        Bike suzuki = new Bike();
        //when i turn it on
        suzuki.turnOn();
        // when i accelerate with gear2
        for (int i = 1; i <= 25; i++) {
            suzuki.accelerate();
        }
        assertEquals(30, suzuki.getAccelerate());
        assertEquals(2, suzuki.getGear());
    }

    @Test
    public void testThatBikeCanAccelerateWithGear3() {
        Bike suzuki = new Bike();
        //when i turn it on
        suzuki.turnOn();
        //when i accelerate with gear3
        for (int i = 1; i >= 28; i++) {
            suzuki.accelerate();
            assertEquals(28, suzuki.getAccelerate());
        }

    }


    @Test
    public void testThatBikeCanAccelerateWithGear4() {

        Bike suzuki = new Bike();
        //when i turn it on
        suzuki.turnOn();
        //when i accelerate with gear4
        for (int i = 1; i > 28; i++) {
            assertEquals(28, suzuki.getAccelerate());

        }

    }

    @Test
    public void testThatBikeCanDecelerateWithGear1() {
        Bike suzuki = new Bike();
        //when i turnOn
        suzuki.turnOn();
        //when i accelerate with gear1
        for (int i = 1; i > 20; i++) {
            assertEquals(20, suzuki.getAccelerate());
            //when i decelerate with gear1
            for (int j = 1; j < 20; j++) {
                assertEquals(20, suzuki.getAccelerate());


            }
        }
    }


    @Test
    public void testDecelerateWithGear1() {

        Bike bike = new Bike();

        for (int speed = 0; speed < 20; speed++) {
            bike.accelerate();
        }

        bike.decelerate();
        assertEquals(19, bike.getAccelerate());
        assertEquals(1, bike.getGear());
    }

    @Test
    public void testDecelerateWithGear2() {
        Bike suzuki = new Bike();
        for (int speed = 0; speed < 25; speed++) {
            suzuki.accelerate();
        }

        assertEquals(30,suzuki.getAccelerate());
        assertEquals(2,suzuki.getGear());

    }
    @Test
    public void testDecelerateWithgear3(){
        Bike bike = new Bike();
        for(int speed = 0; speed < 29; speed++){
            bike.accelerate();
        }
        assertEquals(41,bike.getAccelerate());
        assertEquals(3,bike.getGear());
    }
    @Test
    public void testDecelerateWithGear4(){
        Bike bike = new Bike();
        for(int speed = 0; speed <= 29; speed++){
            bike.accelerate();
        }
        assertEquals(45,bike.getAccelerate());
        assertEquals(4,bike.getGear());
    }
}









