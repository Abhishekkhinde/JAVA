/* Given 2 integer a & b swap the 2 given values using temporary variable */

import java.util.*;

public class method_3 {
    void swap(int a, int b){
        // swap using temporary variable
        System.out.println("swap using temporary variable");
        int temp;
        System.out.println("before swap");
        System.out.println("a = "+a );
        System.out.println("b = "+b );

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swap ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    void swap2(int a, int b){
        // swap without temp variable
        System.out.println("swap without temporary variable");
        System.out.println("before swap");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("after swap");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();

        method_3 object1 = new method_3();
        object1.swap(a,b);

        object1.swap2(a,b);
    }
}
