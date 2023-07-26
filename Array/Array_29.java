/* Given an array 'a' consisting of integers return the first value that is
repeating in this array if no value is being repeated return -1
 */
import java.util.*;
public class Array_29 {
    static int firstreturnnum(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + "Element in Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(firstreturnnum(arr));
    }
}
