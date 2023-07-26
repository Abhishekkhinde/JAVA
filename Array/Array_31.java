/*
sort an array consisting of only 0S and 1S
array = 1 0 0 1 0 1 1 0 0
ans = 0 0 0 0 1 1 1 1
 */

import java.util.*;
public class Array_31 {
    static void sortarray(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            } else {
                if (arr[left] == 0) {
                    left++;
                }
                if (arr[right] == 1) {
                    right--;
                }
            }
        }
        printarray(arr);
    }
    static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    static void printarray(int[] arr){
        for(int x:arr){
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
        sortarray(arr);
    }
}
