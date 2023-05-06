import java.util.Scanner;

public class method_1 {
    static int add(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 number");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int d = add(x, y);
        System.out.println(d);
    }
}
