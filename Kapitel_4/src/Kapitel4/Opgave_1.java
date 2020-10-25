package Kapitel4;
import java.util.Scanner;
import java.lang.Math;

public class Opgave_1 {

    public static void main(String[] args) {
        System.out.println("Input the length from the center to the vortex of the pentagram you want the area of  ");

        // start new Scanner Class.
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();


        System.out.println("The Area of the pentagram is " + (area(sidelenght(r))));


    }

public static double sidelenght(double r ){

        double input = 2*r;
        double sin = Math.sin(Math.PI/5);
        double calc = input*sin;
        return calc;

}

public static double area ( double sidelenght){
        double bottom = 4*Math.tan(Math.PI/5);
        double top = 5*Math.pow(sidelenght,2);
        double done = top/bottom;
        return done;





}


}
