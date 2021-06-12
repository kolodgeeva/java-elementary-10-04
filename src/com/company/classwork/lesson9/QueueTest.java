package com.company.classwork.lesson9;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

  public static void main(String[] args) {

    Queue<String> strings = new PriorityQueue<>();

    strings.add("one");
    strings.add("two");
    strings.add("three");
    //strings.offer("four");

    System.out.println(strings);

    System.out.println(strings.poll());

    System.out.println(strings);

    System.out.println(strings.remove());

    System.out.println(strings);

    System.out.println(strings.element());

    System.out.println(strings);

    System.out.println(strings.peek());

    System.out.println(strings);



  }

}
