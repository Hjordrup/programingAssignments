package Opgave_9_5;
import java.lang.*;
import java.util.GregorianCalendar;

public class MainTest {


    public static void main(String[] args) {

        GregorianCalendar g1 = new GregorianCalendar();

        System.out.println("Today the year is " + g1.get(GregorianCalendar. YEAR));
        System.out.println("The month is " + g1.get(GregorianCalendar. MONTH));
        System.out.println("The day is " + g1.get(GregorianCalendar. DAY_OF_MONTH));


        g1.setTimeInMillis(1234567898765L);
        System.out.println("new year is " + g1.get(GregorianCalendar. YEAR));
        System.out.println("new month is " + g1.get(GregorianCalendar. MONTH));
        System.out.println("new day is " + g1.get(GregorianCalendar. DAY_OF_MONTH));







    }



}


