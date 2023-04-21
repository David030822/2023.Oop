package oop.labor04.lab4_1;

public class Person {
    private final String firstName;
    private String lastName;
    private final int birthYear;

    public Person(String pFirstName, String pLastName, int pBirthYear) {
        firstName = pFirstName;
        lastName = pLastName;
        birthYear = pBirthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
