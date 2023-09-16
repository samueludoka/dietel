package tdd;

import chapterThree.SalesCommissionCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SalesCommissionCalculationTdd {
    @Test
    public void  testPercentageOfGrossSales(){
        SalesCommissionCalculator yamaha = new SalesCommissionCalculator();
        assertNotNull(yamaha);
        yamaha.setGrossPercentage(9);
        assertEquals(9,yamaha.getGrossPercentage());
    }
   // @Test
   // public
}
