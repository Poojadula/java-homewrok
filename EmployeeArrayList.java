import java.util.ArrayList;
import java.util.Scanner;

// Employee class
class EmployeeArrayList {
    int empId;
    String name;
    String department;
    double basicSalary;

    // Constructor
    public Employee(int empId, String name, String department, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
    }

    // Method to calculate net salary
    public double calculateNetSalary() {
        double hra = 0.20 * basicSalary;
        double da = 0.10 * basicSalary;
        double pf = 0.05 * basicSalary;

        return basicSalary + hra + da - pf;
    }

    // Display method
    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("---------------------------");
    }
}

// Main class
public class EmployeePayrollSystem {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Employee Payroll Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Update Basic Salary");
            System.out.println("5. Calculate Net Salary");
            System.out.println("6. Delete Employee");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Add Employee
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();

                    // Check duplicate ID
                    boolean exists = false;
                    for (Employee e : employees) {
                        if (e.empId == id) {
                            exists = true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("Employee ID already exists!");
                        break;
                    }

                    sc.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    double salary = sc.nextDouble();

                    employees.add(new Employee(id, name, dept, salary));
                    System.out.println("Employee added successfully!");
                    break;

                case 2:
                    // View All Employees
                    if (employees.isEmpty()) {
                        System.out.println("No employee records found.");
                    } else {
                        for (Employee e : employees) {
                            e.display();
                        }
                    }
                    break;

                case 3:
                    // Search Employee
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (Employee e : employees) {
                        if (e.empId == searchId) {
                            e.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    // Update Salary
                    System.out.print("Enter Employee ID to update salary: ");
                    int updateId = sc.nextInt();
                    boolean updated = false;

                    for (Employee e : employees) {
                        if (e.empId == updateId) {
                            System.out.print("Enter new Basic Salary: ");
                            e.basicSalary = sc.nextDouble();
                            System.out.println("Salary updated successfully!");
                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 5:
                    // Calculate Net Salary
                    System.out.print("Enter Employee ID: ");
                    int calcId = sc.nextInt();
                    boolean calculated = false;

                    for (Employee e : employees) {
                        if (e.empId == calcId) {
                            double netSalary = e.calculateNetSalary();
                            System.out.println("Net Salary: " + netSalary);
                            calculated = true;
                            break;
                        }
                    }

                    if (!calculated) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 6:
                    // Delete Employee (safe removal)
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = sc.nextInt();
                    boolean deleted = false;

                    for (int i = 0; i < employees.size(); i++) {
                        if (employees.get(i).empId == deleteId) {
                            employees.remove(i);
                            System.out.println("Employee deleted successfully!");
                            deleted = true;
                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 7);

        sc.close();
    }
}