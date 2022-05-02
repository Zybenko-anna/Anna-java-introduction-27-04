package com.zubenko.homework.lesson3;

public class Task1 {
    public static void main(String[] args) {

        double r1 = 1;
        double r2 = 0.5;
        double r3 = 0.2;
        double density = 0.7;

        //V = 4/3πR^3
        Double v1 = 4.0 / 3 * Math.PI * Math.pow(r1, 3);
        Double v2 = 4.0 / 3 * Math.PI * Math.pow(r2, 3);
        Double v3 = 4.0 / 3 * Math.PI * Math.pow(r3, 3);

        //m = pV
        Double m1 = density * v1;
        Double m2 = density * v2;
        Double m3 = density * v3;

        double mGeneral = m1 + m2 + m3;
        System.out.println("weight General = " + mGeneral);


    }
}
