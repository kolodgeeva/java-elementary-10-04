package com.company.classwork.lesson13;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

  public static void main(String[] args) {

    Map<Integer, String> map = new HashMap<>();
    for (int i = 0; i < 10; i++) {
      map.put(i, "number " + i);
    }

    map.put(null, null);

    map.forEach((key, value) -> System.out.println("key = " + key + ", value = " + value));

    map.put(5, "555");

    System.out.println("----------------------");

    map.forEach((key, value) -> System.out.println("key = " + key + ", value = " + value));

    map.putIfAbsent(5, "new 5");

    System.out.println("----------------------");

    map.forEach((key, value) -> System.out.println("key = " + key + ", value = " + value));

    map.computeIfPresent(3, (key, value) -> "new value " + value + " " + key);

    System.out.println("----------------------");

    System.out.println(map.get(3));

  }

}
