public class SumHalfArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4, 5};

        System.out.println("Sum (arr1): " + sumHalf(arr1)); // 
        System.out.println("Sum (arr2): " + sumHalf(arr2)); // 
    }

    public static int sumHalf(int[] arr) {
        int n = arr.length;
        
        // If odd, include middle element → (n + 1) / 2
        int halfLength = (n + 1) / 2;

        int sum = 0;
        for (int i = 0; i < halfLength; i++) {
            sum += arr[i];
        }

        return sum;
    }
}