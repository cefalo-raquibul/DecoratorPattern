package com.cefalo.decoratorpattern.decorators;

import com.cefalo.decoratorpattern.components.Shape;

/**
 * Created by shimul on 11/29/16.
 */
public abstract class ShapeDecorator implements Shape {
    Shape decoratableShape;

    public ShapeDecorator(Shape shape) {
        this.decoratableShape = shape;
    }

    public void draw() {
        System.out.println("Starting drawing " + decoratableShape.getClass().getSimpleName());
        decoratableShape.draw();
    }

    public boolean isValid() {
        System.out.println("Validating  " + decoratableShape.getClass().getSimpleName());
        return decoratableShape.isValid();
    }

}
