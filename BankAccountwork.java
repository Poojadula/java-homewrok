import java.util.Scanner;

// BankAccount Class
class BankAccountwork {
    String name;
    int accNo;
    double balance;

    // Constructor
    BankAccount(String name, int accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    // Inner Class for Transactions
    class Transaction {

        void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Amount Deposited Successfully!");
            } else {
                System.out.println("Invalid Amount!");
            }
        }

        void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal Successful!");
            } else {
                System.out.println("Insufficient Balance!");
            }
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Account No: " + accNo);
        System.out.println("Balance: " + balance);
        System.out.println("--------------------------");
    }
}

// Node Class for Linked List
class Node {
    BankAccount data;
    Node next;

    Node(BankAccount data) {
        this.data = data;
        this.next = null;
    }
}

// Bank Class
class Bank {
    Node head = null;

    // Create Account
    void createAccount(String name, int accNo, double balance) {
        BankAccount acc = new BankAccount(name, accNo, balance);
        Node newNode = new Node(acc);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        System.out.println("Account Created Successfully!");
    }

    // Search Account
    BankAccount searchAccount(int accNo) {
        Node temp = head;

        while (temp != null) {
            if (temp.data.accNo == accNo) {
                return temp.data;
            }
            temp = temp.next;
        }

        return null;
    }

    // Display Single Account
    void displayAccount(int accNo) {
        BankAccount acc = searchAccount(accNo);

        if (acc != null) {
            acc.display();
        } else {
            System.out.println("Account Not Found!");
        }
    }

    // Display All Accounts
    void displayAll() {
        if (head == null) {
            System.out.println("No Accounts Available!");
            return;
        }

        Node temp = head;
        while (temp != null) {
            temp.data.display();
            temp = temp.next;
        }
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        int choice;

        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    sc.nextLine(); // consume newline
                    String name = sc.nextLine();

                    System.out.print("Enter Account No: ");
                    int accNo = sc.nextInt();

                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();

                    bank.createAccount(name, accNo, balance);
                    break;

                case 2:
                    System.out.print("Enter Account No: ");
                    accNo = sc.nextInt();

                    BankAccount acc1 = bank.searchAccount(accNo);

                    if (acc1 != null) {
                        System.out.print("Enter Deposit Amount: ");
                        double amount = sc.nextDouble();

                        BankAccount.Transaction t = acc1.new Transaction();
                        t.deposit(amount);
                    } else {
                        System.out.println("Account Not Found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account No: ");
                    accNo = sc.nextInt();

                    BankAccount acc2 = bank.searchAccount(accNo);

                    if (acc2 != null) {
                        System.out.print("Enter Withdraw Amount: ");
                        double amount = sc.nextDouble();

                        BankAccount.Transaction t = acc2.new Transaction();
                        t.withdraw(amount);
                    } else {
                        System.out.println("Account Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account No: ");
                    accNo = sc.nextInt();

                    bank.displayAccount(accNo);
                    break;

                case 5:
                    bank.displayAll();
                    break;

                case 6:
                    System.out.println("Thank You for Using Banking System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}