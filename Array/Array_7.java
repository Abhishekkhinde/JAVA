/* take a input from user and print the count of even number*/
import java.util.Scanner;

public class Array_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("enter element in array");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

        //for count of even number

        int count =0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] % 2 == 0){
                count++;
            }
        }
        System.out.println("count of even number in array :"+count);
    }
}
