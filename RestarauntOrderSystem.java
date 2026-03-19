import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RestaurantOrderSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> orders = new LinkedList<>();
        int choice;

        do {
            System.out.println("\n1. Add Order");
            System.out.println("2. Serve Order");
            System.out.println("3. View Next Order");
            System.out.println("4. Display All Orders");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter order: ");
                    String order = sc.nextLine();
                    orders.offer(order); // or add()
                    System.out.println("Order added: " + order);
                    break;

                case 2:
                    if (!orders.isEmpty()) {
                        String served = orders.poll(); // or remove()
                        System.out.println("Served order: " + served);
                    } else {
                        System.out.println("No orders to serve.");
                    }
                    break;

                case 3:
                    if (!orders.isEmpty()) {
                        System.out.println("Next order: " + orders.peek());
                    } else {
                        System.out.println("No pending orders.");
                    }
                    break;

                case 4:
                    if (!orders.isEmpty()) {
                        System.out.println("Pending orders: " + orders);
                    } else {
                        System.out.println("No orders in queue.");
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