package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    @Test
    public void testDeposit() {
        //given i have an account
        BankAccount account = new BankAccount();
        //when i deposit 5000
        account.deposit(5000);
        //check my balance is 5000
        int balance = account.checkBalance();
        assertEquals(5000, balance);
    }
    @Test
    public void testThatAccountCanDepositTwice(){
        //given i have an account
        BankAccount account = new BankAccount();
        //if i deposit 5000 twice
        account.deposit(5000);
        account.deposit(5000);
        //check that balance is 10000
        int balance = account.chckBalance();
        assertEquals(10000,balance);

    }
    @Test
    public void depositNegativeValueFailsTest(){
        //given i have an account
        BankAccount account = new BankAccount();
        //initial balance is 5000
        account.deposit(5000);
        //when i deposit -3000
        account.deposit(-3000);
        //check that balance is 5000
        int balance = account.checkBalance();
        assertEquals(5000,balance);

    }
    @Test
    public void withdraw(){
        //given i have an account
        BankAccount account = new BankAccount();
        //initial balance 5000
        account.deposit(5000);
        //withdraw 3000
        account.withdraw(3000);
        //check that balance is 2000
        int balance = account.checkBalance();
        assertEquals(2000,balance);
    }

}