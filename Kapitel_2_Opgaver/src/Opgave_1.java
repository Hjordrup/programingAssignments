import java.util.Scanner;

public class Opgave_1 {
    public static void main(String[] args) {
Scanner input = new Scanner (System.in);

// Her spørg vi om en mængde miles.
        System.out.println("skriv mængde af Miles: ");


        double number1 = input.nextDouble();
// Her omregner vi fra miles til Km.

        double MilesToKm = (number1*1.6);
//Nu udskriver vi mængden af Km
        System.out.println("Antal af kilometer er " + MilesToKm);

    }







}

