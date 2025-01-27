package it.unibo.shapes.impl;

import it.unibo.shapes.api.Shape;

public class Circle implements Shape {

    private final double radius;

    public Circle(final double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}
