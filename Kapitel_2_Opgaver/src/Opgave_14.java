import java.util.Scanner;
import java.lang.Math;


public class Opgave_14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input weight and height.

        System.out.println("Hvad er din vægt i pounds ? ");

        double Weight = Double.parseDouble(input.nextLine());


        System.out.println("Hvad er din hæjde i inches ? ");

        double Height = Double.parseDouble(input.nextLine());


        // Make calculation.

        double heightInMeter =Height*0.0254 ;
        double weightInKg =Weight*0.45359237;

        double BMI = weightInKg/(Math.pow(heightInMeter,2));


        // Output BMI

        System.out.println("Dit BMI er " + BMI );


















    }








}



