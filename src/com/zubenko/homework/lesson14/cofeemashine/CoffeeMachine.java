package com.zubenko.homework.lesson14.cofeemashine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static javax.swing.UIManager.get;

public class CoffeeMachine {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        ArrayList<Drinks> drinks = listDrinks();
        makeFinishOrder(drinks);
        CostCalculate(drinks);

    }

    public static Drinks chooseADrink(TypeDrinks type) {
        return switch (type) {
            case AMERICANO -> new Americano(30);
            case CAPPUCCINO -> new Cappuccino(35);
            case LATTE -> new Latte(40);
            case TEA -> new Tea(20);
        };
    }


    public static ArrayList<Drinks> listDrinks() throws IOException {
        System.out.println("Please enter the desired drink :\nAMERICANO\nCAPPUCCINO\nLATTE\nTEA To exit enter: NO");
        String enter;
        ArrayList<Drinks> listDrinks = new ArrayList<>();
        while (!(enter = READER.readLine()).equalsIgnoreCase("EXIT")) {
            try {
                System.out.println(" What drink would you like? to complete the order, enter : EXIT ");
                listDrinks.add(chooseADrink(TypeDrinks.valueOf(enter)));
            } catch (IllegalArgumentException e) {
                System.out.println("incorrect input");
            }
        }
        return listDrinks;
    }

    public static void CostCalculate(ArrayList<Drinks> drinks) {
        int cost = 0;
        for (Drinks drink : drinks) {
            cost = cost + drink.getPrice();
            System.out.println("The price of is : " + drink.getPrice());
        }
        System.out.println("Total cost of your order: " + cost);
    }

    public static void makeFinishOrder(ArrayList<Drinks> drinks) {
        for (Drinks drink : drinks) {
            drink.makeADrink();
        }
    }

}
