package Assign2;
public class Task5d {
    public static void main(String[] args) {
                for(int i=6; i>=1; i--)
        {
            for(int j=1; j<=6-i; j++)
                System.out.print(" " + " ");
            for(int j=1; j<=i; j++)
                System.out.print(j + " ");
            System.out.println();
        }

    }
}
