package com.zubenko.homework.lesson14.tax;

public class ResidentialProperty extends Property {
    private double subsidy;

    public ResidentialProperty(int square, double taxRate, double subsidy) {
        super(square, taxRate);
        this.subsidy = subsidy;
    }

    @Override
    public void tax() {
        double tax;
        tax = square * taxRate * subsidy;
        System.out.println("Residential property tax is : " + tax + " hryvnia");
    }
}
/*жилая недвижимость*/