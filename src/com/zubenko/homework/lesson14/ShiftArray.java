package com.zubenko.homework.lesson14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ShiftArray {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(originalArray));
        int numberOfShiftPositions = readNumber(1, originalArray.length);
        System.out.println(Arrays.toString(shiftArray2(originalArray, numberOfShiftPositions)));


    }

    public static int[] shiftArray2(int[] originalArray, int numberOfShiftPositions) {
        int meaning = 0;
        for (int i = 0; i < originalArray.length - numberOfShiftPositions; i++) {
            if (originalArray[i + numberOfShiftPositions] <= originalArray.length) {
                meaning = originalArray[i + numberOfShiftPositions];
                originalArray[i] = meaning;
            }
            if (originalArray[i + numberOfShiftPositions] > originalArray.length) {
                meaning = originalArray[i + numberOfShiftPositions];
            }
        }
        return originalArray;
    }


    public static int readNumber(int min, int max) {
        System.out.println("input number from : " + min + " to " + max);
        try {
            int number;
            number = Integer.parseInt(READER.readLine());
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
}

