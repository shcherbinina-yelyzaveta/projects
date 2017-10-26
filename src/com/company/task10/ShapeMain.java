package com.company.task10;

import com.company.task10.shape.Circle;
import com.company.task10.shape.Rectangle;
import com.company.task10.shape.Shape;

/**
 * Created by Liza on 23.10.2017.
 */
public class ShapeMain {
    public static void main(String[] args) {
        Shape[] figures = new Shape[4];
        figures[0] = new Circle("yellow", 2.5, 1, 1);
        figures[1] = new Rectangle("blue", 0, 0, 4, 2);
        figures[2] = new Circle("red", 5, 2, 4);
        figures[3] = new Rectangle();
        for (Shape figure : figures) {
            figure.draw();
        }
    }
}
