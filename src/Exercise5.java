import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Diameter : ");
        double diam = in.nextDouble();
        double rad = diam/2;
        double circum = diam * Math.PI;
        double area = Math.PI * Math.pow(rad, 2);

        System.out.printf("\nArea          : %,.2f", area);
        System.out.printf("\nCircumference : %,.2f", circum);
        in.close();
    }



}
