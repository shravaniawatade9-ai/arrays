package recursion;

public class globlevariable {
    static int x = 10;          //globlly declared hence all methods can access it i.e main and fun both
    // i.e accessable to everyone hence they can even change it
    static void main() {
        fun();
        System.out.println(x);
    }

    static void fun() {
        System.out.println(x);
        // int x = 2000// local declaration only limited for this method
        // there is overshadow of variable java will get confused and wont change 10 to 20 written below
        //it will always prefer the globle hence will print 10 for both print statements
        x = 20 ;          //  i.e accessable to everyone hence they can even change it

    }
}
