/*
Transpose of a matrix
Write a program to display transpose of the matrix entered by the user.
 */

import java.util.*;
public class example_4 {

    static void printArray(int[][] arr){

        for (int i = 0; i < arr.length; i++) { // row
            //System.out.println(arr[i]);
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] find_transpose(int[][] matrix, int r, int c){
        int ans[][]= new int[c][r];

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
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
        int[][] ans = find_transpose(matrix,r,c);
        printArray(ans);
    }
}
