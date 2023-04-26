import java.util.Scanner;

//- Write a program to add 8 to the number x and then divide it by 3. Now, the modulus of the quotient
//is taken with 5 and then multiply the resultant value by 5. Display the final result.

import java.util.Scanner;
public class example1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        System.out.print((((x + 8) / 3) % 5) * 5);
    }
}

