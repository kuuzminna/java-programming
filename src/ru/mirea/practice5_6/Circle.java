package ru.mirea.practice5_6;

import ru.mirea.practice5_6.Point;

public class Circle {
    protected Point center;
    protected double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle {" +
                "center = " + center +
                ", radius = " + radius +
                '}';
    }
}