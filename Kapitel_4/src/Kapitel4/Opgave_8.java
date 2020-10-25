package Kapitel4;
import java.util.Scanner;

public class Opgave_8 {

    public static void main(String[] args) {

//print a promt to input a char
        System.out.println("input chareater ");
Scanner sc = new Scanner(System.in);
char letter =sc.next().charAt(0);

int convertToASCII = (int)letter;





        System.out.println("the ASCII code for the character " + letter + " is " + convertToASCII);



    }




}
