package oop.labor12.lab12_3;

public class Lab12_3Main {
    public static void main(String[] args) {

        System.out.println("labor12");

        String[] subjects = {"roman", "matek", "magyar"};

        Bac bac = new Bac();
        bac.readNames("nevek1.txt");
        for (String subject:subjects){
            bac.readSubject(subject);
        }

        bac.calculateAverages();
        System.out.println("Number of passed students: " + bac.numPassed());
        bac.printFailed();

    }
}
