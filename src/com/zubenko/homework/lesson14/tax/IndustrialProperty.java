package com.zubenko.homework.lesson14.tax;

public class IndustrialProperty extends Property {
    public IndustrialProperty(int square, double taxRate) {
        super(square, taxRate);
    }

    public void tax() {
        double tax;
        tax = square * taxRate;
        System.out.println("Industrial property tax is : " + tax + " hryvnia");
    }
}
/*производственная недвижимость*/
