import java.util.Scanner;

public class assignment_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number 1");
        int a = sc.nextInt();
        System.out.println("enter number 2");
        int b = sc.nextInt();
        int c;

        System.out.println(c = a);
        System.out.println(a += b);
        System.out.println(a -= b);
        System.out.println(a *= b);
        System.out.println(a /= b);
        System.out.println(a %= b);
    }
}
