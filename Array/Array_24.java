/* Rotate the given array a by k steps where k is non negative without using extra space*/

import java.util.Scanner;
import java.util.Scanner.*;
public class Array_24 {
    static void reverse(int arr[], int i, int j){
        while (i<j){
            swapinarray(arr,i,j);
            i++;
            j--;
        }
    }
    static void rotateinplace(int[] arr,int k){
        int n = arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }
    static void swapinarray(int[] arr, int i, int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        System.out.println("rotate after k step");
        for(int x :arr){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + "Ele  `1ment in Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k step");
        int k = sc.nextInt();

        rotateinplace(arr,k);
    }
}
