package Opgave_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {

    @Test
    void distance() {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint();
        assertEquals(0,p1.distance(p2));


    }

    @Test
    void testDistance() {
        MyPoint p1 = new MyPoint();

        assertEquals(0,p1.distance(0,0));

    }

    @Test
    void getX() {
        MyPoint p1 = new MyPoint(1,1);
        assertEquals(1,p1.getX());

    }

    @Test
    void setX() {
        MyPoint p2 = new MyPoint();
        p2.setX(1);
        assertEquals(1,p2.getX());

    }

    @Test
    void getY() {
        MyPoint p1 = new MyPoint(1,1);
        assertEquals(1,p1.getY());

    }

    @Test
    void setY() {
        MyPoint p2 = new MyPoint();
        p2.setY(2);
        assertEquals(2,p2.getY());
    }
}