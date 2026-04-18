package loop;

import java.util.Scanner;

public class for_loop {
    static void main() {
        //loop=repetition or pattern
        //display AP  2,5,8,11...upto 'n' terms
        //an= a + (n-1)d     so for nth term i.e end term is 2 + (n-1)*3 = 3n - 1
        System.out.println("enter a num");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("the required AP is ");
        for (int i=2;i<=3*n-1;i+=3){
            System.out.println(i);
        }
        // number of terms

    }
}
