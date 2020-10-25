import java.util.Scanner;
import java.lang.Math;
public class Opgave_16 {


    public static void main(String[] args) {
        System.out.println("Indput a side og the hexagone you wan´t the area off ");

        Scanner sc = new Scanner(System.in);

        double s = sc.nextDouble();
        double area = area(s);

        System.out.println("The area of a hexagone with a side lenght of " +s+ " is " + area );












    }




    public static double area(double side ) {

        double top = 3*Math.sqrt(3);
        double bottom = 2;
        double end = Math.pow(side,2);
        double result = (top/bottom)*end;
        return result;

    }




}
