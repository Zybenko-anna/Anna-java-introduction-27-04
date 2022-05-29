package com.zubenko.homework.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lottery {
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int[] companyNumbers = createArrayAndFillRandom(7);
        int min = 0;
        int max = 9;
        int[] playerNumbers = createArrayAndFill(7, min, max);

        Arrays.sort(companyNumbers);
        Arrays.sort(playerNumbers);
        System.out.println(Arrays.toString(playerNumbers));
        System.out.println(Arrays.toString(companyNumbers));

        int index = 0;
        index = compareArray(companyNumbers, playerNumbers, index);
        System.out.println("number of coincidences : " + index);

    }

    public static int[] createArrayAndFill(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = readNumber(min, max);
        }
        return array;
    }

    public static int readNumber(int min, int max) {
        System.out.println("input number from : " + min + " to " + max);
        try {
            int number = Integer.parseInt(READER.readLine());
            if (number < min || number > max) {
                System.out.println("input must be in range from " + min + " to " + max);
                return readNumber(min, max);
            }
            return number;
        } catch (Exception e) {
            System.out.println("incorrect input");
            return readNumber(min, max);
        }
    }

    public static int[] createArrayAndFillRandom(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }

    public static int compareArray(int[] companyNumbers, int[] playerNumbers, int index) {
        for (int i = 0; i < companyNumbers.length; i++) {
            if (companyNumbers[i] == playerNumbers[i]) {
                index++;
            }
        }
        return index;
    }

}

