/*          print the pattern
            1 2 1 2 1 2
            2 1 2 1 2 1
            1 2 1 2 1 2
            2 1 2 1 2 1
  */
import java.util.Scanner;
public class pattern_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int r = sc.nextInt();
        System.out.println("enter column");
        int c = sc.nextInt();
        for (int i = 1; i <=r; i++) {
            for (int j = 1; j <=c; j++) {
                if((i+j) % 2 == 0){
                    System.out.print("1");
                }
                else {
                    System.out.print("2");
                }
            }
            System.out.println();
        }
    }
}
