/* Write a program to print positive number entered by the user, if user enters a negative
        number, it is skipped */
import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc. nextInt();

        if(num >= 0){
            System.out.println(" you entered positive number : ");
        }
        else {
            System.out.println("you entered negative number it is skipped");
        }
    }
}
