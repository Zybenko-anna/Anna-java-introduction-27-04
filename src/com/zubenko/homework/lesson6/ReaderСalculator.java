package com.zubenko.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderСalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the first number : ");
        int number1 = Integer.parseInt(in.readLine());
        System.out.println("Enter the sign of the mathematical operation: ");
        char signOperation = in.readLine().charAt(0);
        System.out.println("Enter the second number : ");
        double number2 = Integer.parseInt(in.readLine());

        if (number2 == 0 && signOperation == '/') {
            System.out.println("Invalid operation! Cannot be divided by 0");
            return;
        }
        double result = calculator(number1, signOperation, number2);
        System.out.println("The result of a mathematical calculation is : " + result);

    }

    public static double calculator(int number1, char signOperation, double number2) {
        double result = 0;
        switch (signOperation) {
            case '+' -> result = number1 + number2;
            case '-' -> result = number1 - number2;
            case '*' -> result = number1 * number2;
            case '/' -> result = number1 / number2;
        }
        return result;
    }
}
