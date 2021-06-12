package com.company.classwork.lesson9;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ComparatorTest {

  public static void main(String[] args) {

    //Comparator<String> comparator = new StringComparator();
    Comparator<String> comparator = new ReverseStringComparator();
    Queue<String> strings = new PriorityQueue<>(comparator);

    strings.add("test");
    strings.add("test123");
    strings.add("test1");
    strings.add("test66666666666666");
    strings.add("test777777");

    System.out.println(strings);

    System.out.println(strings.poll());
    System.out.println(strings);
    System.out.println(strings.poll());
    System.out.println(strings);
    System.out.println(strings.poll());
    System.out.println(strings);
    System.out.println(strings.poll());
    System.out.println(strings);
    System.out.println(strings.poll());
    System.out.println(strings);

  }

  private static class StringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
      //return o1.length() - o2.length();
      return Integer.compare(o1.length(), o2.length());
    }
  }

  private static class ReverseStringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
      return Integer.compare(o2.length(), o1.length());
    }
  }

}
