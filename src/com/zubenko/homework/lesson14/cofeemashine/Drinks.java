package com.zubenko.homework.lesson14.cofeemashine;

public class Drinks {
    protected int price;


    public Drinks(int price) {
        this.price = price;
    }

    public void makeADrink() {
        System.out.println("Your drink is getting ready.");
    }

    public int getPrice() {
        return price;
    }

}
