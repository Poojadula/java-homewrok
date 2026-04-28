import java.util.*;

class Company {
    String name;
    String location;
}

class Vehicle {
    String vehicleNo;
    String type;
}

class Driver {
    String name;
    String licenseNo;
}

class Product {
    String productName;
    int quantity;
}

class Delivery {
    String shopName;
    double distance;
    String status;

    Delivery(String shopName, double distance) {
        this.shopName = shopName;
        this.distance = distance;
        this.status = "Pending";
    }
}

public class TransportSystem {

    static Company company = new Company();
    static Vehicle vehicle = new Vehicle();
    static Driver driver = new Driver();
    static Product product = new Product();
    static ArrayList<Delivery> deliveries = new ArrayList<>();

    static double ratePerKm = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Transport Delivery System =====");
            System.out.println("1. Add Company Details");
            System.out.println("2. Add Vehicle Details");
            System.out.println("3. Add Driver Details");
            System.out.println("4. Add Product Load Details");
            System.out.println("5. Add Shop Delivery Details");
            System.out.println("6. View All Trip Details");
            System.out.println("7. View Pending Deliveries");
            System.out.println("8. Mark Delivery as Completed");
            System.out.println("9. Calculate Trip Amount");
            System.out.println("10. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Company Name: ");
                    company.name = sc.nextLine();
                    System.out.print("Enter Location: ");
                    company.location = sc.nextLine();
                    break;

                case 2:
                    System.out.print("Enter Vehicle No: ");
                    vehicle.vehicleNo = sc.nextLine();
                    System.out.print("Enter Vehicle Type: ");
                    vehicle.type = sc.nextLine();
                    break;

                case 3:
                    System.out.print("Enter Driver Name: ");
                    driver.name = sc.nextLine();
                    System.out.print("Enter License No: ");
                    driver.licenseNo = sc.nextLine();
                    break;

                case 4:
                    System.out.print("Enter Product Name: ");
                    product.productName = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    product.quantity = sc.nextInt();
                    break;

                case 5:
                    System.out.print("Enter Shop Name: ");
                    String shop = sc.nextLine();
                    System.out.print("Enter Distance (KM): ");
                    double dist = sc.nextDouble();
                    deliveries.add(new Delivery(shop, dist));
                    break;

                case 6:
                    System.out.println("\n--- Trip Details ---");
                    System.out.println("Company: " + company.name);
                    System.out.println("Vehicle: " + vehicle.vehicleNo);
                    System.out.println("Driver: " + driver.name);
                    System.out.println("Product: " + product.productName);

                    for (Delivery d : deliveries) {
                        System.out.println("Shop: " + d.shopName +
                                " | KM: " + d.distance +
                                " | Status: " + d.status);
                    }
                    break;

                case 7:
                    System.out.println("\n--- Pending Deliveries ---");
                    for (Delivery d : deliveries) {
                        if (d.status.equals("Pending")) {
                            System.out.println(d.shopName);
                        }
                    }
                    break;

                case 8:
                    System.out.print("Enter Shop Name to mark completed: ");
                    String name = sc.nextLine();
                    for (Delivery d : deliveries) {
                        if (d.shopName.equalsIgnoreCase(name)) {
                            d.status = "Completed";
                        }
                    }
                    break;

                case 9:
                    double totalKm = 0;
                    for (Delivery d : deliveries) {
                        totalKm += d.distance;
                    }
                    double amount = totalKm * ratePerKm;
                    System.out.println("Total KM: " + totalKm);
                    System.out.println("Total Amount: " + amount);
                    break;

                case 10:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 10);
    }
}