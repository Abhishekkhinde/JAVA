//   leap year is a leap year
import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year");
        int year = sc.nextInt();

        if(year % 4 ==0){
            if (year % 100 ==0){
                if (year % 400 ==0){
                    System.out.println("its a leap year");
                }
                else {
                    System.out.println("its not a leap year");

                }
            }
            else {
                System.out.println("its a leap year");
            }
        }
        else {
            System.out.println("its not a leap year");

        }
    }
}
