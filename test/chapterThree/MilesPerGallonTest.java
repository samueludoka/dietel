package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MilesPerGallonTest {
    @Test
    public void testThatAppCanInputMilesDriven(){
        Object milesPerGallon;
        int result = MilesPerGallon.milesDriven(890);
        assertEquals(890,result);
}

}
