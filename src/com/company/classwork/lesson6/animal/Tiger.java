package com.company.classwork.lesson6.animal;

public class Tiger extends Animal {

  private int age;

  public Tiger(String name, int age) {
    super(name);
    this.age = age;
  }

  @Override
  public void speak() {
    System.out.println("Tiger " + name + " says rrrrrrrrrr!");
  }
}
