import java.util.Scanner;


public class Opgave_10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Spørg om mængden af Vand i Kilo Samt start og slut temp

        System.out.println("Hvor mange lilter vand i kilo har du ");
        double vandKilo = input.nextDouble();

        System.out.println("Hvad er start temperaturen på vandet");
        double startTemp = input.nextDouble();

        System.out.println("Hvad er slut temeraturen ");
        double slutTemp = input.nextDouble();

// Nu skal vi udregne mængden af energy vi skal bruge.

double energy = vandKilo * (slutTemp - startTemp) * 4184;


// Nu skal vi udskrive resultatet.


        System.out.println("Mængden af Energy i jouls der skal bruges er " + energy);





    }






}
