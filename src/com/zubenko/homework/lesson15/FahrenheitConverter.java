package com.zubenko.homework.lesson15;

public class FahrenheitConverter implements Converter {
    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature * 1.8 + 32;
    }
}
