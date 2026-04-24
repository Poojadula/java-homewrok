import java.util.*;

public class StringOperations {

    // Find duplicate characters
    public static Set<Character> findDuplicates(String str) {
        Set<Character> duplicates = new HashSet<>();
        Set<Character> seen = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (seen.contains(ch)) {
                duplicates.add(ch);
            } else {
                seen.add(ch);
            }
        }
        return duplicates;
    }

    // Remove spaces
    public static String removeSpaces(String str) {
        return str.replaceAll("\\s+", "");
    }

    // Reverse string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Menu-driven program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- STRING OPERATIONS MENU ---");
            System.out.println("1. Find Duplicate Characters");
            System.out.println("2. Remove Spaces");
            System.out.println("3. Reverse String");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 4) break;

            System.out.print("Enter string: ");
            String input = sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Duplicate characters: " + findDuplicates(input));
                    break;

                case 2:
                    System.out.println("String without spaces: " + removeSpaces(input));
                    break;

                case 3:
                    System.out.println("Reversed string: " + reverseString(input));
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
        System.out.println("Program exited.");
    }
}