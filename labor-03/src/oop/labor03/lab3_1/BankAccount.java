package oop.labor03.lab3_1;

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

    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void deposit(double toadd) {
        if(toadd>0)
            balance += toadd;
    }

    public boolean withdraw(double toget) {
        if (toget > balance)
            return false;
        else {balance -= toget;
            return true;}
    }
}
