/*
print 2D Array
 */
import java.util.*;

public class example_1 {
    static void printArray(int[][] arr){

        for (int i = 0; i < arr.length; i++) { // row
            //System.out.println(arr[i]);
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r = sc.nextInt();
        System.out.println("Enter number of col");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("enter " +r*c+ " element in array");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr);
    }
}
