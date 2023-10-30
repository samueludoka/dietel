package chapter7Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductPrimeTest {

    @Test
    void primeNumber() {
        int[] results = {2, 5};
        assertArrayEquals(results, ProductPrime.calculateLcmOf(10));
    }
}