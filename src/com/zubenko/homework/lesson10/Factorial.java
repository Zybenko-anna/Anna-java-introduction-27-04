package com.zubenko.homework.lesson10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factorial {
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        /*Вычислить факториал числа N с помощью рекурсивной функции
         */
        int number = readNumber();

        //System.out.println(factorial(number) + "!");
        System.out.println(recursive(number) + "!");
    }

    public static int readNumber() {
        System.out.println("input number : ");
        try {
            int number = Integer.parseInt(READER.readLine());
            return number;
        } catch (Exception e) {
            System.out.println("incorrect input");
            return readNumber();
        }
    }

    public static int recursive(int number) {
        int result = 1;
        for (int i = 0; i > 0; i++) {


            if (number == 0) {
                System.out.print(" result = ");
                return result;
            }
            if (number == 1) {
                System.out.print(" * 1 = ");
                return result;
            }

            System.out.print(number);
            if (number != 2) {
                System.out.print(" * ");
                return result;
            }
            if (i < number) {
                result = result * i;
                return result;
            }
            recursive(number);
        }
        return result;
    }

    public static int factorial(int n) {
        int result = 1;

        if (n == 0) {
            System.out.print(" result = ");
            return result;
        }
        if (n == 1) {
            System.out.print(" * 1 = ");
            return result;
        }

        System.out.print(n);
        if (n != 2) {
            System.out.print(" * ");
        }

        result = n * factorial(n - 1);
        return result;
    }

}




