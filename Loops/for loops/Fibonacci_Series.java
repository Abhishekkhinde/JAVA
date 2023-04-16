/* Display Ap(Arithmetic progresion series
  ex =    0,1,1,2,3,5,8,13,21,.....n
  a = 0
  b = 1
  c = a+b;
  a = b;
  b = c;
*/

import java.util.Scanner;
public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("program to print AP series");
        System.out.println("enter a,d,n");

        int a = sc.nextInt(); // Starting number
        int b = sc.nextInt(); //  second number
        int n = sc.nextInt(); // number of term
        int c;
        System.out.println(a+", "+b+", ");
        for (int i = 0; i < n; i++){
            c = a + b;
            a = b;
            b = c;

            System.out.print(c+", ");
        }
    }
}
