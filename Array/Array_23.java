/* Rotate the given array a by k steps where k is non negative */


import java.util.Scanner;

public class Array_23 {
    static void rotate(int[] arr, int k){
        int n = arr.length;
         k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for (int i = n-k; i < n; i++) {
            ans[j++]=arr[i];
        }

        for (int i = 0; i < n-k; i++) {
            ans[j++]=arr[i];
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

        System.out.println("Enter " + n + "Ele  `1ment in Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k step");
        int k = sc.nextInt();

        rotate(arr,k);
    }
}