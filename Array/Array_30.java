import java.util.Scanner;

/*
sort an array consisting of only 0S and 1S
array = 1 0 0 1 0 1 1 0 0
ans = 0 0 0 0 1 1 1 1
 */
public class Array_30 {
    static void short_zero_one(int[] arr){
        int n = arr.length;
        int zeroes = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0){
                zeroes++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i<zeroes){
                arr[i] =0;
                System.out.println(arr[i]);
            }
            else {
                arr[i] = 1;
                System.out.println(arr[i]);
            }
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
        Array_30 obj1 = new Array_30();

        obj1.short_zero_one(arr);
    }
}
