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
        int size = scanner.nextInt();
        int price = scanner.nextInt();
        int month = 30;
        int perDay = 3;
        int kg = 1000;

        int CatFood = nutritionСalculator(size, perDay, month);
        System.out.println("Cat food requirement per month is " + CatFood * cats / kg + " kg");

        int DogFood = nutritionСalculator(size, perDay, month);
        System.out.println("Dog food requirement per month is " + DogFood * dogs / kg + " kg");

        int PriceShelter = priceСalculator(dogs, cats, perDay, month, price);
        System.out.println("Maintenance of the shelter per month is " + PriceShelter + " in dollars");

    }

    public static int nutritionСalculator(int size, int perDay, int month) {
        return size * perDay * month;
    }

    public static int priceСalculator(int dogs, int cats, int perDay, int month, int price) {
        return (dogs + cats) * perDay * month * price;
    }
}
