package recursion;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 3, 712, 76, 9, 34, 5};
        int ele = sc.nextInt();
        System.out.println(exists(arr, ele, 0));  // start from index 0
    }

    static boolean exists(int[] arr, int ele, int index) {
        // Base case 1: exhausted the array → not found
        if (index == arr.length) return false;

        // Base case 2: found the element
        if (arr[index] == ele) return true;

        // Recursive case: check the rest of the array
        return exists(arr, ele, index + 1);
    }
}