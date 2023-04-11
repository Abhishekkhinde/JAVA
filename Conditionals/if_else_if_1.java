/* Write a program to calculate marks to grades . Follow the conversion rule as given below :
                    100 - 90        A+
                    90 - 80         A
                    80 - 70         B+
                    70 - 60         B
                    60 - 50         C
                    50 - 40         D
                    40 - 30         E
                    30 - 0          F
                    */
import java.util.Scanner;
public class if_else_if_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;
        System.out.println("enter marks");
        marks = sc.nextInt();

        if (marks >= 90){
            System.out.println("your grade is A+");
        }
        else if (marks >= 80) {
            System.out.println("your grade is A");
        }
        else if (marks >= 70) {
            System.out.println("your grade is B+");
        }
        else if (marks >= 60) {
            System.out.println("your grade is B");
        }
        else if (marks >= 50) {
            System.out.println("your grade is C");
        }
        else if (marks >= 40) {
            System.out.println("your grade is D");
        }
        else if (marks >= 30) {
            System.out.println("your grade is E");
        }
        else if (marks < 30) {
            System.out.println("your grade is F");
        }
        else {
            System.out.println("Enter valid marks");
        }
    }
}
