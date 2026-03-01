import java.util.Scanner;

public class LinearSearchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // size of array
        int[] arr = new int[n];

        // Read array elements
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt(); // element to search
        int index = -1;

        // Linear Search
        for(int i = 0; i < n; i++) {
            if(arr[i] == target) {
                index = i;
                break;
            }
        }

        System.out.println("Index: " + index);
    }
}