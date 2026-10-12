package org.example;

import bank.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("sina");

        bankAccount.setBalance(930);
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.name);
    }
}