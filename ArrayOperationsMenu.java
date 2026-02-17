import java.util.Scanner;

public class ArrayOperationsMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Find Maximum");
            System.out.println("2. Find Minimum");
            System.out.println("3. Find Second Maximum");
            System.out.println("4. Find Second Minimum");
            System.out.println("5. Reverse Array");
            System.out.println("6. Find Average");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    int max = arr[0];
                    for (int i = 1; i < n; i++) {
                        if (arr[i] > max) {
                            max = arr[i];
                        }
                    }
                    System.out.println("Maximum element: " + max);
                    break;

                case 2:
                    int min = arr[0];
                    for (int i = 1; i < n; i++) {
                        if (arr[i] < min) {
                            min = arr[i];
                        }
                    }
                    System.out.println("Minimum element: " + min);
                    break;

                case 3:
                    int max1 = Integer.MIN_VALUE;
                    int max2 = Integer.MIN_VALUE;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] > max1) {
                            max2 = max1;
                            max1 = arr[i];
                        } else if (arr[i] > max2 && arr[i] != max1) {
                            max2 = arr[i];
                        }
                    }

                    if (max2 == Integer.MIN_VALUE)
                        System.out.println("Second Maximum not found.");
                    else
                        System.out.println("Second Maximum element: " + max2);
                    break;

                case 4:
                    int min1 = Integer.MAX_VALUE;
                    int min2 = Integer.MAX_VALUE;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] < min1) {
                            min2 = min1;
                            min1 = arr[i];
                        } else if (arr[i] < min2 && arr[i] != min1) {
                            min2 = arr[i];
                        }
                    }

                    if (min2 == Integer.MAX_VALUE)
                        System.out.println("Second Minimum not found.");
                    else
                        System.out.println("Second Minimum element: " + min2);
                    break;

                case 5:
                    int start = 0;
                    int end = n - 1;
                    while (start < end) {
                        int temp = arr[start];
                        arr[start] = arr[end];
                        arr[end] = temp;
                        start++;
                        end--;
                    }

                    System.out.println("Array after reverse:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 6:
                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        sum += arr[i];
                    }
                    double average = (double) sum / n;
                    System.out.println("Average: " + average);
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
