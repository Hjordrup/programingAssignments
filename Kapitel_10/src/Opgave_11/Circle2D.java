package Opgave_11;

public class Circle2D {

    private double x;
    private double y;
    private double radius;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }


    public Circle2D() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;

    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;

    }


    public double getArea() {

        return (this.radius * this.radius) * Math.PI;
    }

    public double getPerimeter() {

        return (Math.PI * 2) * this.radius;

    }

    public boolean contains(double x, double y) {
        double first = Math.pow(x - this.getX(), 2);
        double second = Math.pow(y - this.getY(), 2);
        double both = first + second;
        double sqrtResult = Math.sqrt(both);
        if (sqrtResult < this.getRadius()) {
            return true;
        }
        return false;
    }

    public boolean contains(Circle2D circle){
        double first = Math.pow(circle.getX() - this.getX(), 2);
        double second = Math.pow(circle.getY() - this.getY(), 2);
        double both = first + second;
        double d = Math.sqrt(both);

        double c1 = this.getRadius();
        double c2 = circle.getRadius();

        if(c1 > (d+c2)){

            return true;
        }else return false;


    }




    public boolean overlaps(Circle2D circle){

        double firstCheck = Math.pow(this.getX()- circle.getX(),2);
        double secondCheck = Math.pow(this.getY()- circle.getY(),2);
        double combined = firstCheck + secondCheck;
        double checkRadius = Math.pow(this.getRadius() + circle.getRadius(),2);
        if (checkRadius>combined){
            return true;
        }
        return false;
    }


















}
