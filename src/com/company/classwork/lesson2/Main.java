package com.company.classwork.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    Integer[] numbers = new Integer[5];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = Integer.parseInt(reader.readLine());

      if (numbers[i] % 2 == 0) {
        System.out.println(numbers[i] + " четное");
      } else if (numbers[i] % 5 == 0) {
        System.out.println(numbers[i] + " кратно 5");
      } else if (numbers[i] % 10 == 0) {
        System.out.println(numbers[i] + " кратно 10");
      } else {
        System.out.println(numbers[i] + " не четное");
      }
    }


    String test = "test";
    System.out.println(test.length());

  }

}
