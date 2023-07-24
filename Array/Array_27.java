/*find the second larggest element in the array */

import java.util.*;
public class Array_28 {
    static int firstmax(int[] arr){
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }
    static int secondmax(int[] arr){
        int mx = firstmax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondmax = firstmax(arr);
        return secondmax;
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
        System.out.println(secondmax(arr));
    }
}
