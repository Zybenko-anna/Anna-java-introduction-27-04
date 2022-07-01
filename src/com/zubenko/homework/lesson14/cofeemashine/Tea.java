package com.zubenko.homework.lesson14.cofeemashine;

public class Tea extends Drinks {
    public Tea(int price) {
        super(price);
    }

    @Override
    public void makeADrink() {
        super.makeADrink();
        System.out.println("The TEA is ready. Grab your drink.");
    }
}
