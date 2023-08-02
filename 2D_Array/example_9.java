import java.util.Scanner;

/* Given a positive integer n, generated an n*n matrix filled
with element from 1 to n^2 in spiral order */
public class example_9 {
    static void printmatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] generatespiralmatrix(int n){
        int toprow = 0, bottomrow = n-1, leftcol = 0, rightcol = n-1;
        int curr = 1;
        int[][] matrix = new int[n][n];
        while (curr <= n*n){

            // top row
            for (int j = leftcol; j <= rightcol && curr <= n*n; j++) {
                matrix[toprow][j] = curr++;
            }
            toprow++;

            // right column
            for (int i = toprow; i <= bottomrow && curr <= n*n; i++) {
                matrix[i][rightcol] = curr++;
            }
            rightcol--;

            // bottom row
            for (int j = rightcol; j >= leftcol && curr <= n*n; j--) {
                matrix[bottomrow][j] = curr++;
            }
            bottomrow--;

            // left column
            for (int i = bottomrow; i >= toprow && curr <= n*n; i--) {
                matrix[i][leftcol] = curr++;
            }
            leftcol++;
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();

        System.out.println("Generated Spiral matrix");
        int[][] matrix=generatespiralmatrix(n);

        printmatrix(matrix);
    }
}
