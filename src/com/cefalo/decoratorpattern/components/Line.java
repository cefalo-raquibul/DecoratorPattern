package com.cefalo.decoratorpattern.components;

/**
 * Created by shimul on 11/29/16.
 */
public class Line implements Shape {

    Point p1, p2;

    public Line(Point first, Point second) {
        this.p1 = first;
        this.p2 = second;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a line from: (x1,y1): (" + p1.getX() + "," + p1.getY() + "), (x2,y2): (" + p2.getX() + "," + p2.getY() + ")");
        //p1.draw();

    }

    @Override
    public boolean isValid() {
        if (p1.equals(p2))
            return false;
        return true;
    }
}
