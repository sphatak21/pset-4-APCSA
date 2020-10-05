import java.util.Scanner;
public class Exercise6 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Length : ");
        double length = in.nextDouble();

        System.out.print("Width  : ");
        double width = in.nextDouble();

        double area = length * width;
        double perimeter = 2*length + 2*width;

        double widthSq = Math.pow(width, 2);
        double lengthSq = Math.pow(length, 2);

        double diagonal = Math.pow((widthSq+lengthSq), 0.5);

        System.out.printf("\nArea      : %,.2f", area);
        System.out.printf("\nPerimeter : %,.2f", perimeter);
        System.out.printf("\nDiagonal  : %,.2f", diagonal);

        in.close();
    }
}
