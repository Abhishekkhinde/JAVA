/* calculate the maximum value out of all the  element in the array */

import java.util.*;
public class Array_18 {
    static int maximumValue(int[] arr){
        int n = arr.length;
        int max= Integer.MIN_VALUE;
        for(int i=0;i < n; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] arr= new int[size];

        System.out.println("enter"+size+"element in array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("maximum number ="+maximumValue(arr));
    }
}
