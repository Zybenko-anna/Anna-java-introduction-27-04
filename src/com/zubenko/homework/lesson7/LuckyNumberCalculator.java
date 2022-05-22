package com.zubenko.homework.lesson7;

public class LuckyNumberCalculator {
    public static void main(String[] args) {

        System.out.println("Lucky number calculator : ");
        for (int i = 0; i < 100; i++) {
            if (i == 4 || i == 9 || i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9) {
                continue;
            }

            System.out.println(i);
        }
    }
}
