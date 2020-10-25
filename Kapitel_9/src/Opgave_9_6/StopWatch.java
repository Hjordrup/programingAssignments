package Opgave_9_6;

public class StopWatch {
    //Data fields
    private long startTime;
    private long endTime;

    // Getters for startTme and endTime so we can access them

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }


    // constructer that sets the startTime field to current time.
    public StopWatch() {
        startTime = System.currentTimeMillis();

    }

    //Methods
    void start(){
        startTime = System.currentTimeMillis();
    }

    void stop(){
        endTime = System.currentTimeMillis();
    }


    long getElapsedTime(){
        return getEndTime() - getStartTime();
    }






}
