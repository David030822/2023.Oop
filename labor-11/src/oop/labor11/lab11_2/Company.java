package oop.labor11.lab11_2;

import oop.labor11.lab11_1.MyDate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Company {
    private String name;
    ArrayList<Employee> employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hire(Employee employee){
        employees.add(employee);
    }

    public void hireAll(String fileName){
        try(Scanner scanner = new Scanner(new File(fileName))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.isEmpty()){
                    continue;
                }
                String[] items = line.split(",");
                Employee emp = null;
                MyDate date = new MyDate(Integer.parseInt(items[3].trim()),
                        Integer.parseInt(items[4].trim()), Integer.parseInt(items[5].trim()));
                if(items.length == 6){
                    emp = new Employee(items[0].trim(), items[1].trim(), Double.parseDouble(items[2].trim()), date);
                }
                else{
                    emp = new Manager(items[0].trim(), items[1].trim(), Double.parseDouble(items[2].trim()), date, items[6].trim());
                }
                employees.add(emp);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }

    public void fire(int id){
        for (Employee employee: employees){
            if(employee.getID() == id){
                employees.remove(id);
            }
            break;
        }
    }

    public void printAll(PrintStream ps){
        for (Employee employee: employees){
            ps.println(employee);
        }
    }

    public void printManagers(PrintStream ps){
        for(Employee employee: employees){
//            if(employee.getClass() == Manager.class){
//                ps.println(employee);
//            }
            if(employee instanceof Manager){
                ps.println(employee);
            }
        }
    }

    public void sortByComparator(Comparator<Employee> employeeComparator){
        Collections.sort(employees, employeeComparator);
    }
}
