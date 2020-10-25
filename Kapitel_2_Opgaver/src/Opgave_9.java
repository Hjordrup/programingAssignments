import java.util.Scanner;
import java.lang.Math;


public class Opgave_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);




        // vi indhenter værdier fra bruger.
        System.out.println("indtast start værdien i m/s, slut værdien i m/s og tiden i sekunder");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double sek = input.nextDouble();

        // vi laver udregningen.

        double resultat = ((v1-v0)/sek);



        // vi udskriver resultat.
        System.out.println("Den gennemsnitlige scceleration er " + resultat);



    }


}


