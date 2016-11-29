package com.cefalo.decoratorpattern.components;

/**
 * Created by shimul on 11/29/16.
 */
public class Rectangle implements Shape {

    Point p1, p2, p3, p4;

    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    @Override
    public void draw() {
        p1.draw();
        p2.draw();
        p3.draw();
        p4.draw();
        System.out.println("connect p1,p2,p3,p4");
    }

    @Override
    public boolean isValid() {

        return
                IsOrthogonal(p1, p2, p3) &&
                        IsOrthogonal(p2, p3, p4) &&
                        IsOrthogonal(p3, p4, p1);


    }

    // tests if angle abc is a right angle
    private boolean IsOrthogonal(Point a, Point b, Point c) {
        return (b.getX() - a.getX()) * (b.getX() - c.getX()) + (b.getY() - a.getY()) * (b.getY() - c.getY()) == 0;
    }

}
