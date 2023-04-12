// write a java program to swap  two numbers with the help of third variable
// sample input : 2,3
public class swap {
    public static void main(String args[]){

        int num_1 = 2;
        int num_2 = 3;

        System.out.println("first number before swap :"+num_1);
        System.out.println("second number before swap :"+num_2);

        int temp;

        temp = num_1;
        num_1 = num_2;
        num_2 = temp;

        System.out.println("first number after swap :"+num_1);
        System.out.println("first number after swap :"+num_2);


    }
}
