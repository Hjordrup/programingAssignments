package Opgave_4;
import java.lang.Math;
public class MyPoint {


    // Date Fields
    private double x;
    private double y;

    // Constructor

    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }


    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    //Methods

    /*
    A method named distance that returns the distance from this point to a
    specified point of the MyPoint type.
    */
    public double distance(MyPoint SecondPoint){
        double xDif = (SecondPoint.getX() - this.x);
        double yDif = ( SecondPoint.getY() - this.y);

        double xPow = Math.pow(xDif,2);
        double yPow = Math.pow(yDif,2);

        double xPlusYPow = xPow+yPow;

        return Math.sqrt(xPlusYPow);
    }

    /*
    A method named distance that returns the distance from this point to
    another point with specified x- and y-coordinates.
    */
    public double distance(double x, double y){

        return distance(new MyPoint(x,y));
    }


    /*
    A static method named distance that returns the distance from two MyPoint
    objects.
     */

    public static double distance(MyPoint mypoint1, MyPoint myPoint2 ){
        double xDif = (mypoint1.getX() - myPoint2.x);
        double yDif = (mypoint1.getY() - myPoint2.y);
        double xPow = Math.pow(xDif,2);
        double yPow = Math.pow(yDif,2);
        double xPlusYPow = xPow+yPow;
        return Math.sqrt(xPlusYPow);
    }

    // Getter and setter;
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
