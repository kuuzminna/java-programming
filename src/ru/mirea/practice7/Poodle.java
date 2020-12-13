package ru.mirea.practice7;

public class Poodle extends Dog{
    public Poodle(int age, String color) {
        this.age = age;
        this.color = color;
    }
    @Override
    public void voice() {
        System.out.println("Yip");
    }
    public void run()
    {
        System.out.println("Пудель бежит к хозяину");
    }
}
