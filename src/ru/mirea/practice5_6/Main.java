package ru.mirea.practice5_6;


public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр класса MovablePoint
        PointMovable movablePoint = new PointMovable(5, 5);
        System.out.println(movablePoint);
        movablePoint.move(4,5);
        System.out.println(movablePoint);
        // Создаем экземпляр класса MovableCircle
        CircleMovable movableCircle = new CircleMovable(new PointMovable(10,15),10f);
        System.out.println(movableCircle);
        movableCircle.move(1,6);
        System.out.println(movableCircle);
        // Создаем экземпляр класса MovableRectangle
        RectangleMovable rectangleMovable = new RectangleMovable(new PointMovable(5,5),new PointMovable(3,3));
        System.out.println(rectangleMovable);
        // Двигаем rectangle
        rectangleMovable.move(1, 3);
        System.out.println(rectangleMovable);
    }
}