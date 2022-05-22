package com.zubenko.homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mystery {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int userNumber;
        int computerNumber;
        computerNumber = (int) (Math.random() * 10);

        do {
            System.out.println("Enter any integer from 0 to 10 : ");
            userNumber = Integer.parseInt(reader.readLine());
            if (userNumber == computerNumber) {
                System.out.println("You guessed the number : " + userNumber);
            } else {
                System.out.println("You didn't guess the number, please try again ");
            }
        } while (userNumber != computerNumber);
    }
}






