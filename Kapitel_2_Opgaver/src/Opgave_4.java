import java.util.Scanner;
import java.lang.Math;
public class Opgave_4 {

    // Dette program converter kvardratmeter til ping
    public static void main(String[] args) {
        //Vi starter med at scanne efter input.
       Scanner input = new Scanner(System.in);
    //Vi spørg brugeren efter antal SqureMeter
        System.out.println("Hvor mange Kvadrat Meter vil du have omregnet");
    //vi indhenter et input.
        double SqMeter = Double.parseDouble(input.nextLine());
    //Vi omregner til Ping hvor en ping svare til 0.3025

        double SqMeterToPing = (SqMeter * 0.3025);
    //Vi udskriver nu resultat
        System.out.println(SqMeter + " svare til " + SqMeterToPing + " ping");



    }








}
