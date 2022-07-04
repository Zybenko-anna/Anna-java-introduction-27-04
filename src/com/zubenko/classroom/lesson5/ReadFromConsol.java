package com.zubenko.classroom.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromConsol {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str;
        str = reader.readLine();
        System.out.println("as string : " + str);

        Double d = Double.parseDouble(str);
        System.out.println(d);

        Integer c = Integer.parseInt(str);
        System.out.println("as int :" + c);



    }
}
