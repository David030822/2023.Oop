package oop.labor05.model;

import oop.labor02.MyDate;

import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Training {
    private final Course course;
    private final MyDate startDate;
    private final MyDate endDate;
    private final double pricePerStudent;
    private final ArrayList<Student> enrolledStudents;

    public Training(Course course, MyDate startDate, MyDate endDate, double pricePerStudent, ArrayList<Student> enrolledStudents) {
        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerStudent = pricePerStudent;
        this.enrolledStudents = enrolledStudents;
    }

    public Course getCourse() {
        return course;
    }

    public boolean enroll(Student student) {
        for (Student pstudent : enrolledStudents) {
            if (pstudent.getID().equals(student.getID()))
                return false;
        }
        enrolledStudents.add(student);
        return true;
    }

    public Student findStudentById(String studentid) {
        for (Student pstudent : enrolledStudents) {
            if (pstudent.getID().equals(studentid)) {
                return pstudent;
            }
        }
        return null;
    }

    public int numEnrolled() {
        return enrolledStudents.size();
    }

    public void printToFile() {
        String filename = course.getName() + "_" + startDate + "_" + endDate + ".csv";
        try (FileWriter file = new FileWriter(filename)) {
            for (Student student : enrolledStudents) {
                file.write(student.toString());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean unEnroll(Student student)
    {
        for (Student pstudent:enrolledStudents) {
            if(pstudent.getID().equals(student.getID()))
            { enrolledStudents.remove(student);
                return true;}
        }
        return false;
    }

    @Override
    public String toString() {
        return "Training{" +
                "course=" + course +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", pricePerStudent=" + pricePerStudent +
                ", enrolledStudents=" + enrolledStudents +
                '}';
    }
}
