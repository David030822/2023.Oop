package oop.labor04.lab4_1;

public class Person
{
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String pfirstName, String plastName, int pbirthYear) {
       firstName = pfirstName;
       lastName = plastName;
       birthYear = pbirthYear;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
