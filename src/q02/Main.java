import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
          // TODO: Print Pascal's Triangle for n rows
        //       Values on each row separated by single space
        //       No leading or trailing spaces
        //
        // Input: 5
        // Output:
        // 1
        // 1 1
        // 1 2 1
        // 1 3 3 1
        // 1 4 6 4 1
        for (int i = 0; i < n; i++) {
    int num = 1;
    for (int j = 0; j <= i; j++) {
        System.out.print(num);
        
        if (j < i) {
            System.out.print(" ");
        }
        
        num = num * (i - j) / (j + 1);
    }
    System.out.println();
}
      

    }
}
