package tdd;

public class BankAccount {
    private int balance;

    public void deposit(int amount) {
        if (amount >= 0) {
            this.balance = balance + amount;
        }
    }

        public int checkBalance () {
            return balance;
        }

        public int chckBalance () {
            return balance;
        }

    public void withdraw(int amount) {
        this.balance = balance - amount;
    }
}
