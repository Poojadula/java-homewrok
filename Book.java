class Book {
    int bookId;
    String title;
    String author;
    boolean isAvailable;

    // Constructor
    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // Book is available when added
    }

    // Display book details
    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        System.out.println("----------------------------");
    }

    // Borrow book
    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    // Return book
    void returnBook() {
        isAvailable = true;
        System.out.println("Book returned successfully.");
    }
}