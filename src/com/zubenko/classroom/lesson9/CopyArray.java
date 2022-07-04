package com.zubenko.classroom.lesson9;

import java.util.Arrays;

import static com.zubenko.classroom.lesson9.ArraySort.fill;

public class CopyArray {
    public static void main(String[] args) {

        int[] numbers = new int[10];
// fill     взят из класса ArraySort (заполнение массива рандомными числами)
        fill(numbers);
        System.out.println(Arrays.toString(numbers));

        //создали новій массив путем копирования малого массива с увеличением до 20 индексов
        int[] ints = Arrays.copyOf(numbers, 20);
        System.out.println(Arrays.toString(ints));


    }
}
