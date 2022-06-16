package com.zubenko.homework.lesson13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HumanCreate {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Enter mother's name");
        Human mother = new Human(READER.readLine());

        System.out.println("Enter dad's name");
        Human father = new Human(READER.readLine());
        System.out.println("Enter the child's name");

        Human human= new Human(READER.readLine(),mother,father);

        System.out.println(human);

    }

}



