package chapter8Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest {
    @Test
    public void testThatAnnualRateCanIncreaseFrom4PercentTo5PercentForAccount1(){
        SavingsAccount savingsAccount = new SavingsAccount(2000.00);
        savingsAccount.rate(0.04);
        savingsAccount.ratePerYear();
        assertEquals(6_285.7142857142857142857142857143,savingsAccount.ratePerYear);
    }
    @Test
    public void testThatAnnualRateCanIncreaseFrom4PercentTo5PercentForAccount2(){
        SavingsAccount savingsAccount2 = new SavingsAccount(3000.00);
        savingsAccount2.rate(0.04);
        savingsAccount2.ratePerYear();
        assertEquals(9_428.5714285714285714285714285714,savingsAccount2.ratePerYear);
    }

}