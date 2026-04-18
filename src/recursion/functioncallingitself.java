package recursion;

import java.util.Scanner;

public class functioncallingitself {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ajay(1);
    }
    public static void ajay(int n) {
        if (n == 10) return; //n becomes 10 it stops
        {
            System.out.println(n);
            ajay(n + 1); //recursive call
        }
    }
}
