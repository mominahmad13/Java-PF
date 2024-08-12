package Assign1;
public class Test1 {
    public static void main(String[] arg){
        int a = 5 ;
        int b = 6;
        int d = 2 ;
        a = (b++) + 3 * ++d;
//        System.out.println("a:"+a);
//        System.out.println("b:"+b);
//        System.out.println("d:"+d);
        int  c = 2 * d + (++b) + a;
//        System.out.println("c:"+c);
//        System.out.println("a:" + a);
//        System.out.println("b:" + b);
//        System.out.println("d:" + d);
        b = 2 * (++c) - (a++);
//        System.out.println("a:"+a);
//        System.out.println("b:"+b);
//        System.out.println("d:"+d);
//        System.out.println("c:"+c);
        d = d++ + d + b++ + b ;
        System.out.println("d:"+d);
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("d:"+d);
        System.out.println("c:"+c);







    }
}
