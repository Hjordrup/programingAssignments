package Kapitel4;
import java.util.Scanner;
import java.lang.Math;



public class Opgave_5 {

    public static void main(String[] args) {
        //print the directions
        System.out.println("input the number of side and there lenght in a polygon ");
        //start Scanner objekt.
        Scanner sc = new Scanner(System.in);

        //store the input as variable
        int nSide = sc.nextInt();
        double lSide = sc.nextDouble();





        //print the area.
        System.out.println("the area of the polygon is " + area(nSide,lSide));





    }

static double area (int nSide, double lSide){

        double aTop = (double)nSide * Math.pow(lSide,2);
        double abot = 4*Math.tan(Math.PI/(double) nSide);
        double result = aTop/abot;
        return result;




}



}
