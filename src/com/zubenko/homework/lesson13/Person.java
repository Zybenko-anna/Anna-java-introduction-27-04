package com.zubenko.homework.lesson13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Person {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static final String[] GENDER = {"male", "feminine"};
    private static final String[] SURNAME_MALE = {"Shevchenko", "Gogol", "Skovoroda", "Franco", "Kotsyubinskiy"};
    private static final String[] SURNAME_FEMININE = {"Kostenko", "Ukrainian", "Zabuzhko", "Matios", "Karpa"};
    public static final String[] NAME_MALE = {"Taras", "Mikolaj", "Gregory", "Ivan", "Mikhaylo"};
    public static final String[] NAME_FEMININE = {"Lina", "Lesya", "Oksana", "Maria", "Irena"};
    public String gender;
    private final String name;
    public int age;
    public int height;
    public int weight;
    public static int numberOfPerson;

    public Person() throws IOException {
        this.gender = GENDER[((int) (Math.random() * GENDER.length))];
        this.name = createNameOfPerson(gender, SURNAME_MALE, SURNAME_FEMININE, NAME_MALE, NAME_FEMININE);
        this.age = (int) (Math.random() * (80 - 17) + 17);
        this.height = (int) (Math.random() * (190 - 150) + 150);
        this.weight = createWeightOfPerson(height);
    }

    public int createWeightOfPerson(int height) {
        int informationWeight = 0;
        {
            if (height >= 150 && height <= 154) {
                informationWeight = (int) (Math.random() * (56 - 43) + 43);
            }
            if (height >= 155 && height <= 159) {
                informationWeight = (int) (Math.random() * (60 - 46) + 46);
            }
            if (height >= 160 && height <= 164) {
                informationWeight = (int) (Math.random() * (64 - 49) + 49);
            }
            if (height >= 165 && height <= 169) {
                informationWeight = (int) (Math.random() * (68 - 52) + 52);
            }
            if (height >= 170 && height <= 174) {
                informationWeight = (int) (Math.random() * (72 - 55) + 55);
            }
            if (height >= 175 && height <= 179) {
                informationWeight = (int) (Math.random() * (77 - 58) + 58);
            }
            if (height >= 180 && height <= 184) {
                informationWeight = (int) (Math.random() * (81 - 62) + 62);
            }
            if (height >= 185 && height <= 190) {
                informationWeight = (int) (Math.random() * (86 - 65) + 65);
            }
            return informationWeight;
        }
    }

    public String createNameOfPerson(String gender, String[] SURNAME_MALE, String[] SURNAME_FEMININE, String[]
            NAME_MALE, String[] NAME_FEMININE) {
        String informationSurname = null;
        String informationName = null;
        if (Objects.equals(gender, "male")) {
            informationSurname = SURNAME_MALE[((int) (Math.random() * SURNAME_MALE.length))];
            informationName = NAME_MALE[((int) (Math.random() * NAME_MALE.length))];
        } else {
            informationSurname = SURNAME_FEMININE[((int) (Math.random() * SURNAME_FEMININE.length))];
            informationName = NAME_FEMININE[((int) (Math.random() * NAME_FEMININE.length))];
        }
        return informationSurname + " " + informationName;
    }

    public static int readNumber(int min, int max) {
        System.out.println("input number from : " + min + " to " + max);
        try {
            int number = Integer.parseInt(READER.readLine());
            if (number < min || number > max) {
                System.out.println("input must be in range from " + min + " to " + max);
                return readNumber(min, max);
            }
            return number;
        } catch (Exception e) {
            System.out.println("incorrect input");
            return readNumber(min, max);
        }
    }

    public static Person[] createPerson(int numberOfPerson) throws IOException {
        Person[] person = new Person[numberOfPerson];
        for (int i = 0; i < person.length; i++) {
            person[i] = new Person();
            System.out.println(i + 1 + " " + person[i]);
        }
        return person;
    }

    @Override
    public String toString() {
        return "Person information : gender : " + gender + ", name : " + name + ", age : " + age + ", height : " + height + " cm, weight :" + weight + " kg";
    }
}
