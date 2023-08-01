import java.util.Scanner;

/*
    Given an integer n, return the first n rows of pascals triangle each number
    is the sum of the two numbers directly above it as shown:

   ex. for n = 5
       0    1   2   3   4
   0 | 1 |
   1 | 1 | 1 |
   2 | 1 | 2 | 1 |
   3 | 1 | 3 | 3 | 1 |
   4 | 1 | 4 | 6 | 4 | 1 |
 */
public class example_7 {
    static void printArray(int[][] arr) {

        for (int i = 0; i < arr.length; i++) { // row
            //System.out.println(arr[i]);
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static  int[][] pascal(int n){
        int[][] ans= new int[n][];

        for (int i = 0; i < n; i++) {
            ans[i] = new int[i+1];
            ans[i][0] = ans[i][i] = 1;

            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();

        int[][] ans = pascal(n);

        printArray(ans);
    }
}
