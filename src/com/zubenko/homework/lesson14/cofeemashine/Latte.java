package com.zubenko.homework.lesson14.cofeemashine;

public class Latte extends Drinks {
    public Latte(int price) {
        super(price);
    }

    @Override
    public void makeADrink() {
        super.makeADrink();
        System.out.println("The LATTE is ready. Grab your drink.");
    }
}
