package Practice;
public class Formating {
    public static void main(String[] args) {
        System.out.printf("%-8s %-8s  %-8s %-8s %-8s%n","Degrees","Radians","Sine","Cosine","Tangent");
        int degrees = 30;
        double radians = Math.toRadians(degrees);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        System.out.printf("%-8d %-8.4f  %-8.4f %-8.4f %-8.4f%n",degrees,radians,sin,cos,tan);
        degrees = 60 ;
        radians = Math.sin(radians);
        sin = Math.sin(radians);
        cos = Math.cos(radians);
        tan = Math.tan(radians);
        System.out.printf("%-8d %-8.4f  %-8.4f %-8.4f %-8.4f%n",degrees,radians,sin,cos,tan);

     

    }

    }
