package ru.mirea.practice7;


public class Plate extends Dish{

    public Plate(int radius, int deep) {
        this.radius = radius;
        this.deep = deep;
    }

    @Override
    public void calcVolume() {
        volume = radius * deep;
    }
}