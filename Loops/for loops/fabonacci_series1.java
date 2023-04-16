import java.util.Scanner;
public class fabonacci_series1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num= sc.nextInt();
        int a = 1;
        int b = 1;
        int sum = 0;

        for (int i = 1 ; i<=num ; i++){
            System.out.print(a+" ");
            sum = a+b;
            a=b;
            b=sum;
        }
    }
}
