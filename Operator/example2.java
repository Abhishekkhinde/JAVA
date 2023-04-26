//  Swap two numbers without the use of third variable.

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1");
        int x = sc.nextInt();
        System.out.println("enter num2");
        int y = sc.nextInt();

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x = "+x);
        System.out.println("y = "+y);

    }
}
