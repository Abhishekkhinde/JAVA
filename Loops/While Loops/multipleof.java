//print the first multiple of 5 and which is also a 7
public class multipleof {
    public static void main(String[] args) {

        int num = 1;
        while (true){
            if (num % 5 == 0 && num % 7 == 0){
                System.out.println(num);
                break;
            }
            num++;
        }
    }
}
