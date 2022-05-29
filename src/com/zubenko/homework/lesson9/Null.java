package com.zubenko.homework.lesson9;

import java.util.Arrays;

public class Null {
    public static void main(String[] args) {

        int[] numbers = Lottery.createArrayAndFill(5,0,9);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


    }
}
