package com.zubenko.homework.lesson14.tax;

public class RetailProperty extends Property {

private int tradingRevenue;
    public RetailProperty(int square, double taxRate, int tradingRevenue) {
        super(square, taxRate);
        this.tradingRevenue=tradingRevenue;
    }

    public void tax() {
        double tax;
        if (tradingRevenue >= 100) {
            tax = square * taxRate;
            System.out.println("Commercial real estate tax is : "+ tax +" hryvnia");
        } else {
            System.out.println("Tax is not charged. Trading revenue is less than 100 hryvnia");
        }
    }
}
/*торговая недвижимость*/