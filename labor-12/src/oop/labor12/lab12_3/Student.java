package oop.labor12.lab12_3;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private long id;
    private String firstName;
    private String lastName;
    private Map<String, Double>grades = new HashMap<>();
    private double average;

    public Student(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addGrade(String subject, double grade){
        grades.put(subject, grade);
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGrade(String subject){
        Double grade = this.grades.get(subject);
        if(grade == null){
            throw new RuntimeException("Unknown subject!");
        }
        return grade;
    }

    public void calculateAverage(){
        double avg = 0;
        for (double grade: this.grades.values()){
            if(grade < 5){
                return;
            }
            avg += grade;
        }
        if(grades.size() == 0){
            throw new RuntimeException("Grades is empty for id = " + id);
        }
        avg = avg/grades.size();
        if(avg < 6){
            return;
        }
        average = avg;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grades=" + grades +
                ", average=" + average +
                '}';
    }
}
