import java.util.Scanner;
public class Opgave_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);


        // vi indhenter antal min.
        System.out.println("Indtast antal min du vil have converteret til år");

        //Vi logger det som et variabel
        int min = input.nextInt();


        // Vi omregner til år og dage.
        int years = min / 525600;
        int days = (min % 525600) / 1440;


        //Vi udskriver resultat.


        System.out.println(min + " minuter svare til ca. " + years + " År og " + days +" Dage");



    }




}
