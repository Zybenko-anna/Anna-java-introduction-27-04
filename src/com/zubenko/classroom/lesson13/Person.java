package com.zubenko.classroom.lesson13;

public class Person {
    public static final String DEFAULT_NAME = "Unknown";
    public static int COUNT = 0;

    private String name;
    private int age;

    public  Person(int age) {
        this.name = DEFAULT_NAME;
        this.age = age;
        COUNT++;
    }

    public  Person(String name, int age) {
        this.name = name;
        this.age = age;
        secretAction();
        COUNT++;
    }

    private void secretAction() {
        System.out.println(this.name);
        System.out.println("secret action");
        printCount();
    }

    static void printCount() {
        System.out.println("count " + COUNT);

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person name = " + name + ", age = " + age;
    }

}

