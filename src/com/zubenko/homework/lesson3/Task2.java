package com.zubenko.homework.lesson3;

public class Task2 {
    public static void main(String[] args) {

        //| a- b | / (a + b) ^3 - √c

        double a = 10;
        double b = 2;
        double c = 9;

        double result = Math.abs(a -b) / Math.pow(a + b, 3) -Math.sqrt(c);
        System.out.println(result);

    }
}
