package e_11_8;

/*
Add a new data field name of the String type to store the name of the
customer.
■ Add a new constructor that constructs an account with the specified name, id,
and balance.
■ Add a new data field named transactions whose type is ArrayList
that stores the transaction for the accounts. Each transaction is an instance
of the Transaction class. The Transaction class is defined as shown in
Figure 11.6.
*/

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int id;
    private String name;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    private ArrayList<Transaction> transactions;

    public Account() {
        transactions = new ArrayList<>();
        id = 0;
        balance = 0.0;
        annualInterestRate = 0.0;
        dateCreated = new Date();
    }

    public Account(int id, double balance, double annualInterestRate) {
        transactions = new ArrayList<>();
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
    }


    public Account(int id, String name, double balance, double annualInterestRate) {
        transactions = new ArrayList<>();
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
        transactions.add(new Transaction('W', amount, this.balance, "Withdraw"));
    }

    public void withdraw(double amount, String description) {
        this.balance -= amount;
        transactions.add(new Transaction('W', amount, this.balance, description));
    }

    public void deposit(double amount) {
        this.balance += amount;
        transactions.add(new Transaction('D', amount, this.balance, "Deposit"));
    }

    public void deposit(double amount, String description) {
        this.balance += amount;
        transactions.add(new Transaction('D', amount, this.balance, description));
    }

    @Override
    public String toString() {
        return "Account name: " + this.name + "\n" +
                "Account ID:" + this.id + "\n" +
                "Account Annual Rate:" + this.annualInterestRate + "\n" +
                "Account Balance:" + this.balance + "\n" +
                "All transactions" + this.getTransactions();

    }

    String getTransactions() {
        String allTransactions = "";
        for (Transaction transaction: transactions) {
            allTransactions += transaction;
        }
        return allTransactions;
    }
}
