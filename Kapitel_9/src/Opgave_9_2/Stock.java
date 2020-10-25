package Opgave_9_2;

public class Stock {

    public String symbol;
    public String name;
    public double currentPrice;
    public double previousClosingPrice;


    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }


    public double getChangePercent(double currentPrice, double previousClosingPrice) {
        return ((currentPrice-previousClosingPrice)/previousClosingPrice) * 100;



    }






}
