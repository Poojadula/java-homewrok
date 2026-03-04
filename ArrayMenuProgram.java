import java.util.Scanner;

public class ArrayMenuProgram {

    static int[] arr = new int[100];
    static int n = 0;
    static boolean isSorted = false;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Accept array elements");
            System.out.println("2. Display array");
            System.out.println("3. Sort array");
            System.out.println("4. Search element");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    accept(sc);
                    break;

                case 2:
                    display();
                    break;

                case 3:
                    sortMenu(sc);
                    break;

                case 4:
                    searchMenu(sc);
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    static void accept(Scanner sc) {
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        isSorted = false;
    }

    static void display() {
        if (n == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void sortMenu(Scanner sc) {
        if (n == 0) {
            System.out.println("Array is empty. Insert elements first.");
            return;
        }

        System.out.println("\nChoose sorting method:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Merge Sort");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                bubbleSort();
                break;
            case 2:
                selectionSort();
                break;
            case 3:
                mergeSort(0, n - 1);
                System.out.println("Array sorted using Merge Sort successfully.");
                break;
            default:
                System.out.println("Invalid sorting choice!");
                return;
        }

        isSorted = true;
    }

    static void searchMenu(Scanner sc) {
        if (n == 0) {
            System.out.println("Array is empty. Insert elements first.");
            return;
        }

        System.out.println("\nChoose searching method:");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        switch (choice) {
            case 1:
                int result1 = linearSearch(key);
                if (result1 != -1)
                    System.out.println("Element found at position " + (result1 + 1));
                else
                    System.out.println("Element not found.");
                break;

            case 2:
                if (!isSorted) {
                    System.out.println("Array must be sorted before Binary Search!");
                } else {
                    int result2 = binarySearch(key);
                    if (result2 != -1)
                        System.out.println("Element found at position " + (result2 + 1));
                    else
                        System.out.println("Element not found.");
                }
                break;

            default:
                System.out.println("Invalid search choice!");
        }
    }

    static void bubbleSort() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array sorted using Bubble Sort successfully.");
    }

    static void selectionSort() {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("Array sorted using Selection Sort successfully.");
    }

    static void mergeSort(int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(low, mid);
            mergeSort(mid + 1, high);
            merge(low, mid, high);
        }
    }

    static void merge(int low, int mid, int high) {
        int[] temp = new int[100];

        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j <= high) {
            if (arr[i] < arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (i <= mid)
            temp[k++] = arr[i++];

        while (j <= high)
            temp[k++] = arr[j++];

        for (i = low; i <= high; i++)
            arr[i] = temp[i];
    }

    static int linearSearch(int key) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    static int binarySearch(int key) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}