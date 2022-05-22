package com.zubenko.homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarwashFor {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of cars to be washed ");
        int numberOfCars = Integer.parseInt(reader.readLine());

        washingSteps(numberOfCars);
        System.out.println("All cars went through three stages of washing");
    }

    public static void washingSteps(int numberOfCars) {
        for (; numberOfCars > 0; numberOfCars--) {
            latheringStage(numberOfCars);
            washStage(numberOfCars);
            dryStage(numberOfCars);
        }
    }

    public static void latheringStage(int numberOfCars) {
        System.out.println(numberOfCars + " cars pass the soaping stage ");
    }

    public static void washStage(int numberOfCars) {
        System.out.println(numberOfCars + " cars go through the washing phase ");
    }

    public static void dryStage(int numberOfCars) {
        System.out.println(numberOfCars + " cars go through the drying phase ");

    }
}
