/* calculate the maximum value out of all the elements in array
*/

import java.util.*;
public class Array_8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size = sc.nextInt();

        int[] arr1 = new int[size];

        System.out.println("enter array element ");
        for (int i = 0 ; i < arr1.length ;i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("print array element");
        for (int i = 0 ; i < arr1.length ; i++){
            System.out.println(arr1[i]);
        }

        int ans = 0;

        for (int i=0 ; i < arr1.length ; i++) {
            if (arr1[i] > ans) {
                ans = arr1[i];
            }
        }
        System.out.println("the maximum value = "+ans);
    }
}
