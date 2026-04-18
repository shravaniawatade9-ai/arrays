package basic_goshti;

public class divisionofdatatypes {
    static void main() {
       // double x = 5/2;
       // System.out.println(x);
        //double can store decimal nums but we are storing 5/2 in x
        // so first java will calculate 5/2 which is shown as 2 instead of 2.5
        // as for java 5 and 2 both are int so it will give an int
        //that is why when we run the code it shows 2 as value of x instead of 2.5
        // ie first compute/calculate saperately then store
        double x = 5.0/2.0;
        System.out.println(x);
        //  5/2----> 2
        //  5.0/2----> 2.5
        //  5/2.0----> 2.5
        //  5.0/2.0----> 2.5
        // ekbhi double hua to o/p in double
        //if both are in int form than o/p will be int

    }
}
