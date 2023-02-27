package oop.labor03.lab3_1;

public class Customer
{
    private String firstName;
    private String lastName;

    public Customer(String pfirstName, String plastName){
        firstName = pfirstName;
        lastName = plastName;
    }
    public void setAccount(BankAccount account){
        account = new BankAccount(account.getAccountNumber());
    }

    /*public BankAccount getAccount(){

    }*/
}