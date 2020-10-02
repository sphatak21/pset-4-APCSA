import java.util.Scanner;

public class Exercise2 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Inches : ");
        int inches = in.nextInt();

        int miles = inches/(5280*12);
        inches = inches % (5280*12);

        int feet = inches / 12;
        inches = inches % 12;

        System.out.println("\nMiles  : " + miles);
        System.out.println("Feet   : " + feet);
        System.out.println("Inches : " + inches);
        in.close();
    }
}
