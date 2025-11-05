package com.week7.Finance.Bank;

import com.week7.Finance.Valuable;

public class CreditCard implements Valuable {
    String name;
    String accountNumber;
    double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void charge(double amount) {
        balance+=amount;
    }
    public void pay(double amount) {
        balance-=amount;
    }

    @Override
    public double getValue(){
        return balance;
    }
}
