package Kapitel4;
import java.util.Scanner;
import java.lang.Math;

public class Opgave_4 {

    public static void main(String[] args) {

        System.out.println("Input the length of a side in a haxagon and i will display the area ");
        Scanner sc = new Scanner(System.in);

        double s = sc.nextDouble();

        double calc = area(s);

        //converts calc to string and set a dismal limit.
        String result = String.format("%.2f", calc);

        System.out.print("The Area of a hexagon with the side length of " + s + " is " + result);





    }

    public static double area(double s ){
        double top =6*Math.pow(s,2);
        double bottom = 4*Math.tan(Math.PI/6);
        double area =top/bottom;
        return area;


    }



}
