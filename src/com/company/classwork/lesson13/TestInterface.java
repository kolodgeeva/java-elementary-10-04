package com.company.classwork.lesson13;

public interface TestInterface {

  default void defaultTest() {
    System.out.println("default test");
  }

  void test();

}
