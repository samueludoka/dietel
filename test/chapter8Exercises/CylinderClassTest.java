package chapter8Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderClassTest {
    @Test
    public void testThatRadiusIsAPositiveNumber(){
        CylinderClass cylinder = new CylinderClass(1,1);
        cylinder.getRadius();
        assertEquals(1,cylinder.getRadius());
    }
    @Test
    public void testThatHeightIsAPositiveNumber(){
        CylinderClass cylinder = new CylinderClass(1,1);
        cylinder.getHeight();
        assertEquals(1,cylinder.getHeight());
    }


}