import java.util.*;

class Employeeset {
    int id;
    String name;
    String department;
    double basicSalary;

    // Constructor
    Employee(int id, String name, String department, double basicSalary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
    }

    // Method to calculate Net Salary
    double calculateNetSalary() {
        double hra = 0.20 * basicSalary;
        double da = 0.10 * basicSalary;
        double pf = 0.05 * basicSalary;
        return basicSalary + hra + da - pf;
    }

    // Display employee details
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

public class PayrollSystem {
    static ArrayList<Employee> empList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- Employee Payroll System ---");
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
                    addEmployee();
                    break;
                case 2:
                    viewEmployees();
                    break;
                case 3:
                    searchEmployee();
                    break;
                case 4:
                    updateSalary();
                    break;
                case 5:
                    calculateSalary();
                    break;
                case 6:
                    deleteEmployee();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);
    }

    // Add Employee
    static void addEmployee() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        // Check unique ID
        for (Employee e : empList) {
            if (e.id == id) {
                System.out.println("Employee ID must be unique!");
                return;
            }
        }

        sc.nextLine(); // clear buffer
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        empList.add(new Employee(id, name, dept, salary));
        System.out.println("Employee added successfully!");
    }

    // View All Employees
    static void viewEmployees() {
        if (empList.isEmpty()) {
            System.out.println("No employees found!");
            return;
        }

        for (Employee e : empList) {
            System.out.println("\n-------------------");
            e.display();
        }
    }

    // Search Employee
    static void searchEmployee() {
        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();

        for (Employee e : empList) {
            if (e.id == id) {
                e.display();
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    // Update Salary
    static void updateSalary() {
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();

        for (Employee e : empList) {
            if (e.id == id) {
                System.out.print("Enter new Basic Salary: ");
                e.basicSalary = sc.nextDouble();
                System.out.println("Salary updated successfully!");
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    // Calculate Net Salary
    static void calculateSalary() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        for (Employee e : empList) {
            if (e.id == id) {
                double net = e.calculateNetSalary();
                System.out.println("Net Salary: " + net);
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    // Delete Employee
    static void deleteEmployee() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        Iterator<Employee> it = empList.iterator();
        while (it.hasNext()) {
            Employee e = it.next();
            if (e.id == id) {
                it.remove();
                System.out.println("Employee deleted successfully!");
                return;
            }
        }
        System.out.println("Employee not found!");
    }
}