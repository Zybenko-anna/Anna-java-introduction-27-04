package com.zubenko.homework.lesson15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConverterTemperature {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        do {
            converterTemperature();
        } while (!(READER.readLine()).equalsIgnoreCase("exit"));
    }

    public static void converterTemperature() throws IOException {

        System.out.println("Input temperature celsius: ");
        double celsiusTemperature = Double.parseDouble(READER.readLine());
        System.out.println("Choose converter: KELVIN or FAHRENHEIT ");
        String input = READER.readLine();
        System.out.println("Convertible temperature = "
                + chooseConverter(TypeConverter.valueOf(input)).convert(celsiusTemperature));
        System.out.println("Type 'exit' or press anything");
    }

    public static Converter chooseConverter(TypeConverter type) {
        return switch (type) {
            case FAHRENHEIT -> new FahrenheitConverter();
            case KELVIN -> new KelvinConverter();
        };
    }
}

