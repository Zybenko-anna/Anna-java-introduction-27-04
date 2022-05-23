package com.zubenko.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a value to check if a string is a palindrome");
        String palindrome = reader.readLine();
        System.out.println("Result : " + palindromeDefinition(palindrome));
    }
    public static boolean palindromeDefinition(String line) {
        int stringLength = line.length();
        for (int i = 0; i < (stringLength / 2); ++i) {
            if (line.charAt(i) != line.charAt(stringLength - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
