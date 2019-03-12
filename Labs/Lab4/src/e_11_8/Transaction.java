package e_11_8;

import java.util.Date;

public class Transaction {
    private Date data;
    private char type;

    private double amount;
    private double balance;
    private String description;

    Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Transaction:\nType: " + this.type + ", " +
                "Amount " + this.amount  + ", " +
                "After Balance " + this.balance + ", " +
                "Description " + this.description;
    }
}
