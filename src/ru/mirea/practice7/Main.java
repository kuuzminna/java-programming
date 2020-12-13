package ru.mirea.practice7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Plate plate = new Plate(1,10);
        Dish pan = new Pan(20,100);
        //Вычисляем объем тарелки и кастрюли
        pan.calcVolume();
        plate.calcVolume();
        //Выведем объем тарелки и кастрюли
        System.out.println("Volume plate: " + plate.volume);
        System.out.println("Volume pan: " + pan.volume);
        ((Pan)pan).makeBorsh();
        ArrayList<Dish> allDishes = new ArrayList<>();
        allDishes.add(plate);
        allDishes.add(pan);
        Dog oscar = new Bulldog(7, "black");
        Dog sharik = new Poodle(3,"white");
        oscar.voice();
        sharik.voice();
        ((Poodle)sharik).run();
        ArrayList<Dog> allDogs = new ArrayList<>();
        allDogs.add(oscar);
        allDogs.add(sharik);
    }
}