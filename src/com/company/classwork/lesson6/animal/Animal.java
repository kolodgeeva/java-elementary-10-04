package com.company.classwork.lesson6.animal;

public abstract class Animal {

  public static int COUNT;

  protected String name;

  public Animal(String name) {
    this.name = name;
    System.out.println("Animal constr");
    COUNT++;
  }

  public String getName() {
    return name;
  }

  public void eat(String food) {
    System.out.println("Animal(" + this.getClass().getSimpleName() + ") "
        + name + " eats " + food);
  }

  public abstract void speak();

  public static int getAnimalCount() {
    return COUNT;
  }
}
