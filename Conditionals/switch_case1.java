

import java.util.Scanner;
public class switch_case1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter input");
        int a= sc.nextInt();

        switch (a){
            case 1:

                System.out.println("one");
                break;

            case 2:
                System.out.println("two");
                break;

            case 3:
                System.out.println("three");
                break;

            case 4:
                System.out.println("four");
                break;

            default :
                System.out.println("Wrong input");
        }
    }
}
