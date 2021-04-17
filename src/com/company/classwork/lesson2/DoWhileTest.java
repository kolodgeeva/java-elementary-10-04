package com.company.classwork.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhileTest {

  public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String input;
    do {
      input = reader.readLine().toLowerCase();

      switch (input) {
        case "monday":
        case "wednesday":
          System.out.println("On mondays, wednesdays we eat healthy");
          break;
        case "friday":
          System.out.println("On friday we go to the party");
          break;
        default:
          System.out.println("We don't know what to do in this input: " + input);
      }
    } while (!input.equals("exit"));

  }

}
