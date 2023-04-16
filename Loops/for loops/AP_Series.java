/* Display Ap(Arithmetic progresion series
  ex =    3,6,9,12,15,18......n
*/

import java.util.Scanner;
public class AP_Series {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("program to print AP series");
        System.out.println("enter a,d,n");

        int a = sc.nextInt(); // Starting number
        int d = sc.nextInt(); // distance between two number
        int n = sc.nextInt(); // number of term
        int term = a;

        for (int i = 0; i < n; i++){
            System.out.print(term+", ");
            term = term + d;
        }
    }
}
