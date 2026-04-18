package conditions;

import java.util.Scanner;

public class int_or_not {
    static void main() {
        // check it is integer or not using double i.e decimals

        Scanner sa = new Scanner(System.in);      //can gve any name sa sab num srk anything to scanar
        System.out.println("enetr num"); //3.14
        double n = sa.nextDouble();
        int x = (int)n;     // typecasting n is double its integer is stored in x
                            //***   "(int)n" means integral part of n****
        if (n-x>0) {    //if n-x is +ve     3.14-3=0.14 which is >0
            System.out.println("not an integer");
        }
        else {
            System.out.println("it is an integer");
        }

    }
}
