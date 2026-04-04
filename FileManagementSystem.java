import java.io.*;
import java.util.Scanner;

public class FileManagementSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== FILE MANAGEMENT SYSTEM =====");
            System.out.println("1. Write Data");
            System.out.println("2. Read Data");
            System.out.println("3. Append Data");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    writeData(sc);
                    break;

                case 2:
                    readData();
                    break;

                case 3:
                    appendData(sc);
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);

        sc.close();
    }

    // 1. Write Data (Overwrite)
    public static void writeData(Scanner sc) {
        try {
            FileWriter fw = new FileWriter("student.txt"); // overwrite mode
            System.out.print("Enter data to write: ");
            String data = sc.nextLine();

            fw.write(data);
            fw.close();

            System.out.println("Data written successfully (Old data overwritten).");

        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }

    // 2. Read Data
    public static void readData() {
        try {
            File file = new File("student.txt");

            if (!file.exists()) {
                System.out.println("File does not exist.");
                return;
            }

            FileReader fr = new FileReader(file);
            Scanner reader = new Scanner(fr);

            System.out.println("\n--- File Content ---");
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }

            reader.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }

    // 3. Append Data
    public static void appendData(Scanner sc) {
        try {
            FileWriter fw = new FileWriter("student.txt", true); // append mode
            System.out.print("Enter data to append: ");
            String data = sc.nextLine();

            fw.write("\n" + data);
            fw.close();

            System.out.println("Data appended successfully.");

        } catch (IOException e) {
            System.out.println("Error appending file.");
        }
    }
}