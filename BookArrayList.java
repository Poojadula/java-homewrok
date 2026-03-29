import java.util.ArrayList;
import java.util.Scanner;

// Book class
class BookArrayList {
    int bookId;
    String title;
    String author;
    String status; // "Available" or "Issued"

    // Constructor
    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.status = "Available";
    }

    // Display method
    public void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Status: " + status);
        System.out.println("---------------------------");
    }
}

// Main class
public class LibraryManagementSystem {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by ID");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Delete Book");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Add Book
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();

                    // Check duplicate ID
                    boolean exists = false;
                    for (Book b : books) {
                        if (b.bookId == id) {
                            exists = true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("Book ID already exists!");
                        break;
                    }

                    sc.nextLine(); // consume newline
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    books.add(new Book(id, title, author));
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    // View All Books
                    if (books.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        for (Book b : books) {
                            b.display();
                        }
                    }
                    break;

                case 3:
                    // Search Book
                    System.out.print("Enter Book ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (Book b : books) {
                        if (b.bookId == searchId) {
                            b.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    // Issue Book
                    System.out.print("Enter Book ID to issue: ");
                    int issueId = sc.nextInt();
                    boolean issued = false;

                    for (Book b : books) {
                        if (b.bookId == issueId) {
                            if (b.status.equals("Issued")) {
                                System.out.println("Book is already issued!");
                            } else {
                                b.status = "Issued";
                                System.out.println("Book issued successfully!");
                            }
                            issued = true;
                            break;
                        }
                    }

                    if (!issued) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 5:
                    // Return Book
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();
                    boolean returned = false;

                    for (Book b : books) {
                        if (b.bookId == returnId) {
                            if (b.status.equals("Available")) {
                                System.out.println("Book is already available!");
                            } else {
                                b.status = "Available";
                                System.out.println("Book returned successfully!");
                            }
                            returned = true;
                            break;
                        }
                    }

                    if (!returned) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 6:
                    // Delete Book
                    System.out.print("Enter Book ID to delete: ");
                    int deleteId = sc.nextInt();
                    boolean deleted = false;

                    for (Book b : books) {
                        if (b.bookId == deleteId) {
                            books.remove(b);
                            System.out.println("Book deleted successfully!");
                            deleted = true;
                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 7);

        sc.close();
    }
}