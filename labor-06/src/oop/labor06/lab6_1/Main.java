package oop.labor06.lab6_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("labor06");

        ArrayList<BankAccount> bankAccounts = new ArrayList<>();
        for (int i = 0; i < 150; i++) {
            BankAccount newBankAccount = new BankAccount();
            bankAccounts.add(newBankAccount);
        }
        System.out.println(bankAccounts);

    }
}
