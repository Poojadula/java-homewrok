import java.util.Scanner;

class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    // static variables
    static String shopName = "Mano Fabrics Online Store";
    static double gstPercent = 18.0;

    // final variable
    final double DELIVERY_CHARGE = 50;

    // Constructor
    Product(int id, String name, double price, int quantity) {
        this.productId = id;
        this.productName = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Calculate subtotal
    double calculateSubtotal() {
        return price * quantity;
    }

    // Calculate GST
    double calculateGST() {
        return calculateSubtotal() * gstPercent / 100;
    }

    // Calculate final bill
    double calculateFinalBill() {
        return calculateSubtotal() + calculateGST() + DELIVERY_CHARGE;
    }

    // Display bill
    void displayBill() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Subtotal: " + calculateSubtotal());
        System.out.println("GST: " + calculateGST());
        System.out.println("Delivery Charge: " + DELIVERY_CHARGE);
        System.out.println("Final Bill: " + calculateFinalBill());
    }
	public class ShoppingBillGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        // Create object
        Product p = new Product(id, name, price, quantity);

        // Display bill
        System.out.println("\nShop Name: " + Product.shopName + "\n");
        p.displayBill();

        sc.close();
    }
}
}

