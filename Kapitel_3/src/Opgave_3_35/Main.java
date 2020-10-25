package Opgave_3_35;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Prompt user to input a number.
        System.out.println("Input a integer ");
        //Store the number on a variable called number
        int number = sc.nextInt();


        if (number % 2 == 0) {
            System.out.println(number + " is a even number ");


        } else System.out.println(number + " is a odd number ");


    }
}