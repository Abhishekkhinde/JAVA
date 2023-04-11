/* - Write a program which takes the values of length and breadth from user and check if it is
a Square or not */
import java.util.Scanner;

public class if_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length");
        int length = sc.nextInt();
        System.out.println("enter breadth");
        int breadth = sc.nextInt();

        System.out.println("length is = "+length);
        System.out.println("breadth is = "+breadth);

        if(length == breadth){
            System.out.println("It is a square");
        }
        else {
            System.out.println("it is not a square");
        }
    }
}
