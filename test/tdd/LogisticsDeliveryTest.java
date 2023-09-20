package tdd;

import chibuzosAssignment.LogisticsDelivery;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogisticsDeliveryTest {
    @Test
    public void testThatRiderCanDeliverLessThan50Value() {
        int value = LogisticsDelivery.Logistics(45, 5000);
        assertEquals(12200, value);
    }

    @Test
    public void testThatRiderCanDeliverMoreThan50AndNotMoreThan59Values() {
        int result = LogisticsDelivery.Logistics(50, 5000);
        assertEquals(15000, result);

    }
    @Test
    public void  testThatRiderCanDeliverMoreThan60AndNotMoreThan69Values() {
        int amount = LogisticsDelivery.Logistics(62,5000);
        assertEquals(20500,amount);
    }
    @Test
    public void  testThatRiderCanDeliverMoreThan70Value() {
        int value = LogisticsDelivery.Logistics(86,5000);
        assertEquals(48000,value);
    }
}
