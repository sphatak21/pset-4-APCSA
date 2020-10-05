import java.util.Scanner;
import java.lang.Math;

public class Exercise1 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Temperature : ");
        double temp = in.nextDouble();
        System.out.print("Wind speed  : ");
        double v = in.nextDouble();
        double vPow = Math.pow(v, 0.16);
        double wChill = 35.74 + 0.6215*temp + (0.4275*temp - 35.75)*vPow;
        System.out.printf("\nWind chill : %,.2f", wChill);
        in.close();
    }

}
