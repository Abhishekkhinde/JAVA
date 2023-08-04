/*
method: pre- calculating the horizontal sum for each row in the matrix
Given a matrix 'a' of dimenstion N * M and 2 cordinates (l1 , r1) and (l2 , r2)
   return the sum of the rectangle from (l1 , r1) to (l2 , r2)
 */

import java.util.*;
public class example_12 {
    static void findprefixsummatrix(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;

        //traverse horizontally to calculate row - wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j-1];
            }
        }
        //traverse vertically to calculate column - wise prefix sum
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                matrix[i][j] += matrix[i-1][j];
            }

        }
    }
    static int findsum3 (int[][] matrix , int l1, int r1, int l2, int r2){
        int sum = 0, ans=0 ,up = 0, left = 0, leftup = 0;
        findprefixsummatrix(matrix);

        sum = matrix[l2][r2];

        if (r1 >= 1) {
            left = matrix[l2][r1-1];
        }

        if (l1 >= 1){
            up = matrix[l1 -1][r2];
        }
        if (l1 >= 1 && r1 >= 1) {
            leftup = matrix[l1-1][r1-1];
        }
        return sum;
    }

    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter row and column");

        int r= sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("enter "+r*c+" element in matrix");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter rectangle boundary l1, r1, l2, r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();


        System.out.println("rectangle sum : "+findsum3(matrix,l1,r1,l2,r2) );

    }
}
