import java.util.Scanner;

public class Exercise7 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Side : ");
        double side = in.nextDouble();
        double sidesq = Math.pow(side, 2);
        double halfSideSq = Math.pow(side/2, 2);
        double apath = Math.pow(sidesq - halfSideSq, .5);
        double area = (6 * side * apath) / 2;
        double perimeter = 6 * side;

        System.out.printf("\nArea      : %,.2f", area);
        System.out.printf("\nPerimeter : %,.2f", perimeter);

        in.close();

    }
}
