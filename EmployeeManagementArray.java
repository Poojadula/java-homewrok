import java.util.Scanner;

public class EmployeeManagementArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] employee = new int[100];   // fixed size array
        int count = 0;                   // number of employees stored
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add employee ID");
            System.out.println("2. Remove employee ID");
            System.out.println("3. Display employee IDs");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count < employee.length) {
                        System.out.print("Enter employee ID: ");
                        int id = sc.nextInt();
                        employee[count] = id;   // add at end
                        count++;
                        System.out.println("Employee ID added.");
                    } else {
                        System.out.println("Employee list is full.");
                    }
                    break;

                case 2:
                    System.out.print("Enter employee ID to remove: ");
                    int removeId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (employee[i] == removeId) {
                            
                            // Shift elements left
                            for (int j = i; j < count - 1; j++) {
                                employee[j] = employee[j + 1];
                            }

                            count--;   // reduce count
                            found = true;
                            System.out.println("Employee ID removed.");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee ID not found.");
                    }
                    break;

                case 3:
                    if (count == 0) {
                        System.out.println("No employee IDs available.");
                    } else {
                        System.out.println("\nEmployee IDs:");
                        for (int i = 0; i < count; i++) {
                            System.out.print(employee[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}