import java.util.Scanner;

class BankAccount {
    int balance = 1000; // Initial balance

    void deposit(int amount) {
        balance += amount;
        System.out.println("Amount deposited");
        System.out.println("Balance = " + balance);
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn");
            System.out.println("Balance = " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayBalance() {
        System.out.println("Balance = " + balance);
    }
	public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();

        while (true) {
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int depositAmount = sc.nextInt();
                    acc.deposit(depositAmount);
                    break;

                case 2:
                    int withdrawAmount = sc.nextInt();
                    acc.withdraw(withdrawAmount);
                    break;

                case 3:
                    acc.displayBalance();
                    break;

                case 4:
                    System.out.println("Exit");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
}

