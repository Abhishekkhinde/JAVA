// copy array element to another array
// deep copy
// arr.clone();

import java.util.*;

public class Array_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int size = sc.nextInt();

        int[] arr1 = new int[size];

        int[] arr2 ;

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }
        System.out.println();
        arr2 = Arrays.copyOfRange(arr1,0,4);
        System.out.println("arr2");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr2[i]);
        }
        System.out.println();

        System.out.println("after changing element");

        int a = sc.nextInt();
        int b = sc.nextInt();

        arr2[2] = a;
        arr2[3] = b;
        System.out.println("array3");

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }
        System.out.println();
        System.out.println("array2");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr2[i]);
        }
    }
}

