import java.util.Scanner;

public class ExamProgram {

    static int[] scores = new int[100];   // Array to store scores
    static int size = 0;                  // Number of scores entered

    // Function to add score
    public static void addScore(Scanner sc) {
        if (size >= scores.length) {
            System.out.println("Array is full!");
            return;
        }

        System.out.print("Enter exam score: ");
        int score = sc.nextInt();

        scores[size] = score;
        size++;

        System.out.println("Score added successfully.");
    }

    // Function to display scores
    public static void displayScores() {
        if (size == 0) {
            System.out.println("No scores available.");
            return;
        }

        System.out.println("Exam Scores:");
        for (int i = 0; i < size; i++) {
            System.out.println(scores[i]);
        }
    }

    // Function to count pass scores
    public static void countPass() {
        int pass = 0;

        for (int i = 0; i < size; i++) {
            if (scores[i] >= 50) {   // Passing mark = 50
                pass++;
            }
        }

        System.out.println("Number of pass scores: " + pass);
    }

    // Function to count fail scores
    public static void countFail() {
        int fail = 0;

        for (int i = 0; i < size; i++) {
            if (scores[i] < 50) {
                fail++;
            }
        }

        System.out.println("Number of fail scores: " + fail);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Exam Score");
            System.out.println("2. Display All Scores");
            System.out.println("3. Count Pass Scores");
            System.out.println("4. Count Fail Scores");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addScore(sc);
                    break;
                case 2:
                    displayScores();
                    break;
                case 3:
                    countPass();
                    break;
                case 4:
                    countFail();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
