package chapter8Exercises;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GeoPoliticalTest {
    @Test
    public void testStateGeographicalZone(){
        String state = "Enugu";
        String geographicalZone = "SouthEast";
        String result = CheckGeoPolitical.geoPoliticalZone(state);
        assertEquals(result, geographicalZone);
    }

}