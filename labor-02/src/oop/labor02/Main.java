package oop.labor02;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("labor02 1.Feladat:");
        BankAccount account1 = new BankAccount("IBAN1");
        System.out.println("account1: " + account1.getAccountNumber());
        System.out.println("account1: " + account1.getBalance());
        System.out.println("account1:" + account1.tostring());
        account1.deposit(500);
        System.out.println("account1: " + account1.getBalance());
        account1.withdraw(200);
        System.out.println("account1: " + account1.getBalance());
        System.out.println("labor02 2.Feladat:");
        Rectangle[] rectangles = new Rectangle[10];
        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            double length = 1 + rand.nextInt(10);
            double width = 1 + rand.nextInt(10);
            rectangles[i] = new Rectangle(length, width);
        }
        double allarea = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("l " + rectangles[i].getLength() + " w " + rectangles[i].getWidth() + " a " + rectangles[i].area() + " p " + rectangles[i].perimeter());
            allarea += rectangles[i].area();
        }
        System.out.println(" total area of the generated rectangles:" + allarea);
    }
}
