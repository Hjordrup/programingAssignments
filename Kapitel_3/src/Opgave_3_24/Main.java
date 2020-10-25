package Opgave_3_24;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {





            int card = (int) (Math.random() * ((52 - 1) + 1)) + 1;
            int Num =(int) (Math.random() * ((10 - 2) + 2)) + 1;
            if (card == 1){
                System.out.println("your card is Ace of Clubs");
            } else if (card <=10) {
                System.out.println("Your card is " + card + " of Clubs");
            }else if (card == 11 ){
                System.out.println("Your card is jack of Clubs ");
            }else if (card == 12 ){
                System.out.println("Your card is Queen of Clubs ");
            }else if (card == 13 ){
                System.out.println("Your card is King of Clubs ");
            }

            else if (card == 14){
                    System.out.println("your card is Ace of Diamonds");
            }
            else if (card >14 && card<24) {
                System.out.println("Your card is " + Num + " of Diamonds");
            }else if (card == 24 ){
                System.out.println("Your card is jack of Diamonds ");
            }else if (card == 25 ){
                System.out.println("Your card is Queen of Diamonds ");
            }else if (card == 26 ){
                System.out.println("Your card is King of Diamonds ");
            }

            else if (card == 27){
                System.out.println("your card is Ace of Hearts");
            }
            else if (card >27 && card<37) {
                System.out.println("Your card is " + Num + " of Hearts");
            }else if (card == 37 ){
                System.out.println("Your card is jack of Hearts ");
            }else if (card == 38 ){
                System.out.println("Your card is Queen of Hearts ");
            }else if (card == 39 ){
                System.out.println("Your card is King of Hearts ");
            }

            else if (card == 40){
                System.out.println("your card is Ace of Spades");
            }
            else if (card >40 && card<50) {
                System.out.println("Your card is " +Num + " of Spades");
            }else if (card == 50 ){
                System.out.println("Your card is jack of Spades ");
            }else if (card == 51 ){
                System.out.println("Your card is Queen of Spades ");
            }else if (card == 52 ){
                System.out.println("Your card is King of Spades ");
            }










    }






}




