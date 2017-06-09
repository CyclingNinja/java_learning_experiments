import java.lang.Math;

public class Distance {
    public static void main(String[] args) {
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);

        double r=Math.sqrt(x*x+y*y);

        System.out.println("distance from (0,0) to ("+x+", "+y+") = "+r);
        }
    }