package com.zubenko.homework.lesson2;

public class Variable {

  public static void main(String[] args) {

    double a = 1;
    double b = 2;

    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println("a = " + a);
    System.out.println("b = " + b);


  }
}
