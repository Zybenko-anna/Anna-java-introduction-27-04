package com.zubenko.homework.lesson11;

import java.util.Objects;

public class CatMain {
    public static void main(String[] args) {
        Cat cat = new Cat("Busya",8, "Medium","Thai" );
        System.out.println(cat);
        Cat cat1= new Cat("Sima", 9);
        System.out.println(cat1);
        Cat cat2= new Cat("Murka",8);
        System.out.println(cat2);
        System.out.println(Objects.equals(cat, cat1));
        System.out.println(Objects.equals(cat, cat2));


    }
}
