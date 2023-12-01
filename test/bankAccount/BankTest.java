package bankAccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BankTest {
    @Test
    public void createAccountNUmberOfAccountIsOne() {
        Bank gtbBank = new Bank("Gtb Bank");
        Account myAccount = gtbBank.createAccountFor("firstName", "lastName", "pin");
        assertEquals(2, gtbBank.getTotalNumberOfAccount());
        assertEquals("1", myAccount.getAccountNumber());
        assertEquals("2", myAccount.getAccountNumber());

    }

    @Test
    public void testThatBankCanCreateMultipleAccount() {
        Bank gtbBank = new Bank("Gtb Bank");
        Account myAccount = gtbBank.createAccountFor("firstName", "lastName", "pin");
        Account myAccount1 = gtbBank.createAccountFor("firstName", "lastName", "pin");
        Account myAccount2 = gtbBank.createAccountFor("firstName", "lastName", "pin");
        assertEquals(3, gtbBank.getTotalNumberOfAccount());
        assertEquals("1", myAccount.getAccountNumber());
        assertEquals("2", myAccount1.getAccountNumber());
        assertEquals("3", myAccount2.getAccountNumber());
    }

    @Test
    public void testThatBankGenerateUniqueAccountNumber() {
        Bank gtbBank = new Bank("Gtb Bank");
        Account myAccount = gtbBank.createAccountFor("firstName", "lastName", "pin");
        Account myAccount1 = gtbBank.createAccountFor("firstName", "lastName", "pin");
        Account myAccount2 = gtbBank.createAccountFor("firstName", "lastName", "pin");
        assertEquals(3, gtbBank.getTotalNumberOfAccount());
        assertEquals("3", myAccount2.getAccountNumber());
        gtbBank.removeAccount(myAccount1);
        assertEquals(2, gtbBank.getTotalNumberOfAccount());
        Account myAccount4 = gtbBank.createAccountFor("firstName", "lastName", "pin");
        assertEquals(3, gtbBank.getTotalNumberOfAccount());
        assertEquals("4", myAccount4.getAccountNumber());
    }

    @Test
    public void testThatBankCanDeposit() {
        Bank gtbBank = new Bank("Gtb Bank");
        Account myAccount = gtbBank.createAccountFor("firstName", "lastName", "pin");
        gtbBank.deposit(3000, myAccount.getAccountNumber());
        gtbBank.withdraw(2000, myAccount.getAccountNumber(), "pin");
        assertEquals(1000, myAccount.checkBalance("pin"));

    }

    @Test
    public void testThatBankCanTransfer() {
        Bank gtbBank = new Bank("Gtb Bank");
        Account myAccount = gtbBank.createAccountFor("firstName", "lastName", "pin");
        gtbBank.deposit(3000, myAccount.getAccountNumber());
        gtbBank.withdraw(3000, myAccount.getAccountNumber(), "pin");
        assertEquals(0, myAccount.checkBalance("pin"));

        gtbBank.deposit(2000, myAccount.getAccountNumber());
        gtbBank.transfer(1000, myAccount.getAccountNumber(), "recieversAccount", "pin");
        assertEquals(1000, myAccount.checkBalance("pin"));
    }

    @Test
    public void testBankCanUpdateAccount() {
        Bank gtbBank = new Bank("gtbBank");
        Account myAccount = gtbBank.createAccountFor("firstName", "lastName", "pin");
        gtbBank.updateAccountPin(myAccount.getAccountNumber(), "currentPin", "newPin");
    }

    @Test
    public void testBankCanUpdateBalance() {
        Bank gtbBank = new Bank("Gtb Bank");
        Account myAccount = gtbBank.createAccountFor("firstName", "lastName", "pin");
        gtbBank.deposit(3000, myAccount.getAccountNumber());
//        gtbBank.checkBalance(3000,myAccount.getAccountNumber());
        assertEquals(3000,myAccount.checkBalanceWithPin("pin"));
    }
}

