import java.util.Scanner;

// Given an matrix an N*M matrix 'a' return all the element of the matrix in spiral order
public class example_8 {
    static void printmatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void spiral(int[][] matrix, int r, int c){
        int toprow = 0, bottomrow = r-1, leftcol = 0, rightcol = c-1;

        int total_element = 0;
        while (total_element < r*c){

            // top row
            for (int j = leftcol; j <= rightcol && total_element< r*c; j++) {
                System.out.print(matrix[toprow][j] + " ");
                total_element++;
            }
            toprow++;

            // right column
            for (int i = toprow; i <= bottomrow && total_element< r*c; i++) {
                System.out.print(matrix[i][rightcol] + " ");
                total_element++;
            }
            rightcol--;

            // bottom row
            for (int j = rightcol; j >= leftcol && total_element< r*c; j--) {
                System.out.print(matrix[bottomrow][j] + " ");
                total_element++;
            }
            System.out.println();
            bottomrow--;

            // left column
            for (int i = bottomrow; i >= toprow && total_element< r*c; i--) {
                System.out.print(matrix[i][leftcol] + " ");
                total_element++;
            }
            leftcol++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row and columns");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("enter "+r*c+"element in matrix");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("spiral order of the given matrix");
        spiral(matrix,r,c);

        System.out.println(matrix);
    }
}
