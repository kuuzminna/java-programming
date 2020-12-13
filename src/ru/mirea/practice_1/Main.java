package ru.mirea.practice_1;

        import java.lang.Math;
        import java.util.Random;
        import java.util.Scanner;

public class Main {
    //меню операций
    public static void menu() {
        System.out.print("\n");
        System.out.print("Меню операций: \n" +
                "Введите 0, если хотите выйти из операций\n" +
                "Введите 1, если хотите вычислить сумму элементов целочисленного массива с помощью цикла for\n" +
                "Введите 2, если хотите вычислить сумму элементов целочисленного массива с помощью цикла while\n" +
                "Введите 3, если хотите вычислить сумму элементов целочисленного массива с помощью цикла do while\n" +
                "Введите 4, если хотите вывести на экран аргументы командной строки в цикле for\n" +
                "Введите 5, если хотите вывести на экран первые 10 чисел гармонического ряда\n" +
                "Введите 6, если хотите отсортировать массив, сгенерируемый случайным образом с помощью метода random() класса Math\n" +
                "Введите 7, если хотите отсортировать массив, сгенерируемый случайным образом с помощью класса Random\n" +
                "Введите 8, если хотите вычислить факториал числа\n\n" +
                "Ваш ответ: ");
    }
    //Вычисление суммы элементов целочисленного массива с помощью цикла for
    public static int sum_for() {
        int[] arr = {2, 5, 7, 8, 3, 0};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
    //Вычисление суммы элементов целочисленного массива с помощью цикла while
    public static int sum_while() {
        int[] arr = {2, 5, 7, 8, 3, 0};
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum = sum + arr[i];
            i++;
        }
        return sum;
    }
    //Вычисление суммы элементов целочисленного массива с помощью цикла do while
    public static int sum_do_while() {
        int[] arr = {2, 5, 7, 8, 3, 0};
        int sum = 0;
        int i = 0;
        do {
            sum = sum + arr[i];
            i++;
        }
        while (i < arr.length);
        return sum;
    }
    //Вывод на экран аргументов командной строки в цикле for
    public static void out_args(String[] args)
    {
        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);
    }
    //Вывод на экран первых 10 чисел гармонического ряда
    public static void output_harmonic() {
        double 	h = 1.0;
        System.out.print("Первые 10 чисел гармонического ряда\n");
        for (int i = 1; i <= 10; i++) {
            h = 1.0 / i;
            System.out.format("%.3f%n", h);
        }
    }
    //Сортировка массива пузырьком (по возрастанию)
    public static void bubble_Sort(int[] arr) {
        for (int i = arr.length - 1 ; i > 0 ; i--) {
            for (int j = 0 ; j < i ; j++) {
                if( arr[j] > arr[j + 1] ) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
    //Сортировка массива, сгенеррированного случайным образом целыми числами с помощью метода random() класса Math
    public static void arr_Math() {
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int)(Math.random() * 100);
        System.out.print("Сгенерируемый случайным образом массив:\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
        bubble_Sort(arr);
        System.out.print("Отсортированный массив:\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }
    //Сортировка массива, сгенеррированного случайным образом целыми числами с помощью класса Random
    public static void arr_Random() {
        Random random = new Random();
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.print("Сгенерируемый случайным образом массив:\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
        bubble_Sort(arr);
        System.out.print("Отсортированный массив:\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }
    //Вычисление факториала
    public static int factorial() {
        System.out.print("Введите число для нахождения его факториала : ");
        int	fact = 1;
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        menu();
        int pos;
        Scanner scan = new Scanner(System.in);
        do {
            pos = scan.nextInt();
            switch (pos) {
                case 0:
                    break;
                case 1:
                    System.out.println("Сумма элементов массива = " + sum_for());
                    menu();
                    break;
                case 2:
                    System.out.println("Сумма элементов массива = " + sum_while());
                    menu();
                    break;
                case 3:
                    System.out.println("Сумма элементов массива = " + sum_do_while());
                    menu();
                    break;
                case 4:
                    out_args(args);
                    menu();
                    break;
                case 5:
                    output_harmonic();
                    menu();
                    break;
                case 6:
                    arr_Math();
                    menu();
                    break;
                case 7:
                    arr_Random();
                    menu();
                    break;
                case 8:
                    System.out.println("Факториал заданного числа = " + factorial());
                    menu();
                    break;
                default:
                    System.out.println("Ошибка. Введите данные снова");
                    menu();
                    break;
            }

        }
        while (pos != 0);
    }
}