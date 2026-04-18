package functions;
//use : u can use loop when u want repeat things instantly but when u want repeat
// something in diff mode u always form loop for it so we use function when we want repeat
// something in different modes to increase """"REUSEABILITY""""
public class syntax {
    public static void shravani() {
        System.out.println("awatade");
    }

    public static void main() {
        System.out.print("viraj\t");  //as u want viraj awatade in one line so dont write println just write print("")
        shravani();                   // after function call function println will print in same line as it has ln so
        System.out.print("vijay\t");  // next sout will print in next line
        shravani();
        System.out.print("gouri\t");
        shravani();
        System.out.print("shravani\t");
        shravani();
    }
}



