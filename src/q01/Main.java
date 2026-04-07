import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // TODO: Print a hollow diamond pattern of half-height n using '*'
        //
        // Rules:
        //   - Only border cells have '*', inside is spaces
        //   - No trailing spaces on any line
        //
        // Input: 4
        // Output:
        //    *
        //   * *
        //  *   *
        // *     *
        //  *   *
        //   * *
        //    *
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            if (i == 1) {
                System.out.print("*");
            } else {
                System.out.print("*");

                // inner spaces
                for (int s = 1; s <= 2 * i - 3; s++) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {

            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            if (i == 1) {
                System.out.print("*");
            } else {
                System.out.print("*");
                for (int s = 1; s <= 2 * i - 3; s++) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }

            System.out.println();
        }

    }
}
