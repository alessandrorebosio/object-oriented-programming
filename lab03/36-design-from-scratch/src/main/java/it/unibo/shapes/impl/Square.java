package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Square implements Polygon {

    private static final int EDGE = 4;
    private final double l;

    public Square(final double l) {
        this.l = l;
    }

    @Override
    public double getArea() {
        return Math.pow(l, 2);
    }

    @Override
    public double getPerimeter() {
        return l * EDGE;
    }

    @Override
    public int getEdgeCount() {
        return Square.EDGE;
    }

}
