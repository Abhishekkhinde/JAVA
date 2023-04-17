import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        int sumofdigits = 0;
        while (num>0){
            sumofdigits = sumofdigits + num % 10;
            num = num/10;
        }
        System.out.println("sum of digits = "+sumofdigits);
    }
}
