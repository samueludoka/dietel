package bankAccount;

import bankAccount.exceptions.AmountCannotBeLessThanZeroError;
import bankAccount.exceptions.InsufficientFundsException;
import bankAccount.exceptions.InvalidAmountException;
import bankAccount.exceptions.WrongPinException;

public class Account {
    private int deposit;
    private String accountNumber;
    private String accountName;
    private String pin;
    private int balance;
    public Account(){}
    public Account(String accountName, String accountNumber){
        this();
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }
    public Account(String accountNumber, String accountName, String pin) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.pin = pin;

    }


    public void deposit(int amount){
        validateAmount(amount);
            balance = balance + amount;

    }

    public void validateAmount(int amount){
        if (amount <= 0) throw new AmountCannotBeLessThanZeroError("Amount must be greater than zero");
    }

    public int checkBalance(String pin) throws WrongPinException {
        validatePin(pin);
        return balance;
    }

    public void validatePin(String pin) throws WrongPinException {
        if (!this.pin.equals(pin)) throw new WrongPinException("Wrong pin");
    }


    public void withdraw(int amount) {
        checkAmount(amount);
        validateAmount(amount);
        balance = balance - amount;
    }

    private void checkAmount(int amount) {
        if (amount > balance) throw new InsufficientFundsException("Amount exceeds balance");
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void Withdraw(int amount, String pin) {
    }
    @Override
    public String toString() {
        return String.format("""
               Account name is %s
               Account number is %s
               Account balance is %s
               pin is unknown
               """,accountName, accountNumber, balance);
    }

    public int checkBalanceWithPin(String pinIsCorrect) {
        return balance;
    }
}
