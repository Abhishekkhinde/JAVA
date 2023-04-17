// count the number of digits for a given number
import java.util.Scanner;
public class count_number_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int numofdigits = 0;

        while (n > 0){
            n = n / 10;
            numofdigits++;
        }
        System.out.println("count of the number of digits : "+numofdigits);
    }
}
