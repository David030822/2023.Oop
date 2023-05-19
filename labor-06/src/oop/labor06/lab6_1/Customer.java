package oop.labor06.lab6_1;

import java.util.ArrayList;

public class Customer {
    private int numCustomers;
    private final String firstName;
    private String lastName;
    private int id = 0;
    private final ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        ++id;
    }

    public int getId() {
        return id;
    }

    public int getNumAccounts(){
        return accounts.size();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public BankAccount getAccount(String accountNumber){
        for (BankAccount account:accounts){
            if(account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        return null;
    }

    public ArrayList<String> getAccountNumbers() {
        ArrayList<String> accountNumbers = new ArrayList<>();
        for (BankAccount account:accounts) {
            accountNumbers.add(account.getAccountNumber());
        }
        return accountNumbers;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void closeAccount(String accountNumber) {
        accounts.removeIf(account -> account.getAccountNumber().equals(accountNumber));
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(firstName).append(' ').append(lastName).append(' ').append(id).append(" accounts:\n");
        for (BankAccount account:accounts) {
            result.append("\t").append(account).append("\n");
        }
        return result.toString();
    }
}
