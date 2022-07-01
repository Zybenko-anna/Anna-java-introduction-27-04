package com.zubenko.homework.lesson14.tax;

import java.util.ArrayList;
import java.util.List;

public class PropertyTax {
    public static void main(String[] args) {
        Property ResidentialProperty = new ResidentialProperty(100, 97.50, 0.8);
        Property RetailProperty = new RetailProperty(15, 97.50, 99);
        Property IndustrialProperty = new IndustrialProperty(50, 97.50);

        List<Property> properties = new ArrayList<>();
        properties.add(ResidentialProperty);
        properties.add(RetailProperty);
        properties.add(IndustrialProperty);

        taxCalculator(properties);
    }

    private static void taxCalculator(List<Property> properties) {
        for (Property property : properties) {
            property.tax();
        }

    }
}


