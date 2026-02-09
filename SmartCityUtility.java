import java.util.Scanner;

public class SmartCityUtility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("------ SMART CITY UTILITY MENU ------");
            System.out.println("1. Electricity Bill");
            System.out.println("2. Water Bill");
            System.out.println("3. Internet Plan");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                // 🔹 OPTION 1 – Electricity Bill
                case 1:
                    System.out.print("Enter units consumed: ");
                    int units = sc.nextInt();
                    int bill = 0;

                    if (units <= 100) {
                        bill = units * 2;
                    }
                    else if (units <= 300) {
                        bill = units * 3;
                    }
                    else {
                        bill = units * 5;
                    }

                    System.out.println("Electricity Bill = ₹" + bill);
                    break;


                // 🔹 OPTION 2 – Water Bill (Nested if)
                case 2:
                    System.out.println("House Type:");
                    System.out.println("1. Apartment");
                    System.out.println("2. Individual House");
                    int type = sc.nextInt();

                    if (type == 1) {
                        System.out.println("Water Bill = ₹300");
                    }
                    else {
                        if (type == 2) {   // nested if
                            System.out.println("Water Bill = ₹500");
                        }
                        else {
                            System.out.println("Invalid house type");
                        }
                    }
                    break;


                // 🔹 OPTION 3 – Internet Plan (nested if inside else if)
                case 3:
                    System.out.println("1. Basic Plan – ₹399");
                    System.out.println("2. Standard Plan – ₹699");
                    System.out.println("3. Premium Plan – ₹999");
                    System.out.print("Enter plan choice: ");

                    int plan = sc.nextInt();

                    if (plan == 1) {
                        System.out.println("Selected Basic Plan – ₹399");
                    }
                    else if (plan == 2) {
                        if (plan == 2) {  // nested if
                            System.out.println("Selected Standard Plan – ₹699");
                        }
                    }
                    else if (plan == 3) {
                        System.out.println("Selected Premium Plan – ₹999");
                    }
                    else {
                        System.out.println("Invalid plan");
                    }
                    break;


                // 🔹 OPTION 4 – Exit
                case 4:
                    System.out.println("Thank you for using Smart City Utility System");
                    break;


                default:
                    System.out.println("Invalid choice");
            }

            System.out.println();

        } while (choice != 4);

        sc.close();
    }
}