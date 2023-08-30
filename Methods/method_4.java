// print max element from array
public class method_4 {
    static  int max(int[] arr){
        int max= arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {10,15,8,24,7};
        System.out.println(max(arr));
    }
}
