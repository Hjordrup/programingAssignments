import java.util.Scanner;
import java.lang.Math;


public class Opgave_3 {
    public static void main(String[] args) {
        //make program that converts meters in to feet.
        // Scan efter input
        Scanner input = new Scanner (System.in);
        //spørg om et antal meter
        System.out.println("Hvor mange meter skal omregnes");

        double MeterToFeet = input.nextDouble();

        // udregn antal meter til feet
        double FeetAmount = (3.2786*MeterToFeet);

        // udskriv antal feet

        System.out.println(MeterToFeet +" svare til " + FeetAmount + " Feet" );









    }







}
