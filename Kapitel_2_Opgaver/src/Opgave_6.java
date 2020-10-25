import java.lang.Math;
import java.util.Scanner;


public class Opgave_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

// Vi spørg efter et input.
        System.out.println("Indtast et heltal mellem 0 og 1000");
        int NytTal = input.nextInt();


// Nu opdeler vi tallet.
        int FørsteTal = NytTal % 10;

        int AndetTal =NytTal % 10;

        int TrejdeTal =NytTal % 10;

// Nu udregner vi tallet.
int resultat = (FørsteTal*AndetTal*TrejdeTal);


// Nu udskriver vi resultatet.
        System.out.println("Resultatet er " + resultat);



    }



}
