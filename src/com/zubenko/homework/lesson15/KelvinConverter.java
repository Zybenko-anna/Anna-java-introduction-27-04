package com.zubenko.homework.lesson15;

public class KelvinConverter implements Converter {
    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
