package com.company.classwork.lesson3;

public class PrimitiveTypeTest {

  public static void main(String[] args) {

    int number1 = 1;
    System.out.println("before method call " + number1);
    changeNumber(number1, 100);
    System.out.println("after method call " + number1);


    int number2 = 2;
    System.out.println("before method call " + number2);
    changeNumber(number2, 200);
    System.out.println("after method call " + number2);

    int number3 = number1;
    System.out.println("before method call " + number3);
    changeNumber(number3, 300);
    System.out.println("after method call " + number3);

    System.out.println("in the end: " + number1);

  }

  static void changeNumber(int number, int newValue) {
    System.out.println("in method changeNumber before change " + number);
    number = newValue;
    System.out.println("in method changeNumber after change " + number);
  }

}
