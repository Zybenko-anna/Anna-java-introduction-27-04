package com.zubenko.homework.lesson14.tax;

public class Property {
    protected int square;
    protected double taxRate;


    public Property(int square, double taxRate) {
        this.square = square;
        this.taxRate = taxRate;

    }

    public void tax() {
        double tax;
        tax = square * taxRate;

    }
}
