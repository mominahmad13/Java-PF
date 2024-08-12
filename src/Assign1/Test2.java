package Assign1;
public class Test2 {
    public static void main(String[] args) {
        int a = 3 ;
        int b = 5 ;
        double c = 14.1 ;
        int sum = a + b + (int)c;
//        System.out.println("a:"+a);
//        System.out.println("b:"+b);
//        System.out.println("c:"+c);
//        System.out.println("Sum:"+sum);
        c /= a;
//        System.out.println("a:"+a);
//        System.out.println("b:"+b);
//        System.out.println("c:"+c);
//        System.out.println("Sum:"+sum);
        b += (int) c - a;
//        System.out.println("a:"+a);
//        System.out.println("b:"+b);
//        System.out.println("c:"+c);
//        System.out.println("Sum:"+sum);
        a *= 2 * b + (int) c;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
        System.out.println("Sum:"+sum);


    }
}
