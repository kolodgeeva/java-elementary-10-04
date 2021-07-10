package com.company.classwork.lesson12;

public class Person {

  String name;

  public Person() {
  }

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        '}';
  }
}
