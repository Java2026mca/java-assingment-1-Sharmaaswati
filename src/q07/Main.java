import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the size of the array
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input: Read n integers into the array
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }

        int swaps = 0;

        // Optimized Bubble Sort logic
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Perform the swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                    // Increment swap counter
                    swaps++;
                }
            }
        }

        // Print sorted array ascending, space-separated
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            // Prevent trailing space at the end of the line
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        
        // Move to a new line after the array
        System.out.println();

        // Print total number of swaps
        System.out.println("Swaps: " + swaps);
    }
}
