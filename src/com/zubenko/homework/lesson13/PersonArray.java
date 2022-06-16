package com.zubenko.homework.lesson13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonArray {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Person.numberOfPerson = Person.readNumber(1, 100);
        Person.createPerson(Person.numberOfPerson);

    }

}
