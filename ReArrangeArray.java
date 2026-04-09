public class ReArrangeArray {
    public static void rearrange(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            if (arr[left] < 0) {
                left++;
            } else {
                // Swap positive number with element at right
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5, -6};
        rearrange(arr);

        // Print rearranged array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}