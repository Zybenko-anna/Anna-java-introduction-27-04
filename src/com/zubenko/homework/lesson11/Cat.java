package com.zubenko.homework.lesson11;

import com.zubenko.classroom.lesson11.Dog;

public class Cat {

    String name;
    int age;
    String size;
    String breed;

    public Cat() {
        System.out.println("Cat has been created!");
    }

    public Cat(String name, int age, String size, String breed) {
        this.name = name;
        this.age = age;
        this.size = size;
        this.breed = breed;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Cat{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                ", size='" + this.size + '\'' +
                ", breed='" + this.breed + '\'' +
                '}';
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cat) {
            Cat cat = (Cat) obj;
            return this.size.equals(cat.size) && this.age == cat.age;
        }
        return false;
    }
}

