import java.util.Scanner;

// Abstract class
abstract class Shape {
    double value;

    // Constructor
    Shape(double value) {
        this.value = value;
    }

    // Abstract method
    abstract void calculateArea();
}

// Circle class
class Circle extends Shape {

    Circle(double radius) {
        super(radius);
    }

    @Override
    void calculateArea() {
        double area = Math.PI * value * value;
        System.out.println("Area of Circle: " + area);
    }
}

// Square class
class Square extends Shape {

    Square(double side) {
        super(side);
    }

    @Override
    void calculateArea() {
        double area = value * value;
        System.out.println("Area of Square: " + area);
    }
}

// Main class
public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Shape Area Calculator ---");
            System.out.println("1. Circle");
            System.out.println("2. Square");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    double radius = sc.nextDouble();
                    Shape circle = new Circle(radius);
                    circle.calculateArea();
                    break;

                case 2:
                    System.out.print("Enter side: ");
                    double side = sc.nextDouble();
                    Shape square = new Square(side);
                    square.calculateArea();
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 3);

        sc.close();
    }
}