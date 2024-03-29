package ru.mirea.practice5_6;

public class Point {

    protected  int x;
    protected int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    protected void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    protected void setY(int y) {
        this.y = y;
    }



    @Override
    public String toString() {
        return "Point {" +
                "x = " + x +
                ", y = " + y +
                '}';
    }
}