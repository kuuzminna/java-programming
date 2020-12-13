package ru.mirea.practice7;

public class Bulldog extends Dog{
    public Bulldog(int age, String color) {
        this.age = age;
        this.color = color;
    }
    @Override
    public void voice() {
        System.out.println("Woof");
    }
}
