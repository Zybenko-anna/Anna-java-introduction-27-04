package com.zubenko.homework.lesson8;

import java.util.Arrays;

public class Football {

    public static void main(String[] args) {

        int players = 11;
        int[] footballTeam1 = new int[players];
        int[] footballTeam2 = new int[players];
        teamAge(footballTeam1);
        System.out.println("Age of first team players " + Arrays.toString(footballTeam1));
        teamAge(footballTeam2);
        System.out.println("Age of second team players " + Arrays.toString(footballTeam2));

        int averageAgeTeam1 = averageTeamAge(footballTeam1, players);
        int averageAgeTeam2 = averageTeamAge(footballTeam2, players);

        System.out.println("Average age of first team players is " + averageAgeTeam1);
        System.out.println("Average age of second team players is " + averageAgeTeam2);

        comparisonOfTheAverageAgeTeams(averageAgeTeam1, averageAgeTeam2);

    }

    public static void teamAge(int[] footballTeamAge) {
        for (int i = 0; i < footballTeamAge.length; ++i) {
            double randomAge = Math.random();
            int minAgePlayer = 18;
            int maxAgePlayer = 45;
            int age = (int) ((randomAge * (maxAgePlayer - minAgePlayer)) + minAgePlayer);
            footballTeamAge[i] = age;
        }
    }

    public static int averageTeamAge(int[] footballTeamAge, int players) {
        int sumAge = 0;
        int averageTeamAge = 0;
        for (int i = 0; i < footballTeamAge.length; i++) {
            sumAge = sumAge + footballTeamAge[i];
            averageTeamAge = sumAge / players;
        }
        return averageTeamAge;
    }

    public static void comparisonOfTheAverageAgeTeams(int averageAgeTeam1, int averageAgeTeam2) {
        if (averageAgeTeam1 > averageAgeTeam2) {
            System.out.println("The average age of the first team players is greater than the average age of the second team ");
        } else if (averageAgeTeam2 > averageAgeTeam1) {
            System.out.println("The average age of the second team players is greater than the average age of the first team ");
        } else {
            System.out.println("The average age of the players of both teams are equal ");
        }

    }

}



