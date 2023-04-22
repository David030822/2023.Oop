package oop.labor06.lab6_1;

public class BankAccount {
    public static final String PREFIX = "OTP";
    private static final int ACCOUNT_NUMBER_LENGTH = 10;
    private static int numAccounts = 0;
    private final String accountNumber;
    private double balance = 0;

    public BankAccount() {
        ++numAccounts;
        this.accountNumber = createAccountNumber();
    }

    private static String createAccountNumber() {
        //int size = String.valueOf(numAccounts).length();
        StringBuilder result = new StringBuilder();
        result.append(PREFIX);
        result.append("00000000");
        String numaccountsstr = Integer.toString(numAccounts);
        result.append(numaccountsstr);
        return result.toString();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Not enough balance");
            return false;
        }
        balance -= amount;
        return true;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
