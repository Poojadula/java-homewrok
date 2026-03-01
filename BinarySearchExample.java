import java.util.Scanner;

public class BinarySearchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int low = 0;
        int high = n - 1;
        int index = -1;

        while(low <= high) {
            int mid = (low + high) / 2;

            if(arr[mid] == target) {
                index = mid;
                break;
            } 
            else if(target < arr[mid]) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }

        if(index != -1) {
            System.out.println("Index: " + index);
        } else {
            System.out.println(-1);
        }

        sc.close();
    }
}