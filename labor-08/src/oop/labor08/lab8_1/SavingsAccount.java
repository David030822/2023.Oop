package oop.labor08.lab8_1;

public class SavingsAccount extends oop.labor08.lab8_1.BankAccount {
    private double interestRate;

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void addInterest(){
        this.balance += this.interestRate * this.balance;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                '}';
    }
}
