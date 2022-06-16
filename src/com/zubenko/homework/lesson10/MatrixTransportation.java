package com.zubenko.homework.lesson10;

import com.zubenko.homework.lesson9.Lottery;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MatrixTransportation {
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        /* Транспонировать матрицу MxN.
Задавать размер матрицы необходимо из консоли.
Значения также получить из консоли
*/
        int lineOriginalArray = readNumber();
        int columnOriginalArray = readNumber();

        int[][] originalMatrix = createAndFillTwoArray(lineOriginalArray, columnOriginalArray);
        System.out.println("Original matrix : ");
        printTwoDimensionalArray(originalMatrix);

        int[][] transposeMatrix = transposeATwoDimensionalArray(originalMatrix, lineOriginalArray, columnOriginalArray);
        System.out.println("Transpose matrix : ");
        printTwoDimensionalArray(transposeMatrix);

    }

    public static int[][] transposeATwoDimensionalArray(int[][] originalTwoArray, int lineOriginalArray, int columnOriginalArray) {
        int[][] transposeTwoArray = new int[columnOriginalArray][lineOriginalArray];
        for (int i = 0; i < transposeTwoArray.length; i++) {
            for (int j = 0; j < transposeTwoArray[i].length; j++) {
                transposeTwoArray[i][j] = originalTwoArray[j][i];
            }
        }
        return transposeTwoArray;
    }

    public static int[][] createAndFillTwoArray(int line, int column) {
        int[][] twoArray = new int[line][column];
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                twoArray[i][j] = readNumber();
            }
        }
        return twoArray;
    }

    public static void printTwoDimensionalArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();

        }
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
}




