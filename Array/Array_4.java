import java.util.*;

public class Array_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size");
        int size = sc.nextInt();

        int arr[] = new int[size];

        // input
        System.out.println("enter element in array");
        for (int i=0; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        //output
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
