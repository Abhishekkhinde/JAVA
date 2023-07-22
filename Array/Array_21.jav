/* Reverse an Array consisting of integer value*/

import java.util.*;
public class Array_21 {
    static void reverse_array(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n-1; i >=0 ; i--) {
            ans[j++] =arr[i];
        }
        for (int x:ans){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter "+n+"Element in Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverse_array(arr);

    }
}
