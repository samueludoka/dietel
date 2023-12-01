package bankAccount;

import bankAccount.exceptions.AccountNotFoundError;

import java.util.ArrayList;

public class Bank {
    private String name;
    private long totalNumberOfAccounts;
    private final ArrayList <Account> listOfAccounts;

//    public Bank(){
//
//    }
    public Bank(String bankName) {
        this.name = bankName;
        listOfAccounts = new ArrayList <> ();
    }
    private  String generateAccountNumber(){
        return totalNumberOfAccounts + "";
    }
    private void getDeposit(){
    }
    public Account  createAccountFor(String firstName, String lastName, String pin) {
        totalNumberOfAccounts++;
        String fullName = firstName + " " + lastName;
        Account account = new Account(generateAccountNumber(),fullName,pin);
        listOfAccounts.add(account);

        return account;
    }
    public Account findAccount(String number){
        for(Account account: listOfAccounts){
            if(account.getAccountNumber().equals(number)) return account;
        }
        throw new AccountNotFoundError(number + "not found");
    }

    public long getTotalNumberOfAccount() {
     return    listOfAccounts.size();
    }

    public void removeAccount(Account account) {
      Account foundAccount =  findAccount(account.getAccountNumber());
      listOfAccounts.remove(foundAccount);
    }

    public void deposit(int amount, String accountNumber){
        Account foundAccount = findAccount(accountNumber);
        foundAccount.deposit(amount);
    }

    public void withdraw(int amount, String accountNumber, String pin) {
        Account foundAccount = findAccount(accountNumber);
        foundAccount.validatePin(pin);
        foundAccount.withdraw(amount);
    }

    public void transfer(int amount, String accountNumber, String recieversAccount, String pin) {
        Account foundAccount = findAccount(accountNumber);
        foundAccount.withdraw(amount);
    }

    public void updateAccountPin(String accountNumber, String currentPin, String newPin) {
    }


//    public void checkBalance(int balance, String accountNumber) {
//        balance = balance + amount;
//    }
}
