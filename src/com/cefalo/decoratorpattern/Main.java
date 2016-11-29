package com.cefalo.decoratorpattern;

import com.cefalo.decoratorpattern.components.Line;
import com.cefalo.decoratorpattern.components.Point;
import com.cefalo.decoratorpattern.components.Rectangle;
import com.cefalo.decoratorpattern.components.Shape;
import com.cefalo.decoratorpattern.decorators.ColoredShapeDecorator;
import com.cefalo.decoratorpattern.decorators.PaddingDecorator;
import com.cefalo.decoratorpattern.decorators.ShapeDecorator;

public class Main {

    public static void main(String[] args) {

        Shape redPoint = new ColoredShapeDecorator(new Point(1, 1), "RED");
        System.out.println(redPoint.isValid());
        redPoint.draw();

        System.out.println();


        Shape paddedLine = new PaddingDecorator(new Line(new Point(0, 0), new Point(0, 2)));

        System.out.println(paddedLine.isValid());
        paddedLine.draw();
        System.out.println();

        Shape greenRectangleWithPadding = new PaddingDecorator(new ColoredShapeDecorator(new Rectangle(new Point(0, 0), new Point(0, 2),
                new Point(7, 2),
                new Point(7, 0)), "GREEN"), 5);

        System.out.println(greenRectangleWithPadding.isValid());
        greenRectangleWithPadding.draw();


    }
}
