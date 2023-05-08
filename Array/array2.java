import java.util.*;
public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array ");
        int size = sc.nextInt();

        int arr1[] = new int[size];

        // for all index
        System.out.println("enter array element");
        for (int i =0; i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        for (int i =0; i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
