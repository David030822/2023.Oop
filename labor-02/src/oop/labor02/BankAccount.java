package oop.labor02;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String paccountNumber) {
        accountNumber = paccountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String tostring() {
        return accountNumber + " " + balance;
    }

    public void deposit(double toadd) {
        balance += toadd;
    }

    public void withdraw(double toget) {
        if (toget > balance)
            System.out.println("You dont have enough money");
        else balance -= toget;
    }
}
