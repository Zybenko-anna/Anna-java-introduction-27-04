package com.zubenko.homework.lesson4;

import java.util.Scanner;

/*У вас есть 24 собаки и 8 котов. Порция обеда для каждого
животного составляет 50 грамм и стоит 2 доллара. Животные кушают 3 раза в день.
Программа должна посчитать:
Сколько нужно корма для котов в месяц?
Сколько нужно корма для собак в месяц?
Сколько нужно денег в месяц на содержание приюта?
Разделите логику на методы.
Результат вычислений выведите в консоль.
 */
public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of dogs, cats, food serving size, price of a meal");
        int dogs = scanner.nextInt();
        int cats = scanner.nextInt();
        int portionSize = scanner.nextInt();
        int pricePortion = scanner.nextInt();
        int month = 30;
        int perDay = 3;
        int kg = 1000;

        int catFood = nutritionСalculator(portionSize, perDay, month);
        System.out.println("Cat food requirement per month is " + catFood * cats / kg + " kg");

        int dogFood = nutritionСalculator(portionSize, perDay, month);
        System.out.println("Dog food requirement per month is " + dogFood * dogs / kg + " kg");

        int priceShelter = priceСalculator(dogs, cats, perDay, month, pricePortion);
        System.out.println("Maintenance of the shelter per month is " + priceShelter + " in dollars");

    }

    public static int nutritionСalculator(int portionSize, int perDay, int month) {
        return portionSize * perDay * month;
    }

    public static int priceСalculator(int dogs, int cats, int perDay, int month, int pricePortion) {
        return (dogs + cats) * perDay * month * pricePortion;
    }
}
