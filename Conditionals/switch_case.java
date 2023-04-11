/*Write a program to print positive number entered by the user, if user enters a negative
number, it is skipped */

import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char op;
        double a;
        double b;
        double ans;
        System.out.println("enter +,-,*,/");
        op = sc.next().charAt(0);
        System.out.println("enter a");
        a = sc.nextDouble();
        System.out.println("enter b");
        b = sc.nextDouble();

        switch (op){
            case '+':
                ans = a+b;
                System.out.println("addition is = "+ans);
                break;

            case '-':
                ans = a-b;
                System.out.println("subtraction is = "+ans);
                break;

            case '*':
                ans = a*b;
                System.out.println("multiplication is = "+ans);
                break;

            case '/':
                ans = a/b;
                System.out.println("Division is = "+ans);
                break;

            default :
                System.out.println("enter valid operation");
        }
    }
}
