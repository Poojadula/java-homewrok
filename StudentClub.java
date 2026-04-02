import java.util.*;

public class StudentClub {

    static Set<String> members = new HashSet<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- Student Club Management ---");
            System.out.println("1. Add Member");
            System.out.println("2. Remove Member");
            System.out.println("3. Search Member");
            System.out.println("4. Display All Members");
            System.out.println("5. Count Members");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    addMember();
                    break;
                case 2:
                    removeMember();
                    break;
                case 3:
                    searchMember();
                    break;
                case 4:
                    displayMembers();
                    break;
                case 5:
                    countMembers();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);
    }

    // Add Member
    static void addMember() {
        System.out.print("Enter member name: ");
        String name = sc.nextLine();

        if (members.add(name)) {
            System.out.println("Member added successfully!");
        } else {
            System.out.println("Member already exists!");
        }
    }

    // Remove Member
    static void removeMember() {
        System.out.print("Enter member name to remove: ");
        String name = sc.nextLine();

        if (members.remove(name)) {
            System.out.println("Member removed successfully!");
        } else {
            System.out.println("Member not found!");
        }
    }

    // Search Member
    static void searchMember() {
        System.out.print("Enter member name to search: ");
        String name = sc.nextLine();

        if (members.contains(name)) {
            System.out.println("Member found in the club!");
        } else {
            System.out.println("Member not found!");
        }
    }

    // Display All Members
    static void displayMembers() {
        if (members.isEmpty()) {
            System.out.println("No members in the club!");
        } else {
            System.out.println("Club Members:");
            for (String m : members) {
                System.out.println(m);
            }
        }
    }

    // Count Members
    static void countMembers() {
        System.out.println("Total Members: " + members.size());
    }
}