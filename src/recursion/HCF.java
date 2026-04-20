package recursion;

import java.util.Scanner;

public class HCF {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = hcf(a,b);
        System.out.println(result);
    }

    static int hcf(int a, int b) {
        if (b==0) return a;
        //euclidean algorithm :=
        //hcf(a,b) = hcf(b,remainder of a%b)
        return hcf(b, a%b);
    }
}
