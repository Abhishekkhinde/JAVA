import java.util.Scanner;

public class method_2 {
    static int max(int x, int y){
        if (x>y){
            return x;
        }
        else{
            return y;
        }
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        method_2 mc = new method_2();
        System.out.println("enter 2 value ");
        int a= sc.nextInt();
        int b = sc.nextInt();

        System.out.println(mc.max(a,b));
    }
}
