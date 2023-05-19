package oop.labor08.lab8_1;

public class Main {
    public static void main(String[] args) {

        System.out.println("labor08_1");

        Bank bank1 = new Bank("OTP");

        Customer customer1 = new Customer("Attila", "Balazs");
        Customer customer2 = new Customer("Sandor", "Nagy");

        bank1.addCustomer(customer1);
        bank1.addCustomer(customer2);

        SavingsAccount savingsAccount1 = new SavingsAccount(1.5);
        CheckingAccount checkingAccount1 = new CheckingAccount(1000);
        customer1.addAccount(savingsAccount1);
        customer1.addAccount(checkingAccount1);

        SavingsAccount savingsAccount2 = new SavingsAccount(1.7);
        CheckingAccount checkingAccount2 = new CheckingAccount(500);
        customer2.addAccount(savingsAccount2);
        customer2.addAccount(checkingAccount2);

        savingsAccount1.deposit(2000);
        checkingAccount1.deposit(1500);
        savingsAccount2.deposit(5000);
        checkingAccount2.deposit(2700);

        System.out.println(customer1);
        System.out.println();
        System.out.println(customer2);

        savingsAccount1.addInterest();
        savingsAccount2.addInterest();

        System.out.println(customer1);
        System.out.println();
        System.out.println(customer2);

        savingsAccount1.withdraw(150);
        checkingAccount1.withdraw(200);
        savingsAccount2.withdraw(500);
        checkingAccount2.withdraw(135);

        System.out.println(customer1);
        System.out.println();
        System.out.println(customer2);
    }
}
