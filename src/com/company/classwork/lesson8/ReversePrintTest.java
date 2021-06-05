package com.company.classwork.lesson8;

import com.company.classwork.lesson4.Person;
import java.util.ArrayList;

public class ReversePrintTest {

  public static void main(String[] args) {

    ArrayList<String> strings = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      strings.add("String#" + i);
    }

    printArrayList(strings);
    printReverseArrayList(strings);

  }

  private static void printReverseArrayList(ArrayList<String> strings) {
    for (int i = strings.size() - 1; i >= 0; i--) {
      System.out.print(strings.get(i) + " ");
    }
    System.out.println();
  }

  private static void printArrayList(ArrayList<String> strings) {
    for (String str: strings) {
      System.out.print(str + " ");
    }
    System.out.println();
  }

}
