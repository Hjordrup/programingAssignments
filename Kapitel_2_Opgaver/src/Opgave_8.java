import java.util.Scanner;


public class Opgave_8 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Indtast tidszone forskel");
        int timeZoneOffset = input.nextInt();
long totalMilliseconds = System.currentTimeMillis();
long totalSeconds = totalMilliseconds / 1000;
long currentSeconds = totalSeconds % 60;
long totalMinutes = totalSeconds / 60;
long currentMinutes = totalMinutes % 60;
long totalHours = totalMinutes / 60;
long currentHour = (totalHours % 24)+timeZoneOffset;

        System.out.println("current time is " + currentHour + ":" + currentMinutes + ":" + currentSeconds + " GMT");











    }






}
