package oop.labor11.lab11_2;

import oop.labor11.lab11_1.MyDate;

public class Manager extends Employee {
    private String department;

    public Manager(String firstName, String lastName, double salary, MyDate birthDate, String company) {
        super(firstName, lastName, salary, birthDate);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
//        return "Manager{" +
//                "department='" + department + '\'' +
//                '}';
        return "Manager{" + super.toString() + ", " + "department='" + getDepartment() + "}";
    }
}
