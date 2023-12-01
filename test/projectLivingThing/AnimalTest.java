package projectLivingThing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    @Test
    public void testMovementInCat(){
        Cat cat = new Cat();
        cat.move();
    }

}