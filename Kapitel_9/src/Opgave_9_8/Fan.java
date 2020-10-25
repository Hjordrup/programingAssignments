package Opgave_9_8;

public class Fan {

    //constance all letters are big:
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int Fast = 3;

    //variable alle letters are small:
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    //Getters and Setters have the same name with a get or set in front exception is boolean where is instead og get is used:


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // constructors
    public Fan() {
    }


    //Methods.

    public String toString(){
        if (isOn() ){

return "Fan speed is " +getSpeed() + " color is " + getColor() + " radius is " + getRadius();

        }else {
return "\nFan color is " + getColor() + "radius is  " + getRadius() + "\nThe fan is off \n";








        }

    }




}
