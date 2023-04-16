// print the sum of n natural number
import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int sum = 0;

        for (int num = 0; num <=n; num++) {
            sum = sum+num;
        }
        System.out.println("sum of n natural number = "+sum);
    }
}
