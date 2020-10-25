package Opgave_9_3;
import java.util.Date;
public class MainTest {

    public static void main(String[] args) {
    Date d1 = new Date();

        for (long i = 10000; i <1e11 ; i *=10) {
            d1.setTime(i);
            System.out.println(d1.toString());
        }
    }






}
