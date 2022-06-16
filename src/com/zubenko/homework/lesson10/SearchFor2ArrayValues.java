package com.zubenko.homework.lesson10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SearchFor2ArrayValues {
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        System.out.println("Set the size of a two-dimensional array :");
        int line = readNumber();
        int column = readNumber();
        System.out.println("Specify the range of numbers to fill the array :");
        int max = readNumber();
        int min = readNumber();
        int[][] array = createAndFillTwoArray(line, column, max, min);
        printTwoDimensionalArray(array);
        findValueInArray(array);


    }

    public static int findValueInArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    System.out.println("The address of the array cell that contains the negative number " + array[i][j] + " is : " + i + j);
                }
            }
        }
        return 0;
    }
    public static int[][] createAndFillTwoArray(int line, int column, int max, int min) {
        int[][] twoArray = new int[line][column];
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                twoArray[i][j] = (int) (Math.random() * (max - min) + min);
            }
        }
        return twoArray;
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

    public static void printTwoDimensionalArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
