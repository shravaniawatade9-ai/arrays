package recursion;

import java.util.Scanner;

public class fibseries {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fib(n);
        System.out.println(ans);
    }
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }
}
