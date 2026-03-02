
import java.util.Scanner;

public class MainInsertArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of array
        int n = sc.nextInt();

        int[] arr = new int[n + 1];

        // Read array elements
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read element to insert and position
        int element = sc.nextInt();
        int pos = sc.nextInt();

        // Shift elements to the right
        for(int i = n; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert element
        arr[pos - 1] = element;

        // Print updated array
        for(int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}