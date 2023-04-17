/*          print the pattern
            *
            * *
            * * *
            * * * *
 */
import java.util.Scanner;
public class pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row");
        int r = sc.nextInt();

        for (int i = 1; i <=r; i++) {
            for (int j = 1; j <=i; j++) {
                    System.out.print("*");
            }
            System.out.println( );

        }
    }
}
