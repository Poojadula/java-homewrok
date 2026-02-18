import java.util.Scanner;

public class AreaCalculator {

    // Function to calculate area of rectangle
    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    // Function to calculate area of circle
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Function to calculate area of square
    public static double squareArea(double side) {
        return side * side;
    }

    // Function to calculate area of triangle
    public static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Area Calculator =====");
            System.out.println("1. Area of Rectangle");
            System.out.println("2. Area of Circle");
            System.out.println("3. Area of Square");
            System.out.println("4. Area of Triangle");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter length: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter width: ");
                    double width = sc.nextDouble();
                    double rectArea = rectangleArea(length, width);
                    System.out.println("Area of Rectangle = " + rectArea);
                    break;

                case 2:
                    System.out.print("Enter radius: ");
                    double radius = sc.nextDouble();
                    double circArea = circleArea(radius);
                    System.out.println("Area of Circle = " + circArea);
                    break;

                case 3:
                    System.out.print("Enter side: ");
                    double side = sc.nextDouble();
                    double sqArea = squareArea(side);
                    System.out.println("Area of Square = " + sqArea);
                    break;

                case 4:
                    System.out.print("Enter base: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double height = sc.nextDouble();
                    double triArea = triangleArea(base, height);
                    System.out.println("Area of Triangle = " + triArea);
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
