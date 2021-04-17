package com.company.classwork.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchTest {

  public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String input;
    while (!(input = reader.readLine().toLowerCase()).equals("exit")) {

      printActivityByDay(input);

      String activity = getActivityByDay(input);
      System.out.println(activity);

      System.out.println(getActivityByDay2(input));
    }

  }

  public static void printActivityByDay(String input) {

    switch (input) {
      case "monday":
      case "wednesday":
        System.out.println("On mondays, wednesdays we eat healthy");
        break;
      case "friday":
        System.out.println("On friday we go to the party");
        return;
      default:
        System.out.println("We don't know what to do in this input: " + input);
    }

  }

  public static String getActivityByDay(String input) {

    String activity;
    switch (input) {
      case "monday":
      case "wednesday":
        activity = "On mondays, wednesdays we eat healthy";
        break;
      case "friday":
        activity = "On friday we go to the party";
        break;
      default:
        activity = "We don't know what to do in this input: " + input;
    }

    return activity;

  }

  public static String getActivityByDay2(String input) {
    switch (input) {
      case "monday":
      case "wednesday":
        return "On mondays, wednesdays we eat healthy";
      case "friday":
        return "On friday we go to the party";
      default:
        return "We don't know what to do in this input: " + input;
    }
  }

}
