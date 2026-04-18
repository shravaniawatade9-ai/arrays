package recursion;

import java.util.Scanner;

public class oneTOn {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        shrads(1,n);
    }
    static void shrads(int x,int n) {
        if(x>n) return;
        System.out.println(x);
        shrads(x+1,n);

    }
}
