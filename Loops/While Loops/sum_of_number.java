// print the sum of n natural number
import java.util.Scanner;

public class sum_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int sum = 0;
        int num = 1;

        while (num<=n){
            sum = sum+num;
            num++;
        }
        System.out.println("sum of n natural number = "+sum);
    }
}
