package arraysnstruct;

public class PassingArrayToMethods {
    static void main() {
        int[] x = {12,14,56,89};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);

    }

    static void change(int[] x) {
        x[2] = 78;

    }
}
