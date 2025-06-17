package STREAMS_EXAMPLES;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Constructor
    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Display method
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: $" + salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class EmployeeCustome {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Adding 5-6 records
        employees.add(new Employee(3, "Charlie", 60000));
        employees.add(new Employee(4, "Diana", 58000));
        employees.add(new Employee(5, "Ethan", 62000));
        employees.add(new Employee(6, "Fiona", 53000));
        employees.add(new Employee(1, "Alice", 50000));
        employees.add(new Employee(2, "Bob", 55000));


        // Display all employees
        for (Employee emp : employees) {
            emp.display();
        }
    }

    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(3, "Zharlie", 60000));
        employees.add(new Employee(4, "Diana", 58000));
        employees.add(new Employee(5, "Ethan", 62000));
        employees.add(new Employee(6, "Fiona", 53000));
        employees.add(new Employee(1, "Alice", 50000));
        employees.add(new Employee(2, "Bob", 55000));


        return employees;
    }

    public static List<Employee> getEmployees2() {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(3, "Pharlie", 60000));
        employees.add(new Employee(4, "Oiana", 58000));
        employees.add(new Employee(5, "Nthan", 62000));
        employees.add(new Employee(6, "Miona", 500));
        employees.add(new Employee(1, "Zlice", 50000));
        employees.add(new Employee(2, "Yob", 55000));
        employees.add(new Employee(2, "Xob", 55000));


        return employees;
    }

    public static List<Employee> getEmployees3() {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(3, "Pharlie", 60000));
        employees.add(new Employee(1, "Alice Again", 51000));
        employees.add(new Employee(5, "Nthan", 62000));
        employees.add(new Employee(3, "Bob Duplicate", 51000));
        employees.add(new Employee(1, "Zlice", 55000));
        employees.add(new Employee(2, "Yob", 56000));
        employees.add(new Employee(2, "Xob", 55000));


        return employees;
    }

    public static Employee getEmployees4() {
        return null;

//        return new Employee(3, "Charlie", 60000);


    }

    public static Employee dummyMehtod() {

        // Adding 5-6 records
        return new Employee(0,"NA",0);


    }
}

