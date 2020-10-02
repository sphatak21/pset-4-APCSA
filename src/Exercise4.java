import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Centimeters : ");
        int cent = in.nextInt();

        int km = cent/100000;
        cent = cent % 100000;

        int m = cent / 100;
        cent = cent % 100;

        System.out.println("\nKilometers  : " + km);
        System.out.println("Meters      : " + m);
        System.out.println("Centimeters : " + cent);
        in.close();
    }
}
