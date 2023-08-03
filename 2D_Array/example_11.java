/* 
method: pre- calculating the horizontal sum for each row in the matrix
Given a matrix 'a' of dimenstion N * M and 2 cordinates (l1 , r1) and (l2 , r2)
   return the sum of the rectangle from (l1 , r1) to (l2 , r2)
 */

import java.util.*;
public class example_11 {
    static void findprefixsummatrix(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;

        //traverse horizontally to calculate row - wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j-1];
            }
        }
    }
    static int findsum2 (int[][] matrix , int l1, int r1, int l2, int r2){
        int sum = 0;
        findprefixsummatrix(matrix);

        for (int i = l1; i <= l2 ; i++) {
            //r1 to r2 sum for row i
            if (r1 >= 1){
                sum += matrix[i][r2] - matrix[i][r1-1];
            }
            else {
                sum += matrix[i][r2];
            }
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


        System.out.println("rectangle sum : "+findsum2(matrix,l1,r1,l2,r2) );

    }
}
