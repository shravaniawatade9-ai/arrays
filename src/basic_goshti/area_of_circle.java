package basic_goshti;

import java.util.Scanner;
//for taking input from the user write this
//Scanner sc= new Scanner(System.in);
//and write this in front of value which u want to take as input
//        double r = sc.nextDouble() ; *** [[if it is integer then r=sc.nextInt() ]]****
// and then [import java.util.Scanner;] will automatically came up if it dosent then write it yourself

public class area_of_circle {
    static void main() {
        System.out.println("enter value of r");
        Scanner sc= new Scanner(System.in);
        double r = sc.nextDouble() ;
        double area = 3.14*r*r ;
        System.out.println("\nthe area of circle is :");
        System.out.println(area);
    }
}
//examples
//int shravani = sc.nextInt();
//int n = nextInt();
//double avg = sc.nextDouble()

//system.out.println(shravani+n+avg);
