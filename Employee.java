class Employee {

    String name;
    double salary;

    // Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: Rs. " + salary);
    }
}

// Derived class
class Manager extends Employee {

    String department;

    // Constructor
    Manager(String name, double salary, String department) {
        super(name, salary);   // calling parent constructor
        this.department = department;
    }

    // Overriding displayInfo method
    void displayInfo() {
        super.displayInfo();   // calling parent method
        System.out.println("Department: " + department);
    }
}

// Main class
public class EmployeeManagement {

    public static void main(String[] args) {

        System.out.println("Employee Management System");
        System.out.println("--------------------------");

        // Employee object
        Employee e1 = new Employee("Alice", 50000);
        e1.displayInfo();

        System.out.println();

        // Manager object
        Manager m1 = new Manager("Bob", 80000, "IT");
        m1.displayInfo();
    }
}