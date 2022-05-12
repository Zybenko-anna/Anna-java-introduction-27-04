package com.zubenko.homework.lesson4;

public class Airliner {
    public static void main(String[] args) {
        /*Авиакомпания изготавливает три типа самолётов:
Истребители - не имеют пассажирских мест
Пассажирские самолёты #1 - имеют места только эконом класса
Пассажирские самолёты #2 - имеют места эконом и бизнесс класса

Нужно сделать три метода с одинаковым названием printAirplaneInfo(),
который будет выводить информацию о самолётах всех трех типов. Это перегруженные. методы

На вход каждый метод будет принимать разное количество параметров:
1. название самолета, тип самолета
2. название самолета, тип самолета, количество мест эконом класса
3. название самолета, тип самолета, количество мест эконом класса, количество мест бизнес класса

Программа должна выводить на экран такой результат (пример):
Тип самолета: Jet, модель: F-22 Raptor,
Тип самолета: Airliner, модель: Aerobus 737, кол. пасажиров эконом класса: 120
Тип самолета: Airliner, модель: Boeing 777, кол. пасажиров эконом класса: 180, пассажиров бизне скласса: 28
*/
        String aircraftType1 = "Jet";
        String aircraftType2 = "Airliner";
        String aircraftType3 = "Fighter";

        String aircraftModel1 = "F-22 Raptor";
        String aircraftModel2 = "Aerobus 737";
        String aircraftModel3 = "Boeing 777";

        int numberSeatsEconomyClass1 = 120;
        int numberSeatsEconomyClass2 = 180;
        int numberSeatBusinessClass = 28;

        printAirplaneInfo(aircraftType1, aircraftModel1);
        printAirplaneInfo(aircraftType2, aircraftModel2, numberSeatsEconomyClass1);
        printAirplaneInfo(aircraftType2, aircraftModel3, numberSeatsEconomyClass2, numberSeatBusinessClass);


    }

    public static void printAirplaneInfo(String type, String model) {
        System.out.println("Aircraft type : " + type + ", model : " + model);
    }

    public static void printAirplaneInfo(String type, String model, int seatsEconom) {
        System.out.println("Aircraft type : " + type + ", model : " + model + ", number of economy class passengers : " + seatsEconom);

    }

    public static void printAirplaneInfo(String type, String model, int seatsEconom, int statsBusiness) {
        System.out.println("Aircraft type : " + type + ", model : " + model + ", number of economy class passengers : " + seatsEconom + ", number of business class passengers : " + statsBusiness);
    }

}
