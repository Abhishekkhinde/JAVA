// find the radix of a given string

import java.util.Scanner;
public class if_else_if_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        String num =sc.nextLine();

        if(num.matches("[01]+")){
            System.out.println("binary radix 01 = 2");
        } 
        else if (num.matches("[0-7]+")) {
            System.out.println("octal radix = 8");
        } 
        else if (num.matches("[0-9]+")) {
            System.out.println("decimal radix = 10");
        }
        else if (num.matches("[0-9A-F]+")) {
            System.out.println("hexa radix = 16");
        }
        else {
            System.out.println("not a number");
        }
    }
}
