package com.company.classwork.lesson9;

import java.util.HashSet;

public class HashSetTest {

  public static void main(String[] args) {

    HashSet<String> strings = new HashSet<>();

    strings.add("apples");
    strings.add("bananas");

    System.out.println(strings);

    strings.add("bananas");

    System.out.println(strings);

    if (strings.contains("apples")) {
      System.out.println("Apples are here");
    } else {
      System.out.println("no apples");
    }

  }

}
