package Opgave_9_2;

public class MainTest {

    public static void main(String[] args) {
        Stock s1 = new Stock("ORCL", "Oracle");

        s1.currentPrice = 34.35;
        s1.previousClosingPrice = 34.5;

        System.out.println("This is the name " + s1.name);
        System.out.println("This is the symbol " + s1.symbol);
        System.out.println("This is the current price " + s1.currentPrice);
        System.out.println("This is the old price " + s1.previousClosingPrice);
        System.out.println("this is the change in percent " + s1.getChangePercent(s1.currentPrice, s1.previousClosingPrice));





    }







}
