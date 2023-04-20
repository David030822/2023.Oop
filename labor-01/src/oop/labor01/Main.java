package oop.labor01;

public class Main {
    public static void main(String[] args) {
        System.out.println("labor01");

        String name = "David Demeter";
        String country = "Romania";
        System.out.println(name + ", " + country);

        int n = name.length();
        for (int i = 0; i < n; i++) {
            System.out.println(name.charAt(i));
        }

        String name2 = "Joe Donald Biden";
        String [] arrOfString = name2.split(" ");
        for (String a : arrOfString)
            System.out.println(a);

        String name3 = "TREE";
        n = name3.length();
        for (int i = 0; i < n; i++) {
            System.out.println(name3.substring(0, i + 1));
        }

    }
}
