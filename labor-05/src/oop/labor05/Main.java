package oop.labor05;

import oop.labor02.MyDate;
import oop.labor05.model.Course;
import oop.labor05.model.Student;
import oop.labor05.model.Training;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        System.out.println("labor05");
        ArrayList<Course> courses = readCourses("lab5_courses.csv");

        for (Course course : courses) {

            System.out.println(course);

        }

        System.out.println();

        ArrayList<Student> students = readStudents("lab5_students.csv");

        for (Student student : students) {

            System.out.println(student);

        }

        Training training = new Training(courses.get(0), new MyDate(2015, 10, 12), new MyDate(2016, 10, 11), 100, students);
        for (Student student : students) {
            training.enroll(student);
        }
        training.printToFile();
        //System.out.println(training.toString());
        ArrayList<Training> trainings = new ArrayList<>();
        Random random = new Random();
        for (Course course : courses) {
            Training newtraining = new Training(course, new MyDate(2023, 3, 21), new MyDate(2023, 3, 25), random.nextDouble() * 1000 + 1000, students);
            while (newtraining.numEnrolled() <= 10)
                newtraining.enroll(students.get(random.nextInt(students.size())));
            trainings.add(newtraining);
        }
        System.out.println(listOfStudents(trainings, students));


    }

    public static ArrayList<Course> readCourses(String filename) {

        ArrayList<Course> courses = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(filename))) {

            //String line = scanner.nextLine();

            //System.out.println("Header: "+line);

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }

                String[] tokens = line.split(",");

                String name = tokens[0].trim();

                String description = tokens[1].trim();

                int numHours = Integer.parseInt(tokens[2].trim());

                Course course = new Course(name, description, numHours);

                courses.add(course);

            }

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        }
        return courses;
    }

    public static ArrayList<Student> readStudents(String filename) {

        ArrayList<Student> students = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(filename))) {

            //String line = scanner.nextLine();

            //System.out.println("Header: "+line);

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }

                String[] tokens = line.split(",");

                String ID = tokens[0].trim();

                String lastName = tokens[1].trim();

                String firstName = tokens[2].trim();

                Student student = new Student(ID, firstName, lastName);

                students.add(student);

            }

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        }
        return students;
    }

    public static String listOfStudents(ArrayList<Training> trainings, ArrayList<Student> students) {
        StringBuilder result = new StringBuilder();
        for (Student student : students) {
            result.append(student.getFirstName() + " " + student.getLastName() + "\n\t");
            for (Training training : trainings) {
                if (student == training.findStudentById(student.getID()))
                    result.append(training.getCourse().getName() + ", ");

            }
            result.append("\n");
        }
        return result.toString();
    }
}
