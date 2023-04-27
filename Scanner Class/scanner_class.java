import java.util.Scanner;

public class scanner_class {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // for integer
        System.out.println("enter integer number ");
        int num = sc.nextInt();
        System.out.println("integer number = "+num);

        //for byte
        System.out.println("enter byte number ");
        byte b = sc.nextByte();
        System.out.println("byte number = "+b);

        //for float
        System.out.println("enter float number ");
        float f = sc.nextFloat();
        System.out.println("float number = "+f);

        // for double
        System.out.println("enter double number ");
        double d = sc.nextDouble();
        System.out.println("double number = "+d);

        // for short
        System.out.println("enter short number ");
        short s = sc.nextShort();
        System.out.println("short number = "+s);

        // for string
        System.out.println("enter string ");
        String ch = sc.next();
        System.out.println("string is : = "+ch);

        // for line
        System.out.println("enter line ");
        String line = sc.nextLine();
        System.out.println("line is = "+line);

        // for boolean
        System.out.println("enter true or false ");
        boolean bool = sc.nextBoolean();
        System.out.println("answer = "+bool);

        // for character

        System.out.println("enter character ");
        char cha = sc.next().charAt(0);
        System.out.println("character = "+cha);
    }
}
