package com.company.classwork.lesson9;

import java.util.Stack;

public class StackTest {

  public static void main(String[] args) {

    Stack<Integer> integers = new Stack<>();
    integers.push(1);
    integers.push(2);
    integers.push(3);

    System.out.println(integers);

    System.out.println(integers.pop());

    System.out.println(integers);

    System.out.println(integers.peek());

    System.out.println(integers);


  }

}
