// reverse the digit of number
import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        int reversenum = 0;
        while (num>0){
            reversenum = reversenum * 10 + num % 10;
            num = num/10;
        }
        System.out.println("sum of digits = "+reversenum);
    }
}
