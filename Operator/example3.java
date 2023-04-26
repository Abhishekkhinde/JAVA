/* Write a java program to calculate the sum of the digits of a 3-digit number.
   Sample Input: 132
   Sample Output: 6
*/
import java.util.Scanner;
public class example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three digits number ");
        int num = sc.nextInt();
        int sum = 0;
        int digit;
        while(num > 0){
            digit = num % 10;
            num = num / 10;
            sum = sum + digit;
        }
        System.out.println(sum);

    }
}
