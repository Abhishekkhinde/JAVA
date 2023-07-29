/*
Transpose array in place without using extra place
 */

import java.util.*;

public class example_5 {
    static void printArray(int[][] matrix){

        for (int i = 0; i < matrix.length; i++) { // row
            //System.out.println(arr[i]);
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void transposeinplace(int[][] matrix, int r, int c){
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp =matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }
        printArray(matrix);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r = sc.nextInt();
        System.out.println("Enter number of col");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("enter " +r*c+ " element in matrix");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("transpose of the matrix ");
        transposeinplace(matrix,r,c);

    }
}
