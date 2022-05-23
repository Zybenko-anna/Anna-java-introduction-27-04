package com.zubenko.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) throws IOException {
        int numberOfArrayRows = 20;
        int[] originalArray = new int[numberOfArrayRows];
        enteringValuesIntoStrings(originalArray);
        System.out.println("Original array " + Arrays.toString(originalArray));

        int numberOfArrayRows1 = originalArray.length / 2;
        int numberOfArrayRows2 = originalArray.length / 2;

        int[] array1 = new int[numberOfArrayRows1];
        int[] array2 = new int[numberOfArrayRows2];

        array1 = splittingAnArrayInHalf1(originalArray, array1);
        System.out.println("An array that contains the values of the first half of the original array " + Arrays.toString(array1));

        array2 = splittingAnArrayInHalf2(originalArray, array2);
        System.out.println("An array that contains the values of the second half of the original array " + Arrays.toString(array2));
    }

    public static void enteringValuesIntoStrings(int[] array) throws IOException {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter values to fill rows");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            array[i] = Integer.parseInt(reader.readLine());
        }
    }

    public static int[] splittingAnArrayInHalf1(int[] originalArray, int[] array1) {
        for (int i = 0; i < array1.length; i++) {
            array1[i] = originalArray[i];
        }
        return array1;

    }

    public static int[] splittingAnArrayInHalf2(int[] originalArray, int[] array2) {
        for (int i = array2.length; i < originalArray.length; i++) {
            array2[i - array2.length] = originalArray[i];
        }
        return array2;
    }
}





