package bankAccount;

import bankAccount.exceptions.InsufficientFundsException;
import bankAccount.exceptions.InvalidAmountException;
import bankAccount.exceptions.WrongPinException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void testThatAccountExist() {
        Account myAccount = new Account("Account Number", "Account Name", "pin");
        assertNotNull(myAccount);
    }

    @Test
    public void testThatAccountCanDeposit1k() {
        Account myAccount = new Account("Account Number", "Account Name", "pin");
        myAccount.deposit(1_000);
        try {
            assertEquals(1_000, myAccount.checkBalance("pin"));
        } catch (WrongPinException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testThatAccountCanDeposit1kAnd2K_AndBalanceIs3k() {
        Account myAccount = new Account("Account Number", "Account Name", "pin");
        myAccount.deposit(1_000);
        myAccount.deposit(2_000);
        try {
            assertEquals(3_000, myAccount.checkBalance("pin"));
        } catch (WrongPinException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void wrongPinInCheckBalanceThrowsExceptionTest() {
        Account myAccount = new Account("Account Number", "Account Name", "pin");
        assertThrows(WrongPinException.class, () -> myAccount.checkBalance("pin is wrong"));
    }
    @Test
    public void correctPinReturnBalanceTest(){
        Account myAccount = new Account("Account Number", "Account Name", "pin");
        try {
            assertEquals(0,myAccount.checkBalanceWithPin("pin is correct"));

        } catch (WrongPinException e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void deposit3kWithdraw2kWithCorrectPin(){
        Account myAccount = new Account("Account Number", "Account Name", "pin");
        myAccount.deposit(3_000);
        myAccount.withdraw(2_000);
        assertEquals(1_000, myAccount.checkBalance("pin"));
        assertThrows(InsufficientFundsException.class, ()-> myAccount.withdraw(2000), "Orodo ur pin is wrong");

    }
    @Test
    public void deposit3kWithdraw5kWithCorrectPinAndThrowInsufficientFundException(){
        Account myAccount = new Account("Account Number", "Account Name", "pin");
        myAccount.deposit(3_000);
        myAccount.Withdraw(5_000, "pin");
       assertThrows(InsufficientFundsException.class, ()-> myAccount.withdraw(5000),"amount exceeds balance");
    }
//    @Test
//    public void depositMinus3kWithCorrectPinAndThrowInvalidAmountException(){
//        Account myAccount = new Account("Account Number", "Account Name", "pin");
//        myAccount.deposit(-3_000);
//        assertThrows(InvalidAmountException.class, ()-> myAccount.withdraw(-3000), "invalid amount");
//    }
}