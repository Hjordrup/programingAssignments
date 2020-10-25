package Opgave_9_8;

public class Main {
    public static void main(String[] args) {
// create 2 fan objects.
Fan f1 = new Fan();
Fan f2 = new Fan();

f1.setRadius(10);
f1.setColor("yellow");
f1.setSpeed(3);
f1.setOn(true);

f2.setOn(false);
f2.setSpeed(2);
f2.setRadius(5);
f2.setColor("blue");


        System.out.println(f1.toString());
        System.out.println(f2.toString());




    }
}
