package com.week7.Finance;

import com.week7.Finance.Bank.BankAccount;

public class FinanceApplication {
    static void main() {
        BankAccount account1 = new BankAccount("pam", "1252", 12500);
        Valuable account2 = new BankAccount("gray", "1252", 1500);
// try to deposit money into both accounts
        account1.deposit(100);
        //account2.deposit(100);
        System.out.println( account2.getValue());
    }
}
