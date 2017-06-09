import java.lang.Math;
import java.util.Random;

public class diceSimulator {
    public static void main(String[] args) {
        Random rand = new Random();
        int d1 = rand.nextInt(6) + 1;
        int d2 = rand.nextInt(6) + 1;

        int sum = d1 + d2;

        System.out.println(" d1 = " + d1);
        System.out.println(" d2 = " + d2);
        System.out.println(" Sum = " + sum);
    }
}