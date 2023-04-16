/* find the sum of the following series
        s= 1-2+3-4+5........n)
*/
import java.util.Scanner;
public class sum_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        int ans = 0;

        for (int i = 1; i <= num; i++) {
             if (i % 2 == 0){
                 ans -= i;
             }else{
                 ans += i;
             }
        }
        System.out.println(ans);

    }
}
