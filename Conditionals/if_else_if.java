/* Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and
   calculate Profit or Loss.*/
import java.util.Scanner;

public class if_else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cost price");
        int cp = sc.nextInt();
        System.out.println("Enter selling price");
        int sp = sc.nextInt();
        int amt;

        if (cp>sp){
            amt = cp - sp;
            System.out.println("the loss is : "+amt);
        } else if (cp<sp) {
            amt = sp - cp;
            System.out.println("the loss is : "+amt);
        }
        else {
            System.out.println("No profit No loss");
        }

    }
}
