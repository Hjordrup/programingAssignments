package Kapitel4;

import java.util.Scanner;

public class Opgave_9 {

    public static void main(String[] args) {

//print a promt to input a char
                System.out.println("input chareater ");
                Scanner sc = new Scanner(System.in);
                char letter =sc.next().charAt(0);

                String convertToUnicode = String.format("%04x ", (int) letter);
        System.out.println("the unicode for the Character " + letter + " is " + convertToUnicode);


    }








}
