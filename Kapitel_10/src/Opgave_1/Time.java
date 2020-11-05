package Opgave_1;

public class Time {

    // DataFields;
    private long hour =0;
    private long minute =0;
    private long seconds =0;

    //No-argh constructor
    public Time() {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds/1000;
        long currentSeconds = totalSeconds%60;
        long totalMinutes = totalSeconds/60;
        long currentMinutes = totalMinutes%60;
        long totalHours = totalMinutes/60;
        long currentHours = totalHours%24;


        this.hour = currentHours;
        this.minute =  currentMinutes;
        this.seconds =  currentSeconds;

    }

    // constructor with specified hour, minute, second;

    public Time(long hours, long minutes, long seconds){
        this.hour = hours;
        this.minute = minutes;
        this.seconds = seconds;
    }

    public Time(long timeElapsedSince1970){

        setTime(timeElapsedSince1970);

    }



    // Getters
    public long getHour() {
        return hour;
    }

    public long getMinute(){
        return minute;
    }

    public long getSeconds(){
        return seconds;
    }



    // Setters
    public void setHour(long hour) {
        this.hour = hour;
    }

    public void setMinute(long minute){
        this.minute = minute;
    }

    public void setSeconds(long seconds){
        this.seconds = seconds;
    }


    // Methods;

    public void setTime(long elapsedTime){


        long totalSeconds = elapsedTime/1000;
        long currentSeconds = totalSeconds%60;
        long totalMinutes = totalSeconds/60;
        long currentMinutes = totalMinutes%60;
        long totalHours = totalMinutes/60;
        long currentHours = totalHours%24;

        this.hour = currentHours;
        this.minute = currentMinutes;
        this.seconds = currentSeconds;

    }










}
