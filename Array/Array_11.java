// copy array element
import java.util.*;
public class Array_11 {
    public static void main(String[] args) {

        int[] arr1 = new int[5];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 5;

        System.out.println("array 1");

        for (int x : arr1){
            System.out.println(x);
        }
        System.out.println("array 2");
        int[] arr2 = new int[5];

        arr2 = Arrays.copyOf(arr1,arr1.length);

        for(int x : arr2){
            System.out.println(x);
        }

    }
}
