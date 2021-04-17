package com.company.classwork.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContinueTest {

  public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    Integer[] numbers = new Integer[5];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = Integer.parseInt(reader.readLine());

      if (numbers[i] % 2 == 0) {
        System.out.println(numbers[i] + " четное");
        continue;
      }

      System.out.println(numbers[i] + " не четное");

    }

  }

}
