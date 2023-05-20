/*  count the number of occurrence of a particular element X
 */
import java.util.*;
public class Array_14{
    static int count_occurrence(int[] arr1 , int x){
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == x) {
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size = sc.nextInt();

        int[] arr1 = new int[size];

        System.out.println("enter element in array");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        // output
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }
        System.out.println();

        System.out.println("enter x");
        int x = sc.nextInt();
        System.out.println("count of x: "+count_occurrence(arr1, x));
    }
}
