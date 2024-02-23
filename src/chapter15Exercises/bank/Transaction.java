package chapter15Exercises.bank;

import java.io.Serializable;

public class Transaction implements Serializable {
    private String sender;

    public Transaction(String sender, String recipient, String amount) {
        this.sender = sender;
        this.recipient = recipient;
        this.amount = amount;
    }

    private String recipient;

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    private String amount;

    @Override
    public String toString() {
        return "Transaction{" +
                "sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
