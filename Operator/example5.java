/*Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if:
     i) both the conditions 'a < 50' and 'a < b' are true.
    ii) at least one of the conditions 'a < 50' or 'a < b' is true.
*/

import java.util.Scanner;

public class example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();

        System.out.println(a);
        System.out.println(b);

        // both the conditions 'a < 50' and 'a < b' are true.
        System.out.println("a < 50 and a < b");
        System.out.println(a < 50 && a < b);

        // at least one of the conditions 'a < 50' or 'a < b' is true.\
        System.out.println("a < 50 or a < b");
        System.out.println(a < 50 || a < b);
    }

}
