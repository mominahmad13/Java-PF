package Lab04;
public class Task1 {
    public static void main(String[] args) {
        int x,y,z ;
        x = 10;
        y = 15;
        z = 20;
        boolean exp1  = !(x>10);
        boolean exp2  = ( x<=5 || y < 15);
        boolean exp3 = ( x != 5) && (y != x);
        boolean exp4 = ( x >= z ) || (x + y >= z);
        boolean exp5 = (x <= y -2 ) && (y>=z) || (z -2 != 20);
        System.out.println("Expression 1 is: "+exp1);
        System.out.println("Expression 2 is: "+exp2);
        System.out.println("Expression 3 is: "+exp3);
        System.out.println("Expression 4 is: "+exp4);
        System.out.println("Expression 5 is: "+exp5);

    }
}
