package Opgave_3_4;

import java.lang.Math;


public class Main {

    public static void main(String[] args) {

            // set var x to a random number between 1-12.
            int x = (int) (Math.random() * (13 - 1) + 1);

            switch (x) {
                case 1:
                    System.out.println("Your Random number corresponds to January");
                    break;
                case 2:
                    System.out.println("Your Random number corresponds to February ")
                    ;
                    break;
                case 3:
                    System.out.println("Your Random number corresponds to March")
                    ;
                    break;
                case 4:
                    System.out.println("Your Random number corresponds to April")
                    ;
                    break;
                case 5:
                    System.out.println("Your Random number corresponds to May")
                    ;
                    break;
                case 6:
                    System.out.println("Your Random number corresponds to June")
                    ;
                    break;
                case 7:
                    System.out.println("Your Random number corresponds to July")
                    ;
                    break;
                case 8:
                    System.out.println("Your Random number corresponds to August")
                    ;
                    break;
                case 9:
                    System.out.println("Your Random number corresponds to September")
                    ;
                    break;
                case 10:
                    System.out.println("Your Random number corresponds to October")
                    ;
                    break;
                case 11:
                    System.out.println("Your Random number corresponds to November")
                    ;
                    break;
                case 12:
                    System.out.println("Your Random number corresponds to December")
                    ;

            }


    }

}

