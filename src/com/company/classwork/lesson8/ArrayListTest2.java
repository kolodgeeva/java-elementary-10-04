package com.company.classwork.lesson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest2 {

  public static void main(String[] args) {

    // create a list
    ArrayList<Integer> integers = new ArrayList<>();

    // fill the list
    for (int i = 1; i <= 10; i++) {
      // add element to the list
      integers.add(i);
    }

    printArrayList(integers);

    integers.add(5, 1000);

    System.out.println("after add to index 5");
    printArrayList(integers);

    integers.set(3, 2000);

    System.out.println("after set to index 3");
    printArrayList(integers);

    integers.remove(7);

    System.out.println("after remove on index 7");
    printArrayList(integers);

    integers.add(0, 777);

    System.out.println("after add on index 0");
    printArrayList(integers);

    System.out.println(integers.contains(777));
    System.out.println(integers.contains(777777));

    Object[] array = integers.toArray();

    List<Object> list = Arrays.asList(array);


  }

  private static void printArrayList(ArrayList<Integer> integers) {
    // print all list elements
    for (Integer number : integers) {
      System.out.print(number + " ");
    }
    System.out.println();
  }

}
