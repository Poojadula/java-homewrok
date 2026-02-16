import java.util.Scanner;

public class TwoDCharArrayMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        char[][] arr = new char[rows][cols];

        int choice;

        do {
            System.out.println("\n---- MENU ----");
            System.out.println("1. Insert");
            System.out.println("2. Display");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter character values:");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            arr[i][j] = sc.next().charAt(0);
                        }
                    }
                    break;

                case 2:
                    System.out.println("Array Elements:");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}