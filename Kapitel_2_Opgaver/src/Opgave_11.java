import java.util.Scanner;


public class Opgave_11 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Birth;
        int Death;
        int Immigrant;
        int startpop = 312032486;

        // Spørg om hvor mange år der skal regnes ud fra.
        System.out.println("Mængden af år ");
            int years = input.nextInt();
        //Udregn hvordan population ændre sig.
            Birth =  ((((years*365)*24)*60)*60)/7;
            Death =((((years*365)*24)*60)*60)/13;
            Immigrant =((((years*365)*24)*60)*60)/45;
        int slutpop = startpop + Birth - Death + Immigrant;



        // print resultat til consol.

        System.out.println("Der er " + slutpop + " mennesker i verden efter " + years + " år ");
















    }










}






