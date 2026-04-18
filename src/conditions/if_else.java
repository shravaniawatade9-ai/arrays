package conditions;

import java.util.Scanner;

public class if_else {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nenetr num");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("even num");
        } else {
            System.out.println("odd num");
        }


        //only if
        // print absolute value -ve la +ve
        if (n < 0) {
            n = -n;                   //changing sign and making num +ve
        }
        System.out.println(n);       // if n< 0 if condi will be true so it will run if loop and convert -ve to +ve
        //othewise even if condi is false it won't run the loop will jump
        // and directly print n as it is
        /// curly bracket so that if conditon is true or false you can print more than one statements
        // it will print all the statements those within curly brackets







    }

}