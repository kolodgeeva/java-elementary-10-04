package com.company.classwork.lesson6.animal;

public class Penguin extends Animal {

  public Penguin(String name) {
    super(name);
    System.out.println("Penguin constr");
  }

  @Override
  public void speak() {
    System.out.println("Penguin " + name + " says kra kra kra");
  }

  public void swim() {
    System.out.println("Penguin swims");
  }
}
