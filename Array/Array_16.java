import java.util.Scanner;
import java.util.*;

public class Array_16 {
    void countmax(int arr[]){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max ) {
                max = arr[i];
            }
        }
        System.out.println("max = "+max);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("enter element in array");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
        Array_16 obj1= new Array_16();
        obj1.countmax(arr);
    }
}
