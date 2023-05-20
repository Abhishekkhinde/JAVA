// Take a matrix as input from user search for a given number x and print the indices at which it occurs.

import java.util.*;
public class Array2D_1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("enter size of rows");
        int row = sc.nextInt();
        System.out.println("enter size of column");
        int col = sc.nextInt();

        int[][] arr1 = new int[row][col];

        // input
        System.out.println("enter array element");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        // output
        System.out.println("print matrix");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println();
        // for print the indices
        System.out.println("enter x");
        int x = sc.nextInt();

        System.out.println("enter array element");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i][j] == x) {
                    System.out.println("x is found at :"+i+","+j);
                }
            }
        }
    }
}
