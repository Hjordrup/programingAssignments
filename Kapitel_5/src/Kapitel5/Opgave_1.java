package Kapitel5;
import java.util.Scanner;
public class Opgave_1 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

 int score = 0;


        while (score != -1 ){
            System.out.println("What is your score ? ");
            score = sc.nextInt();
            if(score >= 60){
                System.out.println("you pass the exam ");
            }else System.out.println("you don´t pass the exam ");

        }
        System.out.println("not a valid number ");


    }













}
