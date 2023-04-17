/*          print the pattern
            1 2 3 4 5 6
            1 2 3 4 5 6
            1 2 3 4 5 6
            1 2 3 4 5 5
            1 2 3 4 5 6
            1 2 3 4 5 6
  */
import java.util.Scanner;
public class pattern_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int r = sc.nextInt();

        for (int i = 1; i <=r; i++) {
            for (int j = 1; j <=r; j++) {
                System.out.print(j);
            }
            System.out.println( );
        }
    }
}
