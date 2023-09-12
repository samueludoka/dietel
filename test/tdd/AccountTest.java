package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SamuelAccountTest{
@Test
public void setAccount(){
Account SamuelAccount = new Account();
int balance;
int deposit;
int withdraw;
assertNotNull(SamuelAccount);
}

@Test
    public void testThatAccountHasBalance(){
    Account account = new Account();
    account.checkBalance();
    int balance = account.checkBalance();
    assertEquals(0,balance);
}

@Test
    public void testThatAccountCanDeposit(){
    Account account = new Account();
    account.deposit(5000);
    int balance = account.checkBalance();
    assertEquals(5000,balance);

}
@Test
    public void testThatAccountCanDepositMultiple(){
    Account account = new Account();
    account.deposit(2000);
    int balance = account.checkBalance();
    assertEquals(2000,balance);

    account.deposit(3000);
    int balance1 = account.checkBalance();
    assertEquals(7000,balance1);

}
@Test
    public void testThatAccountCanWithdraw(){
    Account account = new Account();
    account.deposit(2500);
    int balance = account.checkBalance();
    assertEquals(2500,balance);

    account.withdraw(1000);
    int balance1 = account.checkBalance();
    assertEquals(1500,balance1);
}
@Test
    public void testThatAccountCanWithdrawMultiple(){
    Account account = new Account();
    account.deposit(2500);
    account.withdraw(3500);
    int balance = account.checkBalance();
    assertEquals(2500,balance);
}

}