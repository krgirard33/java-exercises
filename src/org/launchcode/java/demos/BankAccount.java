package org.launchcode.java.demos;

import java.util.Objects;

public class BankAccount {

    private int accountId;
    private double balance;

    public BankAccount(int id, double balance) {
        this.accountId = id;
        this.balance = balance;
    }

    public BankAccount(int id) {
        this.accountId = id;
        this.balance = 0;
    }

    public double deposit(double amount) {
        // boolean
        if (amount > 0) {
            this.balance = this.balance + amount;
        }
        return this.balance;
    }

    public double withdraw(double amount) {
        if (amount > 0 && amount < balance) {
            this.balance = this.balance - amount;
        }
        return this.balance;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public String toString() {
        return "Account: " + this.accountId + ", Balance: " + this.balance;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1, 1000);
        BankAccount account2 = new BankAccount(2);

        account2.deposit(500);
        account2.withdraw(100);
        account1.withdraw(20);
        System.out.println(account1);
        System.out.println(account2);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount account = (BankAccount) o;
        return accountId == account.accountId &&
                Double.compare(account.balance, balance) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(accountId, balance);
    }
}

