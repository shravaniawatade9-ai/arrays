package string;

import java.util.Scanner;

public class javabasics {
    static void main() {
        //string = character array ;
        Scanner sc = new Scanner(System.in);
        String str = "shravani vijay awatade";
        System.out.println(str);
        String str1 = sc.nextLine(); //sc.nextline prints complete line
        System.out.println(str1);
        String str2 = sc.next();  // sc.next prints only one word
        System.out.println(str2);
    }
}
