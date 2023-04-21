package oop.labor03.lab3_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("labor03 3.1a");
        BankAccount account1= new BankAccount("IBAN1");
        BankAccount account2= new BankAccount("IBAN2");
        account1.deposit(1000);
        account2.deposit(2000);
        BankAccount account3=account1;
        System.out.println(account3);
        System.out.println("labor03 3.1b");
        Customer customer1 = new Customer("John", "BLACK");
        customer1.setAccount(new BankAccount("OTP00002"));
        customer1.getAccount().deposit(1000);
        Customer customer2= new Customer("Mary", "White");
        customer2.setAccount(new BankAccount("OTP00012"));
        customer2.getAccount().deposit(5000);
        System.out.println(customer2);
        customer2.closeAccount();
        customer2.setAccount(customer1.getAccount());
        System.out.println(customer1);
    }
}
