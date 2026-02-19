import java.util.Scanner;

public class DailyExpenseTracker {

    static double[] expenses = new double[100];  // Array to store expenses
    static int size = 0;                         // Number of expenses added

    // Function to add expense
    public static void addExpense(Scanner sc) {
        if (size >= expenses.length) {
            System.out.println("Expense list is full!");
            return;
        }

        System.out.print("Enter expense amount: ");
        double amount = sc.nextDouble();

        if (amount < 0) {
            System.out.println("Invalid amount!");
            return;
        }

        expenses[size] = amount;
        size++;

        System.out.println("Expense added successfully.");
    }

    // Function to view all expenses
    public static void viewExpenses() {
        if (size == 0) {
            System.out.println("No expenses recorded.");
            return;
        }

        System.out.println("All Expenses:");
        for (int i = 0; i < size; i++) {
            System.out.println("Expense " + (i + 1) + ": " + expenses[i]);
        }
    }

    // Function to calculate total expense
    public static void calculateTotal() {
        double total = 0;

        for (int i = 0; i < size; i++) {
            total += expenses[i];
        }

        System.out.println("Total Expense: " + total);
    }

    // Function to find highest expense
    public static void findHighest() {
        if (size == 0) {
            System.out.println("No expenses recorded.");
            return;
        }

        double highest = expenses[0];

        for (int i = 1; i < size; i++) {
            if (expenses[i] > highest) {
                highest = expenses[i];
            }
        }

        System.out.println("Highest Expense: " + highest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Daily Expense Tracker ---");
            System.out.println("1. Add Expense");
            System.out.println("2. View All Expenses");
            System.out.println("3. Calculate Total Expense");
            System.out.println("4. Find Highest Expense");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addExpense(sc);
                    break;
                case 2:
                    viewExpenses();
                    break;
                case 3:
                    calculateTotal();
                    break;
                case 4:
                    findHighest();
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
