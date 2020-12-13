package ru.mirea.practice8.furniture_shop;

import java.util.ArrayList;
import java.util.Scanner;

public class FurnitureShop {
    ArrayList<Furniture> list;
    Scanner in = new Scanner(System.in);

    public FurnitureShop() {
        list = new ArrayList<Furniture>();

        list.add(new Chair("белый", 190));
        list.add(new Table("черный", 1990));
        list.add(new Chair("черный", 990));
        list.add(new Table("белый", 2490));
        list.add(new Chair("красный", 490));
    }
    public void printCatalog() {
        System.out.println("Каталог:");
        for(int i = 0; i < list.size(); i++) {
            Furniture f = list.get(i);
            System.out.println(String.format("%d. %s %s: %.1f руб.", i+1
                    , f.getColor(), f.getClassName(), f.getPrice()));
        }
        System.out.println("0. Выйти из магазина\n");
    }

    private int getInput() {
        try {
            return in.nextInt();
        } catch(Exception e) {
            in.nextLine();
            return -1;
        }
    }

    public void run() {
        System.out.println("Добро пожаловать в магазин мебели!");
        printCatalog();
        Scanner scan=new Scanner(System.in);
        int k = 0;
        int option = scan.nextInt();
        while(option != 0) {
            if(option < 1 || option > list.size()) {
                System.out.println("\nВыберите ещё раз или нажмите 0, чтобы выйти\n");
                printCatalog();
            } else {
                Furniture f = list.get(option-1);
                list.remove(option-1);
                System.out.println(String.format("\nВы купили %s %s за %.1f руб.\n"
                        , f.getColor(), f.getClassName(), f.getPrice()));
                k++;
                printCatalog();
            }
            option = scan.nextInt();
        }
        if (k!=0) System.out.println("Спасибо за покупку, приходите к нам ещё!");
        else System.out.println("Всего доброго, приходите к нам ещё!");
    }
}
