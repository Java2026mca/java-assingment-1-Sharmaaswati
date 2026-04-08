import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1;

        // Fill spiral
        while (top <= bottom && left <= right) {
            // left → right
            for (int i = left; i <= right; i++) {
                arr[top][i] = num++;
            }
            top++;

            // top → bottom
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = num++;
            }
            right--;

            // right → left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    arr[bottom][i] = num++;
                }
                bottom--;
            }

            // bottom → top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    arr[i][left] = num++;
                }
                left++;
            }
        }

        // Print matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
                if (j < n - 1) System.out.print(" ");
            }
            System.out.println();
        }

        // Diagonal sum (Summing the 'X' pattern)
        int sum = 0;
        for (int i = 0; i < n; i++) {
            // Add primary diagonal element
            sum += arr[i][i];
            
            // Add secondary diagonal element IF it's not the same as the primary (for odd n)
            if (i != n - 1 - i) {
                sum += arr[i][n - 1 - i];
            }
        }

        System.out.println("Diagonal: " + sum);
    }
}
