package com.company.classwork.lesson9;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

  public static void main(String[] args) {

    HashMap<String, Integer> map = new HashMap<>();

    map.put("apples", 3);
    map.put("potatoes", 5);
    map.put("bananas", 20);
    map.put("lemons", 1);

    System.out.println(map);

    Integer bananas = map.get("bananas");
    System.out.println(bananas);

    map.put("bananas", 30);

    System.out.println(map.get("bananas"));

    for (Map.Entry<String, Integer> entry: map.entrySet()) {
      System.out.println("key: " + entry.getKey() + ", value=" + entry.getValue());
    }

    System.out.println("Contains apples? " + map.containsKey("apples"));
    System.out.println("Contains tomatoes? " + map.containsKey("tomatoes"));

    System.out.println(map.getOrDefault("tomatoes", 0));

    map.remove("bananas");

    System.out.println(map);

    System.out.println(map.keySet());
    System.out.println(map.values());

  }

}
