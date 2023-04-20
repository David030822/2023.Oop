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

        System.out.println("labor02 fel3a:");
        System.out.println(DateUtil.isValidDate(2000, 2, 29));
        System.out.println(!DateUtil.isValidDate(2000, 2, 30));
        System.out.println(DateUtil.isValidDate(1900, 2, 29));
        System.out.println(DateUtil.isValidDate(1900, 2, 28));
        System.out.println(!DateUtil.isValidDate(-1900, 2, 28));
        System.out.println(!DateUtil.isValidDate(0, 2, 28));
        System.out.println(!DateUtil.isValidDate(2021, 2, 29));
        System.out.println(DateUtil.isValidDate(2020, 2, 29));
        System.out.println(!DateUtil.isValidDate(2020, 1, 32));
        System.out.println(!DateUtil.isValidDate(2020, 1, 0));
        System.out.println(!DateUtil.isValidDate(2020, 0, 0));
        System.out.println(!DateUtil.isValidDate(2020, 4, 31));
        System.out.println(DateUtil.isValidDate(2020, 1, 31));

        System.out.println("labor02 fel3b");
        MyDate myDate = new MyDate(2003, 8, 22);
        System.out.println(myDate.getYear());
        System.out.println(myDate.toString());
        //MyDate [] datearray= new MyDate[1000];
        int year, month, day, isvalid = 0;
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            year = random.nextInt() % 2022 + 1;
            month = random.nextInt() % 12 + 1;
            day = random.nextInt() % 31 + 1;
            if (DateUtil.isValidDate(year, month, day)) {
                MyDate datumok = new MyDate(year, month, day);
                System.out.println(datumok.toString());
                //datearray[i]=datumok;
            } else isvalid += 1;
        }
        /*for (int i = 0; i < 1000; i++) {
            //System.out.println(datearray[i].toString());
        }*/
        System.out.println(isvalid);
    }
}
