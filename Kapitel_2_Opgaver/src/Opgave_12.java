import java.util.Scanner;
import java.lang.Math;
public class Opgave_12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Takeoff speed = v og axxeleration = a

        // Bruger skal inputte v i m/s og a in m/S.

        System.out.println("Hvor hurtigt har flyvet takeoff i M/s? ");

        double v = Double.parseDouble(input.nextLine());

        System.out.println("Hvor hurtigt accelerare flyvet i m/s^2 ? ");

        double a = Double.parseDouble(input.nextLine());


        // udregning


        double lenght = Math.pow(v,2)/(2*a);

        System.out.println("laningsbanen skal minimum være " + lenght );




    }






}
