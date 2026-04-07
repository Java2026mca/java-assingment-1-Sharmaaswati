import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;

for (int i = 0; i < n; i++) {
    System.out.print(a);
    
    if (i < n - 1) {
        System.out.print(" ");
    }
    
    int next = a + b;
    a = b;
    b = next;
}
        // TODO: Print first n Fibonacci numbers separated by spaces
        //       F(0)=0, F(1)=1, F(n)=F(n-1)+F(n-2)
        //
        // Input: 8
        // Output: 0 1 1 2 3 5 8 13

    }
}
