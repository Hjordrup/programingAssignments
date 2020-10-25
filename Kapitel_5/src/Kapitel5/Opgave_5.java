package Kapitel5;

public class Opgave_5 {


    public static void main(String[] args) {

        System.out.printf("Celsius " + "%20s" + " Fahrenheit " + "%8s" +  "|" +"%8s" + "Fahrenheit "+"%20s"+  "Celsius ", " ", " ", " "," ");
        System.out.println();
        for (int cel = 0; cel <= 100; cel++) {
            double celToFa = (double) cel*9/5+32;
            double fa = cel+20;
            double faToCel = (fa-32)/1.8000;


            System.out.printf(cel + "%30s" + celToFa +"%25s" + fa + "%30s" + faToCel, " ", " ", " ");
            System.out.println(" ");



















        }








    }



}
