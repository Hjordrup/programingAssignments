package Opgave_9_1;

public class Rectangle {

    double width = 0;
    double height = 0;


    public Rectangle() {
    }


    public Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }


    public double getArea(){
        return height*width;


    }


    public double getPerimeter(){

        return (height*2)+(width*2);

    }






}

