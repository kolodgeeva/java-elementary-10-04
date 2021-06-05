package com.company.classwork.lesson8;

import java.util.ArrayList;

public class ArrayListTest {

  public static void main(String[] args) {

    int[] ints = new int[1];
    //ints[1] = 1;
    //ints.length

    ArrayList objects = new ArrayList();
    ArrayList<Long> longs = new ArrayList<>();
    ArrayList<String> strings = new ArrayList<>();

    ArrayList<Integer> integers = new ArrayList<>();
    integers.add(1);

    for (int i = 0; i < ints.length; i++) {
      System.out.println(ints[i]);
    }

    for (int i = 0; i < integers.size(); i++) {
      System.out.println(integers.get(i));
    }

    for (Integer integer: integers) {
      System.out.println(integer);
    }

    integers.forEach(System.out::println);

  }


}
