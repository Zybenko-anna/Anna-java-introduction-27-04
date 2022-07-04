package com.zubenko.classroom.lesson9;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {

        // int[] numbers = {5, 6, 9, 0, 2, 10, 5, 4};

        int[] numbers1 = new int[1000];
        fill(numbers1);
// показівает за какое время будет итерация . нужно зафиксировать в начале и в конце .
        long start = System.currentTimeMillis();

        //sort(numbers);
        //bubbleSort(numbers1);
        Arrays.sort(numbers1);
        System.out.println(Arrays.toString(numbers1));


        // удобный вывод массива на печать в строку
        long end = System.currentTimeMillis();
        System.out.println("time : " + (end - start));

    }

    public static void fill(int[] numbers1) {
        for (int i = 0; i < numbers1.length; i++) {
            numbers1[i] = (int) (Math.random() * 100);
        }
    }

    // цикл в цикле дает количество оитераций = кол.индексов *кол.индексов (8*8=64))
    //можно менять значение индекса с которого начинать или задать не всю длинну массива, если не требуется, а то
    // может занять много времени на итерацию данного цикла
    private static void sort(int[] numbers1) {
        for (int i = 0; i < numbers1.length; i++) {
            for (int j = 0; j < numbers1.length; j++) {
                if (numbers1[j] > numbers1[i]) {
                    int temp = numbers1[j];
                    numbers1[j] = numbers1[i];
                    numbers1[i] = temp;

                }
            }
        }
    }


    private static void bubbleSort(int[] numbers1) {
        int n = numbers1.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (numbers1[j - 1] > numbers1[j]) {
                    //swap elements
                    temp = numbers1[j - 1];
                    numbers1[j - 1] = numbers1[j];
                    numbers1[j] = temp;
                }

            }
        }
    }

}
