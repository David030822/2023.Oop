package oop.labor03.lab3_1;

public class Customer {
    private String firstName, lastName;
    private BankAccount account;
    public Customer(String pFirstName, String pLastName)
    {
        firstName=pFirstName;
        lastName=pLastName;
    }
    public void setAccount(BankAccount pbankAccount)
    {
        account=pbankAccount;
    }

    public BankAccount getAccount()
    {
        return account;
    }
    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void closeAccount()
    {
        account=null;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", account=" + account +
                '}';
    }
}
