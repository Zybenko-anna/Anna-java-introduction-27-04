package com.zubenko.homework.lesson14.cofeemashine;

public class Cappuccino extends Drinks {
    public Cappuccino(int price) {
        super(price);
    }

    @Override
    public void makeADrink() {
        super.makeADrink();
        System.out.println("The CAPPUCCINO is ready. Grab your drink.");
    }
}
