/* Reverse an Array without using new Array*/

import java.util.*;
public class Array_22 {
    static void reversarray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i<j){
            swapinarray(arr,i,j);
            i++;
            j--;
        }
    }
    static void swapinarray(int[] arr, int i, int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        for(int x :arr){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + "Element in Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reversarray(arr);
        System.out.println();
    }
}
