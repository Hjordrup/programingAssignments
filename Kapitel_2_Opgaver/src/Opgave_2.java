import java.util.Scanner;
import java.lang.Math;

public class Opgave_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);



      // spørg om længde på trekantside
        System.out.println("Indtast længden på siden af en ligebenet trekant");
     double Sidelængde =Double.parseDouble(input.nextLine());

     // udregn A og V

        double Areal = ((Math.sqrt(3)/4) * Math.pow(Sidelængde,2));
        double volume = Areal * Sidelængde;



    // udskriv A og V
        System.out.println("Areal = " + Areal);
        System.out.println("volume = " + volume);



    }








}
