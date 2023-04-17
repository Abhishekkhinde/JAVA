// Write a program to print the cross pattern given below (in the shape of X):
import java.util.Scanner;
public class cross_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int size = sc.nextInt();
        for (int i = 0 ; i < size ; i++){
            for (int j = 0 ; j < size ; j++){
                if (i == j || i+j == size-1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
