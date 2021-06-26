package com.company.classwork.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfWeekTest {

  public static void main(String[] args) {

    DayOfWeek day = DayOfWeek.WEDNESDAY;
    System.out.println(day);

    for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
      System.out.println(dayOfWeek);
    }

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Input day of week: ");
    String userInput = null;
    try {
      userInput = reader.readLine();
    } catch (IOException ioException) {
      ioException.printStackTrace();
    }

    DayOfWeek dayOfWeek = DayOfWeek.valueOf(userInput.toUpperCase().trim());
    System.out.println("your day: " + dayOfWeek);

    printSchedule(dayOfWeek);

    System.out.println("Is work day? " + dayOfWeek.isWorkDay());
    System.out.println("Is weekend? " + dayOfWeek.isWeekend());

  }

  private static void printSchedule(DayOfWeek dayOfWeek) {
    switch (dayOfWeek) {
      case MONDAY:
      case TUESDAY:
      case WEDNESDAY:
      case THURSDAY:
      case FRIDAY:
        System.out.println("At " + dayOfWeek + "you work");
        break;
      case SATURDAY:
      case SUNDAY:
        System.out.println("At " + dayOfWeek + "you rest");
        break;
      default:
        System.out.println("No actions for day: " + dayOfWeek);
    }
  }

}
