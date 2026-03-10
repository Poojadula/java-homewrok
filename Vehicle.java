// Base class
class Vehicle {
    String brand;
    int year;

    // Constructor
    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method to display vehicle info
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

// Derived class Car
class Car extends Vehicle {
    int seats;

    // Constructor
    Car(String brand, int year, int seats) {
        super(brand, year); // call base class constructor
        this.seats = seats;
    }

    // Override displayInfo()
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seats: " + seats);
    }
}

// Derived class Motorcycle
class Motorcycle extends Vehicle {
    String type; // Sports or Cruiser

    // Constructor
    Motorcycle(String brand, int year, String type) {
        super(brand, year);
        this.type = type;
    }

    // Override displayInfo()
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Type: " + type);
    }
	// Main class
public class VehicleManagementSystem {
    public static void main(String[] args) {

        // Creating objects
        Car car = new Car("Toyota", 2022, 5);
        Motorcycle bike = new Motorcycle("Yamaha", 2021, "Sports");

        // Displaying information
        System.out.println("Car Details:");
        car.displayInfo();

        System.out.println("\nMotorcycle Details:");
        bike.displayInfo();
    }
}
}

