import java.util.Scanner;

public class Exercise9 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("First Name  : ");
        String firstName = in.nextLine();
        String firstinit = firstName.substring(0,1).toUpperCase();

        System.out.print("Middle Name : ");
        String middleName = in.nextLine();
        String middleinit = middleName.substring(0,1).toUpperCase();

        System.out.print("Last Name   : ");
        String lastName = in.nextLine();
        String lastinit = lastName.substring(0,1).toUpperCase();


        System.out.printf("\n" + firstinit + middleinit + lastinit + ".");
        in.close();

    }
}
