/*
Given an integer array 'a' sorted in non - decreasing order return an array of the squares of each number
in non - decreasing order
 */
import  java.util.*;
public class Array_34 {
    static void reverse(int[] arr ){
        int i = 0 , j= arr.length - 1;
        while (i<j){
            swap(arr , i , j);
            i++;
            j--;
        }
    }
    static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    static int[] sortsquare(int[] arr){
        int n = arr.length;
        int left =0, right = n-1;
        int[] ans = new int[n];
        int k = 0;

        while (left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++]=arr[left] * arr[left];
                left++;
            }
            else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        reverse(ans);
        printarray(ans);
        return ans;
    }

    static void printarray(int[] arr){
        for (int x : arr){
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
        int[] ans = sortsquare(arr);
        System.out.println("print short array: ");
        printarray(ans);
    }
}
