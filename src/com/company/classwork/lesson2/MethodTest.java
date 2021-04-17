package com.company.classwork.lesson2;

public class MethodTest {

  public static void main(String[] args) {

    print("test");
    print("test2");
    print(1);
    print("test", 2);

  }

  public static void print(String input) {
    System.out.println("---------------------------");
    System.out.println(input);
    System.out.println("---------------------------");
  }

  public static void print(int number) {
    System.out.println("===========================");
    System.out.println(number);
    System.out.println("===========================");
  }

  public static void print(String string, int number) {
    System.out.println("===========================");
    System.out.println(number + string);
    System.out.println("===========================");
  }

}
