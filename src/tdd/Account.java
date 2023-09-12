package tdd;

public class Account {
    private int balance;
    private int deposit;
    private int withdraw;



    public int checkBalance() {
        return balance;
    }

    public void deposit(int amount) {
        this.balance = amount + balance;
    }

    public void withdraw(int amount) {
        if(amount < balance) {
            balance = balance - amount;
        }else if (amount > balance) {
            System.out.println(balance);
        }
    }
}