package com.zubenko.homework.algoritmy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindNumberArray {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        int search = readNumber(1,5);
        System.out.println(Arrays.toString(searchArray(array,search)));


            }
public static int[] searchArray(int[] array, int search) {
    for (int i = 0; i < array.length - 1; i++) {
        for (int j = i + 1; j < array.length; j++) {
            if (array[i] + array[j] == search) {
                return new int[]{i, j};
            }
        }
        return new int[]{-1,-1};
    }
    return array;
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
