// print the all value between 1 and 50 except for multiple of 3
public class continue_1 {
    public static void main(String[] args) {
        int num;
        System.out.println("the all value between 1 and 50 except for multiple of 3 =");

        for (num = 1;num<=50;num++){
            if(num % 3 == 0){
                continue;
            }
            System.out.println(num);
        }
    }
}
