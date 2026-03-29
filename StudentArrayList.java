import java.util.ArrayList;
import java.util.Scanner;

// Student class
class StudentArrayList {
    int rollNumber;
    String name;
    int age;
    String course;
    double marks;

    // Constructor
    public Student(int rollNumber, String name, int age, String course, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }

    // Display student details
    public void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("---------------------------");
    }
}

// Main class
public class StudentManagementSystem {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. Update Student Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Add Student
                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();

                    // Check duplicate roll number
                    boolean exists = false;
                    for (Student s : students) {
                        if (s.rollNumber == roll) {
                            exists = true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("Roll number already exists!");
                        break;
                    }

                    sc.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    students.add(new Student(roll, name, age, course, marks));
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    // View All Students
                    if (students.isEmpty()) {
                        System.out.println("No records found.");
                    } else {
                        for (Student s : students) {
                            s.display();
                        }
                    }
                    break;

                case 3:
                    // Search Student
                    System.out.print("Enter Roll Number to search: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;

                    for (Student s : students) {
                        if (s.rollNumber == searchRoll) {
                            s.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    // Update Marks
                    System.out.print("Enter Roll Number to update marks: ");
                    int updateRoll = sc.nextInt();
                    boolean updated = false;

                    for (Student s : students) {
                        if (s.rollNumber == updateRoll) {
                            System.out.print("Enter new marks: ");
                            s.marks = sc.nextDouble();
                            System.out.println("Marks updated successfully!");
                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    // Delete Student
                    System.out.print("Enter Roll Number to delete: ");
                    int deleteRoll = sc.nextInt();
                    boolean removed = false;

                    for (Student s : students) {
                        if (s.rollNumber == deleteRoll) {
                            students.remove(s);
                            System.out.println("Student deleted successfully!");
                            removed = true;
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}