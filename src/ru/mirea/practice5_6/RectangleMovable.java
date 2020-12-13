package ru.mirea.practice5_6;

public class RectangleMovable extends Rectangle implements Movable {
    public RectangleMovable(Point rightTop, Point leftBottom) {
        super(rightTop, leftBottom);
    }

    @Override
    public void move(int x, int y) {
        ((PointMovable) getLeftBottom()).move(x, y);
        ((PointMovable) getRightTop()).move(x, y);

    }
}