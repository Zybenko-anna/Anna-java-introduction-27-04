package com.zubenko.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Estimates {
    public static void main(String[] args) throws IOException {
        /*Выяснить получит ли студент повышенную стипендию, просто стипендию или не получит стипендию вообще
        в зависимости от его оценок.
Пользователь вводит через консоль свои оценки по 5 предметам(любым).
Для повышеной стипендии средний балл должен быть не меньше 10
Для обычной стипендии - не меньше 8
Программа должна вывести на экран средний бал и на какую стипендию может рассчитывать студент.
*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter grades for five subjects : ");
        double grades1 = Integer.parseInt(reader.readLine());
        double grades2 = Integer.parseInt(reader.readLine());
        double grades3 = Integer.parseInt(reader.readLine());
        double grades4 = Integer.parseInt(reader.readLine());
        double grades5 = Integer.parseInt(reader.readLine());
        int numberOfItems = 5;

        if (!isCorrectnessOfEstimates(grades1, grades2, grades3, grades4, grades5)) {
            return;
        }
        double meanScores = averageRating(grades1, grades2, grades3, grades4, grades5, numberOfItems);

        double score = scholarshipСalculator(meanScores);
    }

    public static double averageRating(double grades1, double grades2, double grades3, double grades4, double grades5, int numberOfRatings
    ) {
        return (grades1 + grades2 + grades3 + grades4 + grades5) / numberOfRatings;
    }

    public static double scholarshipСalculator(double meanScores) {
        if (meanScores >= 10 && meanScores <= 12) {
            System.out.println("Your average score - " + meanScores + " and it matches to the increased scholarship ");
        } else if (meanScores < 10 && meanScores >= 8) {
            System.out.println("Your average score - " + meanScores + " and it matches to a regular scholarship ");
        } else if (meanScores < 8 && meanScores > 0) {
            System.out.println("Your average score - " + meanScores + " and it does not correspond to the scholarship ");
        }
        return meanScores;
    }

    private static boolean isCorrectnessOfEstimates(double grades1, double grades2, double grades3, double grades4, double grades5) {
        if (grades1 < 0 || grades2 < 0 || grades3 < 0 || grades4 < 0 || grades5 < 0) {
            System.out.println("Rating entered incorrectly ");
            return false;
        } else if (grades1 > 12 || grades2 > 12 || grades3 > 12 || grades4 > 12
                || grades5 > 12) {
            System.out.println("Rating entered incorrectly ");
            return false;
        }
        return true;
    }
}




