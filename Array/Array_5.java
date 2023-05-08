/* Take an input from user & search for a given number X and print the index at which occurs*/

import java.util.Scanner;

public class Array_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");

        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("enter element in array");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

        // for a given  number
        System.out.println("enter element for search in array");
        int x = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                System.out.println("x is found at :"+i);
            }
        }
    }
}