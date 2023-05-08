/*take an array input from user & sum of all element in array*/
import javax.sound.midi.Soundbank;
import java.util.*;
public class Array_6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

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

        // sum of all element in array
        int sum =0;

        for (int i = 0; i < arr.length ; i++) {
            sum = sum +arr[i];
        }
        System.out.println("sum of all element in array :"+sum);
    }
}
