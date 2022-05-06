package com.zubenko.classroom.lesson4;

import java.util.Scanner;

public class Truck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter parameters : length, width, height");

        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int weight = 58;

        int bodyVolume = calculateVolume(length, width, height);
        System.out.println(bodyVolume);

        int totalWeight = calculateTotalWeight(length, width, height, weight);
        System.out.println(totalWeight);
    }

    public static int calculateVolume(int length, int width, int height) {
        return length * width * height;
    }

    public static int calculateTotalWeight(int length, int width, int height, int weight) {
        return length * width * height * weight;
    }
}




