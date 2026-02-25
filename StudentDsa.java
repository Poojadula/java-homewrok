import java.util.Scanner;

class StudentDsa {
    int marks;
}

public class Main {

    // Option 1 – Pass by Value (int)
    static void increaseMarks(int marks) {
        marks = marks + 10;
        System.out.println("Inside method: " + marks);
    }

    // Option 2 – Pass by Reference (Object)
    static void updateMarks(Student s) {
        s.marks = s.marks + 10;
        System.out.println("Inside method: " + s.marks);
    }

    // Option 3 – Pass by Value (String)
    static void changeName(String name) {
        name = name + " Kumar";
        System.out.println("Inside method: " + name);
    }

    // Option 4 – Pass by Reference (Array)
    static void modifyArray(int arr[]) {
        arr[0] = 99;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {

            System.out.println("\n---- MENU ----");
            System.out.println("1. Pass by Value – Increase Marks");
            System.out.println("2. Pass by Reference – Update Student Marks");
            System.out.println("3. Pass by Value – Change String");
            System.out.println("4. Pass by Reference – Modify Array");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter marks: ");
                int marks = sc.nextInt();

                System.out.println("Before method call: " + marks);
                increaseMarks(marks);
                System.out.println("After method call: " + marks);
            }

            else if (choice == 2) {

                System.out.print("Enter student marks: ");
                int m = sc.nextInt();

                Student s = new Student();
                s.marks = m;

                System.out.println("Before method call: " + s.marks);
                updateMarks(s);
                System.out.println("After method call: " + s.marks);
            }

            else if (choice == 3) {

                sc.nextLine(); // clear buffer
                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.println("Before method: " + name);
                changeName(name);
                System.out.println("After method: " + name);
            }

            else if (choice == 4) {

                int arr[] = new int[3];

                System.out.println("Enter 3 numbers:");
                for (int i = 0; i < 3; i++) {
                    arr[i] = sc.nextInt();
                }

                System.out.print("Before method: ");
                for (int i = 0; i < 3; i++) {
                    System.out.print(arr[i] + " ");
                }

                modifyArray(arr);

                System.out.print("\nAfter method: ");
                for (int i = 0; i < 3; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }

            else if (choice == 5) {
                System.out.println("Program Exited Successfully");
            }

            else {
                System.out.println("Invalid Choice");
            }
        }

        sc.close();
    }
}