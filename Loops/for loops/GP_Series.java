/* Display Ap(Arithmetic progresion series
  ex =    3,6,18,54,......n
  a = 3
  r = 6 / 3  = 3
  r = 18 / 3  = 3

*/

import java.util.Scanner;
public class GP_Series {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("program to print AP series");
        System.out.println("enter a,d,n");

        int a = sc.nextInt(); // Starting number
        int r = sc.nextInt(); //  relation between two number
        int n = sc.nextInt(); // number of term
        int term = a;

        for (int i = 0; i < n; i++){
            System.out.print(term+", ");
            term = term * r;
        }
    }
}
