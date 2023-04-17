/* Display a number in words even with talling 0
        n = 237                                     n = 1700
   n =  2    3     7                                n =   1      7      0      0
        |    |     |                                      |      |      |      |
       two  three seven                                  one   seven   zero   zero
 */

import java.util.Scanner;
public class pattern_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");
        int n = sc.nextInt();
        int r;
        String str = "";

        while (n>0){
            r = n % 10;
            n = n /10;
            str = str + r;
        }
        System.out.println(str);

        char c;
        for (int i= str.length()-1 ; i>=0 ; i--){
            c = str.charAt(i);
            switch (c)
            {
                case '0':
                    System.out.print("Zero ");
                     break;
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("Two ");
                    break;
                case '3':
                    System.out.print("Three ");
                    break;
                case '4':
                    System.out.print("Four ");
                    break;
                case '5':
                    System.out.print("Five ");
                    break;
                case '6':
                    System.out.print("Six ");
                    break;
                case '7':
                    System.out.print("Seven ");
                    break;
                case '8':
                    System.out.print("Eight ");
                    break;
                case 'n':
                    System.out.print("Nine ");
                    break;
                default:
                    System.out.print("not a number ");
            }
        }
    }
}
