package oop.labor03.lab3_1;

public class Main
{
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("IBAN1");
        account1.deposit(1000);
        BankAccount account2 = new BankAccount("IBAN2");
        account2.deposit(2000);
        System.out.println(account1);
        System.out.println(account2);
        BankAccount account3 = account1;
        System.out.println(account3);
    }
}