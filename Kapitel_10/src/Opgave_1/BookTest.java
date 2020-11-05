package Opgave_1;

public class BookTest {


    public static void main(String[] args) {

        Time t1 = new Time();
        System.out.println("The Time is " + t1.getHour() + ":" + t1.getMinute() + ":" + t1.getSeconds());


        Time t2  = new Time(555550000);
        System.out.println("The Time is " + t2.getHour() + ":" + t2.getMinute() + ":" + t2.getSeconds());

        Time t3  = new Time(5,23,55);
        System.out.println("The Time is " + t3.getHour() + ":" + t3.getMinute() + ":" + t3.getSeconds());
    }

}
