package Kapitel5;
import java.lang.Math;
public class Opgave_7 {

    public static void main(String[] args) {
        System.out.println("This program computes the tuition for school in ten years && the total cost of four years worth of tuition after the ten years, ");
        System.out.println("***********************************************************************************************************************************");

        double tuitionStart = 10000;
        double rate = 0.06;

        System.out.printf("Year" +"%10s" + "tuition Amount this year ", " ");
        System.out.println(" ");
        for (int years = 1; years <= 10; years++) {
            double tuitionAmount = tuitionStart*Math.pow(1+rate,years);

            System.out.printf("%2d" + "%12s" + tuitionAmount, years, " ");
            System.out.println(" ");

        }

        double totalCost1 = tuitionStart*Math.pow(1+rate,11);
        double totalCost2 = tuitionStart*Math.pow(1+rate,12);
        double totalCost3 = tuitionStart*Math.pow(1+rate,13);
        double totalCost4 = tuitionStart*Math.pow(1+rate,14);
        double totalCost = totalCost1+totalCost2+totalCost3+totalCost4;
        System.out.println("The total cost of 4 years tuition after ten years is " + totalCost );












    }







}
