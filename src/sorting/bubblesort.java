package sorting;

import java.util.Arrays;

public class bubblesort {
    static void main() {
        // repitative process of swapping elements to sort array= bubble sort
        int [] arr = {10,23,45,67,12,2,3,11,0};
        int n = arr.length;
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        for(int i = 0; i < n-1; i++) {
            int swaps = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
            if (swaps == 0) break; // outer loop will run for once(1 pass) if nothing is changed
            // than if condi will be true outer loop will break :: time complexity = n if it is sorted
        }
        System.out.println("\nthe sorted array is ");
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
