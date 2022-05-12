package com.zubenko.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baggage {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the luggage length parameter: ");
        int length = Integer.parseInt(reader.readLine());

        System.out.println("Enter the luggage height parameter: ");
        int height = Integer.parseInt(reader.readLine());

        System.out.println("Enter the luggage width parameter: ");
        int width = Integer.parseInt(reader.readLine());

        boolean baggage = baggageOptionsCalculator(length, height, width);

        String message = baggage ? "Your luggage passes like hand luggage " : "Your luggage does not pass as hand luggage ";
        System.out.println(message);
    }

    public static boolean baggageOptionsCalculator(int length, int height, int width) {
        if (length <= 55 && height <= 40 && width <= 20) {
            return true;

        } else {
            return length <= 40 && height <= 53 && width <= 22;
        }
    }
}
