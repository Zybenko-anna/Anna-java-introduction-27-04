package com.zubenko.classroom.lesson3;

public class MathOperations {
    public static void main(String[] args) {

        int a = 10;
        int d = 3;

        int c = a + d;
        System.out.println("a + d = " + c);
        System.out.println("a - d =  " + (a - d));
        System.out.println("a * d =  " + (a * d));
        System.out.println("a / d =  " + (a / d));
        System.out.println("a % d =  " + (a % d));

        System.out.println("a ++ =" + a++);
        System.out.println(a);

        System.out.println("++a = " + ++a);
        System.out.println(a);

        System.out.println("d-- = " + d--);
        System.out.println(d);

        System.out.println("--d = " + --d);
        System.out.println(d);


    }
}
