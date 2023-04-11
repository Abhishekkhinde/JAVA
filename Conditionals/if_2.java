import java.util.Scanner;

/* Write a program to print absolute value of a number entered by the user. */
import java.util.Scanner;
public class if_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        System.out.println("number = "+num);

        if (num<0){
            num = num*-1;
        }
        System.out.println("absolute number = "+num);
    }
}
