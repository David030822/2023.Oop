package oop.labor03.lab3_2;

public class Main {
    public static void main(String[] args) {
        System.out.println("labor03 3.2a");
        BankAccount account1 = new BankAccount("IBAN1");
        BankAccount account2 = new BankAccount("IBAN2");
        account1.deposit(1000);
        account2.deposit(2000);
        BankAccount account3 = account1;
        System.out.println(account3);
        System.out.println();

        System.out.println("labor03 3.1b");
        Customer customer1 = new Customer("John", "BLACK");
        customer1.addAccount(new BankAccount("OTP00002"));
        customer1.getAccount("OTP00002").deposit(1000);

        Customer customer2 = new Customer("Mary", "White");
        customer2.addAccount(new BankAccount("OTP00012"));
        customer2.getAccount("OTP00012").deposit(5000);
        System.out.println(customer2);

        customer1.addAccount(new BankAccount("OTP00112"));
        System.out.println(customer1);
        System.out.println();
    }
}
