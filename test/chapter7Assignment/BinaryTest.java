package chapter7Assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTest {
    @Test
    public void testBinaryToDecimalExist(){
        int result = Binary.binaryToDecimalConversion("60");
        assertEquals(100001,result);

    }

}