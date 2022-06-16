package com.zubenko.homework.lesson13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Human {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public final String name;
    private Human mother;
    private Human father;
    public static int number;

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, Human mother, Human father) {
        this.name = name;
        this.mother = mother;
        this.father = father;
    }


    public String toString() {
        return "Information about the human : name :" + name + (mother == null ? ", no mother" : ", mother's name is- " + mother.name) + (father == null ? ", no father" : ", father's name is: " + father.name);
    }
}