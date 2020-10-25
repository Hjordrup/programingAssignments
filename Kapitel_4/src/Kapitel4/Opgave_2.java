package Kapitel4;
import java.util.Scanner;
public class Opgave_2 {
    public static void main(String[] args) {
        // start scanner,
        Scanner sc = new Scanner(System.in);



        System.out.println("input the latitude and longitude of point 1 in degrees ");
        //Store the inputs as variables
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("input the latitude and longitude of point 2 in degrees ");
        //Store the inputs as variables
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();



        double result = greatCirkel(x1,y1,x2,y2);




        //Print the Result
        System.out.println("The distance between the two ponits is "  + result + " Km");





    }

    public static double greatCirkel(double x1, double y1, double x2, double y2){
        double convertetX = Math.toRadians(x1);
        double convertetY = Math.toRadians(y1);
        double convertetZ = Math.toRadians(x2);
        double convertetQ = Math.toRadians(y2);

        double d = 6371.01 * Math.acos(Math.sin(convertetX) * Math.sin(convertetZ) + Math.cos(convertetX) * Math.cos(convertetZ) * Math.cos(convertetY-convertetQ));
        return d;






    }














}
