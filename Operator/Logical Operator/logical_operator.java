public class logical_operator {
    public static void main(String[] args) {
        int p = 10;
        int q = 20;

        //    &&    logical and
        System.out.println(p<q && p<=q);  // true
        System.out.println(p<q && p==q);  // false
        System.out.println(p>q && p==q);  // false

        //    ||    logical or
        System.out.println(p<q || p<=q);  // true
        System.out.println(p>q || p==q);  // false
        System.out.println(p<q || p==q);  // true

        //    !     logical not
        System.out.println(!(p==q));      // true
        System.out.println(!(p<q));       // false
    }
}
