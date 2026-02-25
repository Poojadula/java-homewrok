import java.util.Scanner;

public class UniqueArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements (N): ");
        int N = sc.nextInt();

        int[] arr = new int[N];

        System.out.println("Enter " + N + " integer elements:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nElements without duplicates:");

        
        for (int i = 0; i < N; i++) {
            boolean isDuplicate = false;

            
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}