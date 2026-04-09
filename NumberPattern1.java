public class NumberPattern1 {
    public static void printPattern(int n) {
        int[][] res = new int[n][n]; // temporary array
        int num = 1;

        for (int i = 0; i < n; i++) {
            int x = i;
            int y = 0;

            while (x >= 0) {
                res[x][y] = num;
                num++;
                x--;
                y++;
            }
        }

        // Print the pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (res[i][j] != 0) {
                    System.out.print(res[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}