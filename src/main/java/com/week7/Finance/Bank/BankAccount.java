package com.week7.Finance.Bank;

import com.week7.Finance.Valuable;

public class BankAccount implements Valuable {
    String name;
    String accountNumber;
    double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance+=amount;
    }
    public void withdraw(double amount) {
        balance-=amount;
    }
    @Override
    public double getValue(){
        return balance;
    }
}
