package com.cefalo.decoratorpattern.decorators;

import com.cefalo.decoratorpattern.components.Shape;

/**
 * Created by shimul on 11/29/16.
 */
public class PaddingDecorator extends ShapeDecorator {

    int padding;

    public PaddingDecorator(Shape shape) {
        //default color black
        this(shape, 1);
    }

    public PaddingDecorator(Shape shape, int padding) {
        super(shape);
        this.setPadding(padding);
    }

    public void setPadding(int padding) {
        this.padding = padding;
    }

    @Override
    public void draw() {

        super.draw();
        System.out.println("Drawing padding of size:  " + padding + " after drawing shape");

    }

    @Override
    public boolean isValid() {
        return super.isValid();
    }
}
