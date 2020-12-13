package ru.mirea.practice8.furniture_shop;

public abstract class Furniture {
    protected String color;
    protected double price;
    public String getClassName() {
        String className = this.getClass().getSimpleName();
        return className;
    }
    public String getColor() {
        return color;
    }
    public double getPrice() {
        return price;
    }
}