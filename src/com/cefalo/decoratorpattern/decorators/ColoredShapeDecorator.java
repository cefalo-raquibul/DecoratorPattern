package com.cefalo.decoratorpattern.decorators;

import com.cefalo.decoratorpattern.components.Shape;

/**
 * Created by shimul on 11/29/16.
 */
public class ColoredShapeDecorator extends ShapeDecorator {

    String color;

    public ColoredShapeDecorator(Shape shape) {
        //default color black
        this(shape, "BLACK");
    }

    public ColoredShapeDecorator(Shape shape, String color) {
        super(shape);
        this.setColor(color);
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Setting graphics color to " + color + " before drawing shape");
        super.draw();

    }

    @Override
    public boolean isValid() {
        return super.isValid();
    }
}
