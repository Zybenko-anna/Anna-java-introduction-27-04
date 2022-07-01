package com.zubenko.homework.lesson14.cofeemashine;

public class Americano extends Drinks {
    public Americano(int price) {
        super(price);
    }

    @Override
    public void makeADrink() {
        super.makeADrink();
        System.out.println("The AMERICANO is ready. Grab your drink.");
    }
}
