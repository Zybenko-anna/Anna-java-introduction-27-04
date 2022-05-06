package com.zubenko.classroom.lesson4;

public class Task1Repetition {
    public static void main(String[] args) {

        double salary1 = 3000;
        double salary2 = 4500;
        double salary3 = 5800;
        int year = 12;
        int period = year * 10;
        double salaryPeriod1 = period * salary1;
        double salaryPeriod2 = period * salary2;
        double salaryPeriod3 = period * salary3;
        System.out.println("salary employee 1 from 10 yars = " + salaryPeriod1);
        System.out.println("salary employee 2 from 10 yars = " + salaryPeriod2);
        System.out.println("salary employee 3 from 10 yars = " + salaryPeriod3);

        double taxRate = 5.0 / 100;

        double sumTax1 = salaryPeriod1 * taxRate;
        double sumTax2 = salaryPeriod2 * taxRate;
        double sumTax3 = salaryPeriod3 * taxRate;

        double netsalary1 = salaryPeriod1 - sumTax1;
        double netsalary2 = salaryPeriod2 - sumTax2;
        double netsalary3 = salaryPeriod3 - sumTax3;

        System.out.println("salary 1 for 10 years after taxes = " + netsalary1);
        System.out.println("salary 2 for 10 years after taxes = " + netsalary2);
        System.out.println("salary 3 for 10 years after taxes = " + netsalary3);

        int numberEmployees = 3;

        double averageSalary = (netsalary1 + netsalary2 + netsalary3) / numberEmployees;
        System.out.println("average salary of all employees for 10 years after taxes is " + averageSalary);


    }

}
