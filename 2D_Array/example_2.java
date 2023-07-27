/*
Addition of two array
 */
import java.util.*;

public class example_2 {
    static void add(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2){
        if (r1 != r2 || c1 != c2){
            System.out.println("Wrong input Addition not possible");
        }

        int sum[][] = new int[r1][c1];
        for (int i = 0; i < r1; i++) { // row
            for (int j = 0; j < c1; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        printArray(sum);
    }
    static void printArray(int[][] arr){

        for (int i = 0; i < arr.length; i++) { // row
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows in matrix 1");
        int r1 = sc.nextInt();
        System.out.println("Enter number of column in matrix 1");
        int c1 = sc.nextInt();

        int[][] arr1 = new int[r1][c1];

        System.out.println("enter " +r1*c1+ " element in matrix 1");

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter number of rows in matrix 2");
        int r2 = sc.nextInt();
        System.out.println("Enter number of column in matrix 2");
        int c2 = sc.nextInt();

        int[][] arr2 = new int[r2][c2];

        System.out.println("enter " +r2*c2+ " element in matrix 2");

        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 1");
        printArray(arr1);
        System.out.println("Matrix 2");
        printArray(arr2);

        System.out.println("Addition of two array is :");
        add(arr1, r1, c1, arr2, r2, c2);
    }
}

