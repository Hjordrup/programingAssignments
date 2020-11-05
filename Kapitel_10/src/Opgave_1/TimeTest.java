package Opgave_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void getHour() {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds/1000;
        long currentSeconds = totalSeconds%60;
        long totalMinutes = totalSeconds/60;
        long currentMinutes = totalMinutes%60;
        long totalHours = totalMinutes/60;
        long currentHours = totalHours%24;
        Time test1 = new Time();

        assertEquals(currentHours, test1.getHour());


    }

    @Test
    void getMinute() {

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds/1000;
        long currentSeconds = totalSeconds%60;
        long totalMinutes = totalSeconds/60;
        long currentMinutes = totalMinutes%60;
        long totalHours = totalMinutes/60;
        long currentHours = totalHours%24;
        Time test2 = new Time();

        assertEquals(currentMinutes, test2.getMinute());

    }

    @Test
    void getSeconds() {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds/1000;
        long currentSeconds = totalSeconds%60;
        long totalMinutes = totalSeconds/60;
        long currentMinutes = totalMinutes%60;
        long totalHours = totalMinutes/60;
        long currentHours = totalHours%24;
        Time test3 = new Time();

        assertEquals(currentSeconds, test3.getSeconds());

    }

    @Test
    void setTime() {

        Time test4 = new Time();
        test4.setTime(555550000);
        assertEquals(10,test4.getHour());
        assertEquals(19,test4.getMinute());
        assertEquals(10,test4.getSeconds());
    }
}