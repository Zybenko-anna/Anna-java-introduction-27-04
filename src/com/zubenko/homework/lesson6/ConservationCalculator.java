package com.zubenko.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConservationCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of apples: ");
        int totalApples;
        totalApples = Integer.parseInt(reader.readLine());
        int applesInALargeJar = 5;
        int applesInAMediumJar = 3;
        int applesInASmallJar = 1;

        int numberLargeJar;
        numberLargeJar = bigJarCalculator(totalApples, applesInALargeJar);
        System.out.println("Big jars : " + numberLargeJar);

        int numberMediumJar;
        numberMediumJar = mediumJarCalculator(totalApples, applesInALargeJar, applesInAMediumJar);
        System.out.println("Medium jars : " + numberMediumJar);

        int numberSmallJar;
        numberSmallJar = smallJarCalculator(totalApples, applesInALargeJar, applesInAMediumJar, applesInASmallJar);
        System.out.println("Small jars : " + numberSmallJar);
    }

    public static int bigJarCalculator(int totalApples, int applesInALargeJar) {
        return totalApples / applesInALargeJar;
    }

    public static int mediumJarCalculator(int totalApples, int applesInALargeJar, int applesInAMediumJar) {
        return (totalApples % applesInALargeJar) / applesInAMediumJar;
    }

    public static int smallJarCalculator(int totalApples, int applesInALargeJar, int applesInAMediumJar, int applesInASmallJar) {
        int bigJar = totalApples / applesInALargeJar;
        int mediumJar = (totalApples - (bigJar * applesInALargeJar)) / applesInAMediumJar;
        int smallJar = (totalApples - (bigJar * applesInALargeJar) - (mediumJar * applesInAMediumJar)) / applesInASmallJar;
        return smallJar;
    }
}


