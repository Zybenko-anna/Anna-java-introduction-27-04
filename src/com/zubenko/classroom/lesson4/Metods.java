package com.zubenko.classroom.lesson4;

public class Metods {

    public static void main(String[] args) {

        // туту методы не создаем
        printMessage();

        generateRandom();
        int number = generateRandom();
        System.out.println(number);

        add(1, 2);
        System.out.println(add(1, 2));

        add(1, 2, 3);
        System.out.println(add(1, 2, 3));

    }

    // создаем методы тут
    public static void printMessage() {
        System.out.println("hello");

    }

    public static int generateRandom() {
        return (int) (Math.random() * 100);
    }

    public static int add(int x, int y) {
        return (x + y);
    }

    public static int add(int x, int y, int z) {
        return (x + y + z);
    }
}
// тут методы не создаем
