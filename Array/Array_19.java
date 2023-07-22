/*Given 2 integers a & b swap the 2 given values using temporary variable */


import java.util.*;
public class Array_19 {
    static void SwapTemp(int a, int b){
        System.out.println("before swap"+a);
        System.out.println("before swap"+b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap"+a);
        System.out.println("After swap"+b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();

        SwapTemp(a,b);
    }
}
