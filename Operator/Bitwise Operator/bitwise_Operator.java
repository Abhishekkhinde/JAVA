import java.util.Scanner;

public class bitwise_Operator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a");
        int p = sc.nextInt();
        System.out.println("enter b");
        int q = sc.nextInt();

        //  &  Bitwise and
        System.out.println(p<q & p<=q); //  true & true  = true
        System.out.println(p<q & p==q); //  true & false = false
        System.out.println(p==q & p<q); //  false & true = false
        System.out.println(p>q & p==q); //  false & false = false


        //  !  or
        System.out.println(p<q | p<=q);  //  true | true  = true
        System.out.println(p<q | p==q);  //  true | false = true
        System.out.println(p==q | p<q);  //  false | true = true
        System.out.println(p>q | p==q);  //  false | false = false

        //  ~  xor
        System.out.println(p<q ^ p<=q);  // true ^ true = false
        System.out.println(p<q ^ p==q);  //  true | false = true
        System.out.println(p==q ^ p<q);  //  false | true = true
        System.out.println(p>q ^ p==q);  //  false | false = false

        //  >>  Shift

        int value = 0b1010;
        int x,y,z;

        //  >> right shift
        x= value >> 1;
        System.out.println(String.format("%s",Integer.toBinaryString(value)));
        System.out.println(String.format("%s",Integer.toBinaryString(x)));

        // unsign right shift
        y = value >>> 1;
        System.out.println(String.format("%s",Integer.toBinaryString(value)));
        System.out.println(String.format("%s",Integer.toBinaryString(y)));

        // left shift
        z = value << 1;
        System.out.println(String.format("%s",Integer.toBinaryString(value)));
        System.out.println(String.format("%s",Integer.toBinaryString(z)));
    }
}
