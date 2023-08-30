import java.util.Scanner;

// Geometric common divisor
public class method_5 {
    static int gcd(int a, int b) {
        while (a != b) {
            if (a>b){
                a = a-b;
            }else
                b=b-a;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("gcd = "+gcd(a,b));
    }
}
