import java.util.Scanner;
import java.util.Stack;

public class SupermarketBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> items = new Stack<>();
        int choice;

        do {
            System.out.println("\n1. Add Item");
            System.out.println("2. Undo Last Item");
            System.out.println("3. View Last Scanned Item");
            System.out.println("4. Display All Items");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String item = sc.nextLine();
                    items.push(item);
                    System.out.println("Item added: " + item);
                    break;

                case 2:
                    if (!items.isEmpty()) {
                        String removed = items.pop();
                        System.out.println("Removed last scanned item: " + removed);
                    } else {
                        System.out.println("No items to undo.");
                    }
                    break;

                case 3:
                    if (!items.isEmpty()) {
                        System.out.println("Last scanned item: " + items.peek());
                    } else {
                        System.out.println("No items in the bill.");
                    }
                    break;

                case 4:
                    if (!items.isEmpty()) {
                        System.out.println("Scanned items: " + items);
                    } else {
                        System.out.println("No items scanned yet.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}