import java.util.*;

class Book1 {
    int bookId;
    String title;
    String author;
    String status; // Available / Issued

    // Constructor
    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.status = "Available";
    }

    // Display method
    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Status: " + status);
        System.out.println("---------------------------");
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();
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
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();

                    // Check unique ID
                    boolean exists = false;
                    for (Book b : list) {
                        if (b.bookId == id) {
                            exists = true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("Book ID already exists!");
                        break;
                    }

                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    list.add(new Book(id, title, author));
                    System.out.println("Book Added Successfully!");
                    break;

                case 2:
                    if (list.isEmpty()) {
                        System.out.println("No books available!");
                    } else {
                        for (Book b : list) {
                            b.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to Search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (Book b : list) {
                        if (b.bookId == searchId) {
                            b.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to Issue: ");
                    int issueId = sc.nextInt();
                    boolean issued = false;

                    for (Book b : list) {
                        if (b.bookId == issueId) {
                            if (b.status.equals("Available")) {
                                b.status = "Issued";
                                System.out.println("Book Issued Successfully!");
                            } else {
                                System.out.println("Book already issued!");
                            }
                            issued = true;
                            break;
                        }
                    }

                    if (!issued) {
                        System.out.println("Book not found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter Book ID to Return: ");
                    int returnId = sc.nextInt();
                    boolean returned = false;

                    for (Book b : list) {
                        if (b.bookId == returnId) {
                            if (b.status.equals("Issued")) {
                                b.status = "Available";
                                System.out.println("Book Returned Successfully!");
                            } else {
                                System.out.println("Book is already available!");
                            }
                            returned = true;
                            break;
                        }
                    }

                    if (!returned) {
                        System.out.println("Book not found!");
                    }
                    break;

                case 6:
                    System.out.print("Enter Book ID to Delete: ");
                    int deleteId = sc.nextInt();
                    boolean removed = false;

                    Iterator<Book> it = list.iterator();
                    while (it.hasNext()) {
                        Book b = it.next();
                        if (b.bookId == deleteId) {
                            it.remove();
                            System.out.println("Book Deleted Successfully!");
                            removed = true;
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Book not found!");
                    }
                    break;

                case 7:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}