package pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaHutTest {
    @Test
    public void testNumberOfHungryPersons(){
        int superHungry = 6;
        int normalHungry = 5;
        int classicHungry = 3;
        int result = 37;
        int expected = PizzaHut.numberOfHungryPersons(superHungry,normalHungry,classicHungry);
        assertEquals(expected, result);

    }
    @Test
    public void testNumberOfSlices(){
        int superHungry = 8;
        int normalHungry = 4;
        int classicHungry = 7;
        int result = 47;
        int expected = PizzaHut.numberOfSlices(superHungry,normalHungry,classicHungry);
        assertEquals(expected, result);
    }

    @Test
    public void testNumberOfBoxes(){
        int superHungry = 8;
        int normalHungry = 4;
        int classicHungry = 7;
        double mediumBox = 7.0;
        int expected = PizzaHut.numberOfBoxes(superHungry,normalHungry,classicHungry,mediumBox);
        assertEquals(expected, mediumBox);
    }
    @Test
    public void testNumberOfSlicesLeft() {
        int superHungry = 8;
        int normalHungry = 4;
        int classicHungry = 7;
        int largeBox = 2;
        int expected = PizzaHut.numberOfSlicesLeft(superHungry, normalHungry, classicHungry, largeBox);
        assertEquals(expected, largeBox);
    }

    @Test
    public void boxesTotalAmount(){
        int superHungry = 8;
        int normalHungry = 4;
        int classicHungry = 7;
        int largeBox = 20000;
        int expected = PizzaHut.boxesTotalAmount(superHungry,normalHungry,classicHungry,largeBox);
        assertEquals(expected, largeBox);
    }

}