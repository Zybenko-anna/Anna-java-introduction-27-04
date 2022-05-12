package com.zubenko.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter any three number : ");
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());

        System.out.println("The minimum number given is : " + minimumNumberCalculator(number1, number2, number3));
    }

    public static int minimumNumberCalculator(int number1, int number2, int number3) {
        int minimumNumber = number1;
        if (number1 > number2) {
            minimumNumber = number2;
        }
        if (number2 > number3) {
            minimumNumber = number3;
        }
        return minimumNumber;
    }
}



