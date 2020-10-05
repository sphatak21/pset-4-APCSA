import java.util.Scanner;
public class Exercise3 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Length     : ");
        double length = in.nextDouble();

        System.out.print("Width      : ");
        double width = in.nextDouble();

        System.out.print("Diamaeter  : ");
        double rad = in.nextDouble() / 2;

        double area = (length * width) - Math.PI*(Math.pow(rad, 2));
        System.out.printf("\nSurface area : %,.2f", area);
        in.close();
        }
}
