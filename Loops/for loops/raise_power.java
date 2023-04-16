import java.util.Scanner;

// raise power example1 (2^3)
public class raise_power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a= sc.nextInt();
        System.out.println("Enter power");
        int b = sc.nextInt();
        int ans = 1;

        for (int i = 1; i <=b ; i++) {
            ans *= a;
        }
        System.out.println("Raise power :"+ans);
    }
}
