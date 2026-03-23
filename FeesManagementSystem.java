import java.util.Scanner;

class Student {
    int studentId;
    String studentName;
    double tuitionFee;

    // static variables
    static String collegeName = "Magizhchi Arts and Science College";
    static int studentCount = 0;

    // final variable
    final double ADMISSION_FEE = 5000;

    // Constructor
    Student(int id, String name, double fee) {
        this.studentId = id;
        this.studentName = name;
        this.tuitionFee = fee;
        studentCount++;
    }

    // Method to calculate total fee
    double calculateTotalFee() {
        return tuitionFee + ADMISSION_FEE;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Fee: " + calculateTotalFee());
        System.out.println();
    }

    // Static method to display student count
    static void displayStudentCount() {
        System.out.println("Total Students: " + studentCount);
    }
}

public class FeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Student 1
        System.out.print("Enter Student 1 ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student 1 Name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter Tuition Fee: ");
        double fee1 = sc.nextDouble();

        // Input for Student 2
        System.out.print("\nEnter Student 2 ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student 2 Name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter Tuition Fee: ");
        double fee2 = sc.nextDouble();

        // Creating objects
        Student s1 = new Student(id1, name1, fee1);
        Student s2 = new Student(id2, name2, fee2);

        // Display
        System.out.println("\nCollege Name: " + Student.collegeName + "\n");

        s1.displayDetails();
        s2.displayDetails();

        Student.displayStudentCount();

        sc.close();
    }
}