import java.util.*;

class Studentsystem {
    int rollNo;
    String name;
    int age;
    String course;
    double marks;

    // Constructor
    Student(int rollNo, String name, int age, String course, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }

    // Display method
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("-------------------------");
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
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
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();

                    // Check uniqueness
                    boolean exists = false;
                    for (Student s : list) {
                        if (s.rollNo == roll) {
                            exists = true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("Roll number already exists!");
                        break;
                    }

                    sc.nextLine(); // clear buffer
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    list.add(new Student(roll, name, age, course, marks));
                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    if (list.isEmpty()) {
                        System.out.println("No students found!");
                    } else {
                        for (Student s : list) {
                            s.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll No to Search: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;

                    for (Student s : list) {
                        if (s.rollNo == searchRoll) {
                            s.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Roll No to Update Marks: ");
                    int updateRoll = sc.nextInt();
                    boolean updated = false;

                    for (Student s : list) {
                        if (s.rollNo == updateRoll) {
                            System.out.print("Enter New Marks: ");
                            s.marks = sc.nextDouble();
                            System.out.println("Marks Updated Successfully!");
                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter Roll No to Delete: ");
                    int deleteRoll = sc.nextInt();
                    boolean removed = false;

                    Iterator<Student> it = list.iterator();
                    while (it.hasNext()) {
                        Student s = it.next();
                        if (s.rollNo == deleteRoll) {
                            it.remove();
                            System.out.println("Student Deleted Successfully!");
                            removed = true;
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 6:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
