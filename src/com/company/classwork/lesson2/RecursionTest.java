package com.company.classwork.lesson2;

public class RecursionTest {

  public static void main(String[] args) {
    recursionFunction(5);
  }

  public static void recursionFunction(int number) {

    if (number == 0) {
      return;
    }

    System.out.println(number);
    recursionFunction(number - 1);
  }

  public static void recursionFunction() {
    System.out.println("Привет, Java!");
    recursionFunction();
  }


}
