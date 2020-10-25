import java.lang.Math;
import java.util.Scanner;

public class Opgave_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //Vi spørg om et subtotal og en gratuityRate.

        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        // vi udregner et total samt en mængde drikke penge

        double drikkepenge = subtotal * (gratuityRate/100);
        double total = drikkepenge + subtotal;


        // vi udskriver et resultat.
        System.out.println("Mængden af drikke penge er  $" + drikkepenge +
                " og i det hele bliver det  $" + total);





    }






}
