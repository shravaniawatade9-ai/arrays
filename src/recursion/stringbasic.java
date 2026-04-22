package recursion;

import java.util.ArrayList;

public class stringbasic {
    static void main(String[] args) {
        String s  = "Viraj";
        change(s);
        System.out.println(s);
        String[] arr = {"nirmala","prabhakar","gouri"};

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> al = new ArrayList<>();
        al.add("vishal");
        al.add("kirti");
        System.out.println(al);


    }
    static void change(String s) {
        s = "Shravani";
    }
}
