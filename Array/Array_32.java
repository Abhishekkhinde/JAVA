/*
Given an array of integer 'a' move all the even integer at the beginning the array followed by all the odd
integer the relative order of odd or even integer does not matter return any array that satisfies the condition.
 */

import java.util.*;
public class Array_32 {
    static void sortarraybyparity(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            if (arr[left] % 2 == 1 && arr[right] % 2== 0) {
                swap(arr, left, right);
                left++;
                right--;
            } else {
                if (arr[left] % 2== 0) {
                    left++;
                }
                if (arr[right] % 2 == 1) {
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
        sortarraybyparity(arr);
    }
}
