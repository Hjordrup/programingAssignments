package Opgave_3_14;
import java.lang.Math;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // prompt user to enter guess.
        System.out.println("Enter 0 or 1 depending on whether you think the coin is gonna turn out " +
                "heads or tail respectively ");

        //Start Scanner
        Scanner sc = new Scanner(System.in);

        //Store input as Variable

        int guess = sc.nextInt();


        int coinToss = (int) (Math.random() * ((1 - 0) + 1)) + 0;

        if (coinToss == guess) {
            System.out.println("you guessed " + guess);
            System.out.println("The number was " + coinToss);
            System.out.println("You guess correct");

        } else {
            System.out.println("You guess wrong");
            System.out.println("you guessed " + guess);
            System.out.println("The number was " + coinToss);

        }


    }
}